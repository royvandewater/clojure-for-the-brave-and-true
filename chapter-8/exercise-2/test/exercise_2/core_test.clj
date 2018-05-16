(ns exercise-2.core-test
  (:require [clojure.test :refer :all]
            [exercise-2.core :refer :all]
            [basic_spy.core :refer [create-spy call-count called?]]))

(deftest or-test
  (testing "When given no parameters should return false"
    (is (false? (macro_or))))

  (testing "When given true should return true"
    (is (true? (macro_or true))))

  (testing "When given false should return false"
    (is (false? (macro_or false))))

  (testing "When given false and true should return true"
    (is (true? (macro_or false true))))

  (testing "When the first argument is true, the second should not be evaluated"
    (let [spy (create-spy)]
      (macro_or (constantly true) (spy))
      (is (not (called? spy)))))

  (testing "When given a truthy value and false should return the truthy value"
    (is (= 1 (macro_or 1 nil))))

  (testing "When given a function that returns a truthy value, should only evaluate once"
    (let [spy (create-spy (constantly true))]
      (macro_or (spy) nil)
      (is (= 1 (call-count spy))))))
