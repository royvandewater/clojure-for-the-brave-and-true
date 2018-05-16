(ns exercise-1.core-test
  (:require [clojure.test :refer :all]
            [exercise-1.core :refer :all]
            [basic_spy.core :refer [create-spy called?]]))

(deftest when-valid-test
  (testing "When called with a valid thing"
    (let [spy (create-spy)]
      (when-valid 0 #(= % 0) (spy))
      (is (called? spy))))

  (testing "When called multiple stuff like a do block"
    (let [spy1 (create-spy)
          spy2 (create-spy)]
      (when-valid 0 #(= % 0)
        (spy1)
        (spy2))
      (is (and (called? spy1) (called? spy2)))))

  (testing "When called with an invalid thing"
    (let [spy (create-spy)]
      (when-valid 1 #(= % 0) (spy))
      (is (not (called? spy))))))
