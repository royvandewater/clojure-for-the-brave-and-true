(ns exercise-3.core-test
  (:require [clojure.test :refer :all]
            [exercise-3.core :refer :all]))

(deftest comp-test
  (testing "When created and used"
    (let [c-int (comp :intelligence :attributes)]
      (is (= 1 (c-int {:attributes {:intelligence 1}}))))))

(deftest defattrs-test
  (testing "When called with a function name and a keyword"
    (defattrs c-int :intelligence)
    (is (= 1 (c-int {:attributes {:intelligence 1}}))))

  (testing "When called with two function"
    (defattrs c-int :intelligence
              c-dex :dexterity)
    (let [char {:attributes {:intelligence 1, :dexterity 2}}]
      (is (= 1 (c-int char)))
      (is (= 2 (c-dex char))))))
