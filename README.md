# Setup your environment

You will need to set up an appropriate coding environment on whatever computer
you expect to use for this assignment.
Minimally, you should install:

* [git](https://git-scm.com/downloads)
* [Java (version oraclejdk8 or higher)](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html/)
* [Lucene](http://lucene.apache.org/)
* [Maven](https://maven.apache.org/)
* [Surefire](https://maven.apache.org/surefire/maven-surefire-plugin/)

# Check out a new branch

Before you start editing any code, you will need to create a new branch in your
GitHub repository to hold your work.

1. Go to the repository that GitHub Classroom created for you. You should have received an email/link and you are most probably reading this there. It should look like
`https://github.com/cs4583spring2019/cs-<your-username>`, where
`<your-username>` is your GitHub username. 
[Create a branch through the GitHub interface](https://help.github.com/articles/creating-and-deleting-branches-within-your-repository/).
2. Name your `<branch>` as `lastname_firstname_dev`
2. Clone the repository to your local machine and checkout the branch you
just created. Your command must be similar to :
   ```
   git clone -b <branch> https://github.com/cs4583spring2019/cs-<your-username>.git
   ```

# Write your code

You will implement one function each for each of the 4 qns, Eg:`runQ13a()` inside 
the class `QueryEngine`. These functions should return the documents in the right order (atleast the top 2) , as asked in the question, as Lucene Documents. 
A sample return function is also provided for your reference. 

Also, you **should not edit** these files:
- `runAllTests.sh`
- `.travis.yml`
- `src/test/resources/input.txt`
- `src/test/java/edu/arizona/cs/LuceneTest.java`

**Note: The file `src/test/resources/input.txt` is the input file you must use (or would have started using) as per hw3 guidelines. Please don't edit it.**

Also don’t modify the signature of the query engine function or the
functions that start with `runq1*`:

Eg:
`public QueryEngine(String inputFileFullPath)`

`public List<ResultClass> runQ13a(String[] query) throws java.io.FileNotFoundException,java.io.IOException `


### TL;DR: If you have already started coding, your code should have ideally been returning Lucene documents as results. Now all you have to do is return your results via the respective `runQ1*` class.

# Test your code

Tests have been provided for you in the `src/test/java/edu/arizona/cs/LuceneTest.java` file.
To run all the provided tests, run the ``mvn test`` script from the directory containing `pom.xml`

If your code passes the test case, you will see output like:
```
INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running edu.arizona.cs.LuceneTest
value of doc score is0.0
value of doc score is0.0
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.021 s - in edu.arizona.cs.LuceneTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.486 s
[INFO] Finished at: 2019-03-06T16:21:49-07:00

```

# Submit your code

As you are working on the code, you should regularly `git commit` to save your
current changes locally and `git push` to push all saved changes to the remote
repository on GitHub.

To submit your assignment,
[create a pull request on GitHub](https://help.github.com/articles/creating-a-pull-request/#creating-the-pull-request).
where the "base" branch is "master", and the "compare" branch is the branch you
created at the beginning of this assignment.
Then go to the "Files changed" tab, and make sure that all your changes look as you would expect them
to.
There are test cases that will be run automatically (via., [travis](https://travis-ci.com/))
when a pull request is submitted. 
These are the same as `mvn test`. 
So if your code passed `mvn test` in your machine, 
it’s highly likely that it will pass in github. Nevertheless 
you should make sure that you see a green tick mark or a message 
saying “All Checks Have Passed”. Else close the pull request, fix the errors, and raise another pull request.
**Do not merge the pull request.**

Your instructor will grade the code of this pull request. 
Pull requests submitted after the deadline won’t be considered.

# Grading

Qn1 of this assignment will be graded primarily on their ability to pass the tests that
have been provided to you on github after the pull request.
Assignments that pass all, and with the corresponding code implementing the correct logic, will receive at least 90% of the
possible points.

To get the remaining of the points, the scores you return for all the documents will be checked.
