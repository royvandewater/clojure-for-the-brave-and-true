(ns exercise-1.core-test
  (:require [clojure.test :refer :all]
            [exercise-1.core :refer :all]
            [exercise-1.spy :refer [create-spy called?]]))

(deftest when-valid-test
  (testing "When called with a valid thing"
    (let [spy (create-spy)]
      (when-valid 0 #(= % 0) spy)
      (is (called? spy))))

  (testing "When called with an invalid thing"
    (let [spy (create-spy)]
      (when-valid 1 #(= % 0) spy)
      (is (not (called? spy))))))
