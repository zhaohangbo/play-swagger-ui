#!/bin/bash

sbt 'set test in Test := {}' clean package assembly
