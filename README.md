## sbt resource bug reproduced

Can't get file from resource with `getClass.getResource` in `sbt 1.2.8`.  

Works within Intellij with `toURI` instead of `toExternalForm`.
