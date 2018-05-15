(ns exercise-1.spy-test
  (:require [clojure.test :refer :all]
            [exercise-1.spy :refer :all]))

(deftest spy-test
  (testing "when called"
    (let [my-spy (create-spy)]
      (my-spy)
      (is (true? (:called? (meta my-spy))))))

  (testing "when not called"
    (let [my-spy (create-spy)]
      (is (false? (:called? (meta my-spy)))))))

(deftest called?-test
  (testing "when called"
    (let [my-spy (create-spy)]
      (my-spy)
      (is (true? (called? my-spy)))))

  (testing "when not called"
    (let [my-spy (create-spy)]
      (is (false? (called? my-spy))))))
