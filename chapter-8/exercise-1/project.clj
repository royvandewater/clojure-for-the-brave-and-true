(defproject exercise-1 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [basic-spy "1.0.0"]
                 [proto-repl "0.3.1"]
                 [circleci/rollcage "1.0.0-SNAPSHOT"]]
  :main ^:skip-aot exercise-1.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :plugins [[lein-auto "0.1.2"]])
