# hashcode-java-template

![hash code logo](hashcode.png)

This repository provides a very simple Eclipse project Java template for [Google Hash Code challenges](https://hashcode.withgoogle.com/).

[//]: # (Outline typical tasks required for solving a google hash code challenge)

[//]: # (Outline the execution flow from a high-level point of view)

## Getting Started

Clone this repository and import it into Eclipse by running `File > Import > Existing Projects into Workspace`.

### Prerequisites

Make sure to install the required java sdk and jdk, i.e., version 1.8. The template was developed and tested under java 1.8, however, later java versions should work as well. 

### How to use

1. Implement `Problem` with attributes according to problem statement.
2. Implement `Parser` to parse input files and create a `Problem`-Object.
3. Implement a `Solver`, for example via `SimpleSolver` to solve a `Problem`.
4. Implement `OutputWriter` for correct writing of output from solved `Problem`.
5. Set correct input file names in `Main` and run.
