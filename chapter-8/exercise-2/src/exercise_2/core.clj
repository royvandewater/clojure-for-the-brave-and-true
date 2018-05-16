(ns exercise-2.core)

(defmacro macro_or
  "I don't do a whole lot."

  ([] false)

  ([x] x)

  ([x & next]
   `(let [val# ~x]
     (if val# val# (macro_or ~@next)))))
