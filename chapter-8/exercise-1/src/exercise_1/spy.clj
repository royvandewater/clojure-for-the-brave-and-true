(ns exercise-1.spy)

(defmacro called?
  "Convenience macro for checking if a spy has been called"
  [spy]
  `((:called? (meta ~spy))))

(defn create-spy
  "Create a new spy function"
  []
  (let [n (atom 0)]
    (with-meta
      (fn [& _]
        (swap! n inc)
        nil)
      {:called? (fn [] (> @n 0))})))
