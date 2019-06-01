#!/bin/bash
# This script is supposed to start the rest-api project with profile as a parameter
nohup gradle -PspringProfile=pi bootRun &
