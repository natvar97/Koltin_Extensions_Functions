fun main(args: Array<String>) {

    EducationCaller().exam(Education())
    StudentCaller().exam(Education())
    StudentCaller().exam(Student())
}

open class Education

class Student : Education() {}

open class EducationCaller {

    open fun Education.printEducationInfo() {
        println("Printing Education information from Education Caller class")
    }

    open fun Student.printStudentInfo() {
        println("Printing Student information from Education Caller class")
    }

    fun exam(e: Education) {
        e.printEducationInfo()
    }

}

class StudentCaller : EducationCaller() {

    override fun Education.printEducationInfo() {
        println("Print Education info from Student Caller class")
    }

    override fun Student.printStudentInfo() {
        println("Print Student info from Student Caller class")
    }

}

/*

    -> visibility of extensions functions

        fun main(args: Array<String>) {

            EducationCaller().exam(Education())
            StudentCaller().exam(Education())
            StudentCaller().exam(Student())
        }

        open class Education

        class Student : Education() {}

        open class EducationCaller {

            open fun Education.printEducationInfo() {
                println("Printing Education information from Education Caller class")
            }

            open fun Student.printStudentInfo() {
                println("Printing Student information from Education Caller class")
            }

            fun exam(e: Education) {
                e.printEducationInfo()
            }

        }

        class StudentCaller : EducationCaller() {

            override fun Education.printEducationInfo() {
                println("Print Education info from Student Caller class")
            }

            override fun Student.printStudentInfo() {
                println("Print Student info from Student Caller class")
            }

        }

 */


/*
        -> Extension functions as Member functions

            fun main(args: Array<String>) {

                Exams(Student("Natavar") , 21).studentCenter()

            }

            class Exams(val student: Student , val centerNo : Int) {

                fun printCenterNumber() {
                    print(centerNo)
                }

                fun Student.availableCenter() {
                    print("Name : ")
                    printStudentName()
                    print(", Center Number : ")
                    printCenterNumber()
                }

                fun studentCenter() {
                    student.availableCenter()
                }

            }

            class Student(val name : String) {
                fun printStudentName() {
                    print(name)
                }
            }
 */

/*
       -> companion properties extensions

        fun main(args: Array<String>) {

            MyClass.printCompanion()

        }

        class MyClass {
            companion object {}
        }

        fun MyClass.Companion.printCompanion() {
            println("companion")
        }
 */

/*
       -> extensions properties are also supported by Kotlin

        fun main(args: Array<String>) {

            val list = arrayListOf<Int>(1, 2, 3, 4, 5)
            println(list.lastIndex)

        }

        val <T> ArrayList<T>.lastIndex : Int
            get() = this.size - 1
 */


/*
    -> Nullable Receiver

        fun main(args: Array<String>) {

            val name = null

            println(name.toString())
        }

        fun Any?.toString() : String {
            if (this == null) return "null"

            return toString()
        }
 */


/*
    * Function with same name but if one is class method and another is extension
      function then no problem about implementation if function parameters are
      different.

      fun main(args: Array<String>) {

            Example().printFunctionType(1)
            Example().printFunctionType()

        }

        class Example {
            fun printFunctionType() {
                println("class Method")
            }
        }

        fun Example.printFunctionType(id : Int) {
            println("Extension Functions")
        }
 */


/*
        * extend the class

        open class Shape

        class Rectangle : Shape()

        fun Shape.getName() = "Shape"

        fun Rectangle.getName() = "Rectangle"

        fun main(args: Array<String>) {

            printClassName(Shape())
            printClassName(Rectangle())

        }

        fun printClassName(shape: Shape) {
            println("Class Name : ${shape.getName()}")
        }

 */


/*
        **extend the MutableList**

            fun main(args: Array<String>) {
                val list = mutableListOf<Int>(1, 2, 3)
                for (item in list) {
                    println(item)
                }

                list.swap(1,2)
                for (item in list) {
                    println(item)
                }
             }

             * fun MutableList<Int>.swap(index1: Int, index2: Int) {
                    val temp = this[index1]
                    this[index1] = this[index2]
                    this[index2] = temp
                }

 *      for generics types it available for any type of datatype

 *      fun <T> MutableList<T>.swap(index1 : Int , index2: Int) {
            val temp = this[index1]
            this[index1] = this[index2]
            this[index2] = temp
        }
 *
 *
 *
 * */

