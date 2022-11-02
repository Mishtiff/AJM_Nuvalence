# Overview
This project is a single runnable application that takes in 2 rectangles and outputs the relationship between them.
Java.Rectangle was used as a baseline for the Rectangle object. RectangleExt extends this object to implement the
adjacent() function. Adjacency is checked on both Rectangles to ensure the correct value is found.
JUnit is used for the testing framework.

# Build project:
`gradlew clean build`

# Test project:
`gradlew clean test`

# Run Gradle:
`gradlew run -Pargs="1,1,1,1 2,2,2,2"`

# Run jar:
`java -jar build/libs/AJM_Nuvalence.jar "1,2,3,4" "4,3,2,1"`


#Project args:
- Rectangle1 = `1,1,1,1`
- Rectangle2 = `2,2,2,2`
- Rectangle parameters: "x, y, width, height";
- Rectangle parameters are separated by commas`","`
- Rectangle1 and Rectangle2 parameters separated by a space `" "`