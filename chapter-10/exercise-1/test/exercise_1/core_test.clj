(ns exercise-1.core-test
  (:require [clojure.test :refer :all]
            [exercise-1.core :as atomic]))

(deftest atomic-test
  (testing "When instantiated, should be 0"
    (let [a (atomic/create)]
      (is (= 0 (:value @a)))))

  (testing "When functionaly incremented, should be 1"
    (let [a (atomic/create)
          b (atomic/inc-value a)]
      (is (= 0 (:value @a)))
      (is (= 1 (:value @b)))))

  (testing "When incremented, should be 1"
    (let [a (atomic/create)]
      (atomic/inc-value! a)
      (is (= 1 (:value @a))))))
