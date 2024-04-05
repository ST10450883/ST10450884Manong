# ST10450884Manong
IMAD Assignment
1.Purpose
The Historical app I created using Android Studio is an app that asks for your age and if the age is the same as some historical figures I know about, then the result view will display their names and what they were famous for or if the age doesn't match any historical figure I know about it will display “Nobody known to me died at this age”. The purpose of the app is to input any age between 20-100 to see the results of which famous person l know who has passed away at that age. The app can be used by any person who is interested in learning about some historical figures who passed away at a certain age. The app will help the user to learn about various kinds of historical figures whether the person was a footballer, scientist, president etc. To be more specific the app is for someone who is bored and does not know what to do for the time being, they could open the app and just guess ages randomly and see the output so they could learn about iconic people who have passed away at a certain age. The app is created for entertainment and educational purposes, anyone who is bored and is looking for something he/she could be busy with can use the app by guessing ages randomly and seeing the output. Educational you learn certain people who were famous but passed away at certain age, some people you might know but the others might be new to you which can be seen as something educational. The app has no age restriction and anyone who is interested in it can use it to pass time. 

2. Design Considerations
The design of the app is easy to follow because you start from the top to the bottom which many users expect the app to work like that since many apps work like that. The elements added to the app are not a lot so that the user doesn't get confused while using the app, there are only 3 things that the user is required to type or press which is to type the age, press the compare button to view the information or press the clear button to clear the age and text view.

The app runs smoothly, and it is user friendly to interact with it, anyone can be able to insert the input because of how straight forward the app is. The app consists of the name of the app at the top, an image which displays something historical, age text view where you insert any whole number from 20 to 100 to get the output, 2 buttons a clear button and a compare button. A clear button is used to remove the information in the result text view and age edit text, the compare button is used see the output of the program after entering the input the after what followers at the end of the document is the result text view which is where the output information is previewed to the user after entering any input

The app is also thoroughly checked for errors that might pop up inside the app and I can assure you that there is no error that is going to happen.  If you are having any trouble with the app, you can check the youtube video I created which shows all the basics of how the app works. You can access the link at the bottom of the document, just below the reference list.

 The font of the app is clearly visible, and the text size is not too large and is not too small. It is decent for a user to be able to read it, there is not any stylish font just a normal and formal font so that the user can easily see the information. The elements are grouped well, there is enough space between the clear and compare button and the whole app is spaced well to ensure that the words are not crowded with too much space on them. The buttons can easily be reached by the user because as I said from the sentence before this one, the elements are all grouped well. I placed the picture on top of the app so it can be the second thing the user sees after seeing the name of the app, I chose the picture because it is very stylish and may catch the user's attention by the color and make the user want to know what kind of historical people will the app be about because of how little information the image gives. The image is big enough so that the user can see it easily and can attract the user's attention from the start of the program.

 

3.Github and Github actions
Github url:ST10450883/ST10450884Manong: IMAD Assignment (github.com)
Manual Testing:
import org.junit.Assert.*
import org.junit.Test

class MyUnitTest {

 @Test
 fun testWhenStatement() {
 val result = when (25) {
 96 -> "Queen Elizabeth II was famous because of the reigning British monarch; she has been the longest-reigning monarch since " +
 "ascended to the throne in 1952 surpassing Queen Victoria's record in 2015."

 78 -> "Mahatma Gandi was famous for his nonviolent resistance. He is renowned influential leader known for his philosophy of nonviolent " +
 "resistance played a pivotal role in India's independence movement against British rule."

 32 -> "Alexander the Great was famous for his military tactics and strategy. He was a brilliant military strategist, he utilized innovative tactics" +
 " and combined arms warfare including infantry, cavalry, and siege engines to defeat numerically superior forces."

 else -> "Nobody famous known to me died at this age"
 }

 assertEquals("Nobody famous known to me died at this age", result)
 }
}

Automated Testing:
name: Run Tests
 on: [push]
 jobs:
  test:
    runs-on: ubuntu-latest
 
    steps:
      - name: Set up JDK
        uses: actions/setup-java@v2
        with:
          distribution: 'adopt'
          java-version: '11'
 
      - name: Check out code
        uses: actions/checkout@v2
 
      - name: Build and test
        run: ./gradlew test

Automated Build:

name: Build APK
 
on: [push]
 
jobs:
  build:
    runs-on: ubuntu-latest
 
    steps:
      - name: Set up JDK
        uses: actions/setup-java@v2
        with:
          distribution: 'adopt'
          java-version: '11'
 
      - name: Check out code
        uses: actions/checkout@v2
 
      - name: Build APK
        run: ./gradlew assembleDebug

4.Link to Youtube video

https://youtu.be/3z0YHPtSlzA?si=wM3IJ-I6jzaAq0gL

5.Referencing list
Cox, D.A. 2011. Galois theory

Collopy, M. 2016. Works of love are works of peace: Mother Teresa of Calcutta and the missionaries of charity.

Dalton, D. 2012. Mahatma Gandhi: nonviolent power in action.

Doehler, S. 2021. A hero’s journey: the monomythical narrative of Diego Maradona’s World Cup appearances.

Englund, L. and Englund, L., 2021. Rewriting the Legacy of Nelson Mandela: The Memoirs of Ndileka Mandela, Zoleka Mandela, and Ndaba Mandela. South African Autobiography as Subjective History: Making Concessions to the Past, pp.175-202.
Mazullo, M. 2000. The man whom the world sold: Kurt Cobain, rock's progressive aesthetic, and the challenges of authenticity. The Musical Quarterly, 84(4): 713–749.

Marr, A., 2011. The diamond queen: Elizabeth II and her people. Pan Macmillan.

Olsen, J.A. and Gray, C.S. 2011. The practice of strategy: from Alexander the Great to the present

Ponting, I. 2012. George Best.

Weinberg, G.L. 1980. The foreign policy of Hitler's Germany: starting World War II
