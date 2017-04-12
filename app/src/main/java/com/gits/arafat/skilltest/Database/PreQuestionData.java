package com.gits.arafat.skilltest.Database;

/**
 * Created by Arafat on 11/04/2017.
 */

public class PreQuestionData {
    private String preSql="INSERT INTO `question` (`id`, `question`, `optionA`, `optionB`, `optionC`, `optionD`, `correctAns`, `categoryId`, `subCategoryId`) VALUES ";
    public String[] getQuestionInsertText(){
        String[] sql=new String[2];
        /*sql[0]=preSql+"(1, 'Which one of the four is least like the other three?', 'BEAR', 'SNAKE', 'COW', 'DOG', 'B', 1, 0),\n" +
                "(2, 'If you rearrange the letters \"BARBIT\", you would have the name of a.', 'OCEAN', 'COUNTRY ', 'ANIMAL', 'STATE', 'C', 1, 0),\n" +
                "(3, 'Which one of the four is least like the other three?', 'POTATO          ', 'CORN', 'BEAN ', 'APPLE', 'D', 1, 0),\n" +
                "(4, 'Which one of the four makes the best comparison?\\nBrother is to sister as niece is to:\\n', 'MOTHER          ', 'DAUGHTER', 'NEPHEW ', 'UNCLE', 'C', 1, 0),\n" +
                "(5, 'Which one of the four makes the best comparison?\\nMilk is to glass as letter is to:\\n', 'ENVELOPE    ', 'STAMP ', 'PEN', 'MAIL    ', 'A', 1, 0),\n" +
                "(6, 'Which one of the four makes the best comparison?\\nTree is to ground as chimney is to:\\n', 'SMOKE       ', 'HOUSE    ', 'GARAGE', 'SKY ', 'B', 1, 0),\n" +
                "(7, 'Which one of the four is least like the other three?', 'TOUCH          ', 'TASTE', 'HEAR', 'SMILE ', 'D', 1, 0),\n" +
                "(8, 'Which one the four is least like the other three?', 'STOCKING            ', 'PURSE', ' SHOE ', 'DRESS', 'B', 1, 0),\n" +
                "(9, 'Which number should come next in the series?\\n1 - 1 - 2 - 3 - 5 - 8 - 13', '8', '13', '21', '26', 'C', 1, 0),\n" +
                "(10, 'Which one of the four choices makes the best comparison?\\n\\nPEACH is to HCAEP as 46251 is to:', '15264', '51462', '12654', '26451', 'A', 1, 0),\n" +
                "(11, 'Mary, who is sixteen years old, is four times as old as her brother. How old will Mary be when she is twice as old as her brother?', '20', '24', '25', '26', 'B', 1, 0),\n" +
                "(12, 'Which one of the numbers does not belong in the following series?\\n\\n2 - 3 - 6 - 7 - 8 - 14 - 15 - 30', 'EIGHT', 'NINE', 'TEN', 'THIRTY', 'A', 1, 0),\n" +
                "(13, 'Which one of the four choices makes the best comparison?\\n\\n\\nFinger is to Hand as Leaf is to:\\n', 'Twig', 'Tree', 'Branch', 'Blossom', 'A', 1, 0),\n" +
                "(14, 'If you rearrange the letters \"CIFAIPC\" you would have the name of a(n):', 'City', 'River', 'Ocean', 'Country', 'C', 1, 0),\n" +
                "(15, 'Choose the number that is 1/4 of 1/2 of 1/5 of 200:', '2', '5', '10', '50', 'B', 1, 0),\n" +
                "(16, 'Choose the word most similar to \"Trustworthy\":', 'Reliable', 'Insolent', 'Relevan', 'Tenacity', 'A', 1, 0),\n" +
                "(17, 'If you rearrange the letters \"LNGEDNA\" you have the name of a(n):', 'COUNTRY', 'CITY', 'STATE', 'ANIMAL', 'A', 1, 0),\n" +
                "(18, 'Which one of the numbers does not belong in the following series?\\n\\n\\n1 - 2 - 5 - 10 - 13 - 26 - 29 - 48', '5', '26', '29', '48', 'D', 1, 0),\n" +
                "(19, 'Ralph likes 25 but not 24; he likes 400 but not 300; he likes 144 but not 145. Which does he like:', '50', '1000', '1500', '1600', 'D', 1, 0),\n" +
                "(20, 'Which one of the following things is the least like the others?', 'Novel', 'Flower', 'Statue', 'Painting', 'B', 1, 0),\n" +
                "(21, 'FFC stands for-', 'Foreign Finance Corporation', 'Film Finance Corporation', 'Federation of Football Council', 'None of the above', 'B', 2, 0),\n" +
                "(22, 'Which number should come next? 144 121 100 81 64 ?', '54', '43', '49', '41', 'C', 1, 0),\n" +
                "(23, 'Divide 30 by half and add ten. What do you get?', '70', '20', '10', '25', 'A', 1, 0),\n" +
                "(24, 'If you had only one match and entered a COLD and DARK room, where there was an oil heater, an oil lamp and a candle, which would you light first?', 'Oil heater', 'Candle', 'Oil lamp', 'Match', 'D', 1, 0),\n" +
                "(25, 'Take 2 apples from 3 apples. What do you have?', ' 1 apple', ' 2 apples', ' 3 apples', ' 4 apples', 'B', 1, 0),\n" +
                "(26, 'A boy is 4 years old and his sister is three times as old as he is. When the boy is 12 years old, how old will his sister be?', '19', '30', '20', 'Impossible to determine', 'C', 1, 0),\n" +
                "(27, 'What number is one half of one quarter of one tenth of 800?', '20', '10', '15', '12', 'B', 1, 0),\n" +
                "(28, 'Which one of the four choices makes the best comparison? LIVED is to DEVIL as 6323 is to:', '3236', '6332', '2363', '3263', 'A', 1, 0),\n" +
                "(29, 'John likes 400 but not 300; he likes 100 but not 99; he likes 2500 but not 2400. Which does he like?', '1800', '200', '900', '600', 'C', 1, 0),\n" +
                "(30, 'NASA received three messages in a strange language from a distant planet. The scientists studied the messages and found that \"Necor Buldon Slock\" means \"Danger Rocket Explosion\" and \"Edwan Mynor Necor\" means \"Danger Spaceship Fire\" and \"Buldon Gimilzor Gondor\" means \"Bad Gas Explosion\". What does \"Slock\" mean?', 'Explosion', 'Danger', 'Gas', 'Rocket', 'D', 1, 0),\n" +
                "(31, 'A farmer had 17 sheep. All but 8 died. How many live sheep were left?', '9', '8', '17', '10', 'B', 1, 0),\n" +
                "(32, 'Who was the first man on the moon?', 'Lance Armstrong', 'George Washington', 'Neil Armstrong', ' My mom', 'C', 2, 0),\n" +
                "(33, 'What year was NASA founded?', '1958', '1968', '2009', '2003', 'A', 2, 0),\n" +
                "(34, 'How many continents are there on Earth?', '20', '7', '50', 'over 100', 'B', 2, 0),\n" +
                "(35, 'You are participating in a race. You''ve just passed the second person. What position are you now in?', '1st', '2nd', '3rd', '4th', 'B', 1, 0),\n" +
                "(36, 'Who was the first Prime minister of Bangladesh?', 'Syed Nazrul Islam', 'Tajuddin Ahmed', 'Sheikh Mujibur Rahman', 'Arshad', 'B', 2, 0),\n" +
                "(37, 'There are ___ divisions in Bangladesh.', '6', '7', '8', '9', 'B', 2, 0),\n" +
                "(38, 'What part of speech is \"ultramundane\", meaning \"pertaining to supernatural things or to another life\"?', 'Adjective', 'verb', 'noun', 'adverb', 'A', 3, 0),\n" +
                "(39, 'What part of speech is \"umbrage\", meaning \"a sense of injury\"?', 'adjective', 'verb', 'adverb', 'noun', 'D', 3, 0),\n" +
                "(40, 'What part of speech is \"unanimous\", meaning \"sharing the same views or sentiments\"?', 'adjective', 'verd', 'adverb', 'noun', 'A', 3, 0),\n" +
                "(41, 'What part of speech is \"unbearable\", meaning \"unendurable\"?', 'adjective', 'verb', 'adverb', 'noun', 'A', 3, 0),\n" +
                "(42, 'What part of speech is \"unconscious\", meaning \"not cognizant of objects, actions, etc\"?', 'verb', 'adjective', 'noun', 'adverb', 'B', 3, 0),\n" +
                "(43, 'A', 'exiles', 'immigrants', 'emigrants ', 'entrants', 'B', 3, 0),\n" +
                "(44, 'Tell your brother to come........because it?s going rain in a minute or two.', 'indoors ', 'outdoors ', 'within', 'homewards', 'A', 3, 0),\n" +
                "(45, 'The use of plastics for shoes.........of leather has ruined shoe repairing as a business.', 'although ', 'as well ', 'instead ', 'outside', 'C', 3, 0),\n" +
                "(46, 'Where do you........going for your holidays this year?', 'intend ', 'guess', 'expect   ', 'pretend  ', 'A', 3, 0),\n" +
                "(47, 'I?m sorry I?m late, I was held up in a traffic........', 'block ', 'group', 'jam ', 'crush ', 'C', 3, 0),\n" +
                "(48, 'He hit the other boxer so hard that he broke his lower.......', 'chin ', 'shoulder ', 'wrist ', ' jaw', 'D', 3, 0),\n" +
                "(49, 'Her mother had asked her to do several.........before she went out .', ' labours  ', 'works ', 'travels ', 'jobs', 'D', 3, 0),\n" +
                "(50, 'When he makes a.......by car, he takes his family with him.', 'course ', 'voyage ', 'passage', 'journey', 'D', 3, 0);";


        sql[1]=preSql+"(51, 'I can?t advise you what to do: you must use your own.......', 'guesswork', 'justice', 'judgement ', 'ideal', 'C', 3, 0),\n" +
                "(52, 'Because of the poor harvest, wheat prices have........in the last six months.', 'added ', 'jumped ', 'amounted ', 'gathered', 'B', 3, 0),\n" +
                "(53, 'You couldn?t any secrets even for an hour in that llttle town.', ' keep   ', 'get', 'learn ', 'hear', 'A', 3, 0),\n" +
                "(54, 'The police had to.......the crow   .', 'keep ? to   ', 'keep ? under ', 'keep ? back ', 'keep ? on', 'C', 3, 0),\n" +
                "(55, 'I should like to........touch with old friends but I have so little time.', 'be out of  ', 'be in ', 'keep in', 'lose', 'C', 3, 0),\n" +
                "(56, 'Shut the window and.......the cold ........', ' keep ? in  ', 'keep ? out', 'keep ? down  ', 'keep ? behind', 'B', 3, 0),\n" +
                "(57, 'You can........your shorthand ability by taking notes in shorthand during lectures.', ' keep on ', 'keep in', 'keep up ', 'keep back', 'C', 3, 0),\n" +
                "(58, 'The room was so quiet that she could hear the..........of her heart.', 'beating ', 'striking', 'knocking', 'tapping ', 'A', 3, 0),\n" +
                "(59, 'I cannot undo the........in this piece of string.', ' bunch', 'lock', 'knot ', ' tie', 'C', 3, 0),\n" +
                "(60, '............of money prevented us from taking a holiday this year.', 'Limit   ', 'Emptiness ', ' Freeze ', 'Lack', 'D', 3, 0),\n" +
                "(61, 'It was the longest film I?ve ever seen; it........four hours.', 'ended ', 'stayed', ' lasted', 'finished ', 'C', 3, 0),\n" +
                "(62, 'It is time to.......the table for dinner.', 'place ', 'lay', 'lay out', ' put out', 'B', 3, 0),\n" +
                "(63, 'After driving for five hours, the driver pulled into.......for a rest.', ' a bypass ', 'a flyover ', 'a lay-by', 'a roundabout', 'C', 3, 0),\n" +
                "(64, 'The guide is.........a line of tourists through the narrow passage with the help of his torch.', 'conducting  ', 'bringing  ', 'leading ', 'guiding', 'C', 3, 0),\n" +
                "(65, 'She tried to.........out of the window to see the procession more clearly.', 'bend ', 'bow ', 'curve ', 'lean', 'D', 3, 0),\n" +
                "(66, 'She came to England for a year in order to the language.', 'know ', 'become  ', 'refresh ', 'learn', 'D', 3, 0),\n" +
                "(67, 'I?m sorry but what he thinks is not of the.........importance to me.', 'merest   ', 'lowest   ', 'worst   ', 'least', 'D', 3, 0),\n" +
                "(68, 'The children played in the park while their mother..........', 'looked at', 'looked on', 'looked over', 'looked round', 'B', 3, 0),\n" +
                "(69, 'The police must now.........escaped convict in the surrounding counties.', ' search  ', 'look for', 'look after', 'investigate', 'B', 3, 0),\n" +
                "(70, 'As he had no friends or relatives in the town, the traveller tried to find a.........somewhere.', ' lodge  ', 'landing   ', 'lodging   ', 'stay', 'C', 3, 0),\n" +
                "(71, 'There is a 20 minute parking.........here, so we must get back to the car very quickly.', ' freedom', 'limit', 'allowance', 'ability', 'D', 3, 0),\n" +
                "(72, 'A long line of traffic had to wait at the..........until the train had passed.', ' drawbridge ', 'level crossing', 'junction', 'subway', 'B', 3, 0),\n" +
                "(73, 'You should have your eyes tested every year in case the.........of your spectacles need changing.', ' glasses ', 'panes ', ' lenses ', 'prisms', 'C', 3, 0),\n" +
                "(74, 'He offered to..........her a hand as the suitcase was too heavy for her to carry.', 'lend  ', 'show', 'loan   ', 'borrow', 'A', 3, 0),\n" +
                "(75, 'Peter begged his neighbor to.........him five pounds until the weekend.', ' lend ', 'supply', 'provide', 'hiver', 'A', 3, 0),\n" +
                "(76, 'If the boy had the dog alone it wouldn?t have bitten him.', ' set ', 'left   ', 'put   ', 'had', 'B', 3, 0),\n" +
                "(77, 'Are you going to attend Dr Barker?s........on ?Brain Electronics? tomorrow?', 'conference  ', 'lecture ', 'meeting   ', 'discussion', 'B', 3, 0),\n" +
                "(78, 'She looked everywhere for her book but.........had to return home without it.', 'lastly ', 'at the end', 'in the end', 'at the last', 'C', 3, 0),\n" +
                "(79, 'The businessman proved to be an apparently well-behaved........middle-aged man.', ' offensive ', 'unoffending', 'inoffensive   ', 'innocent', 'C', 3, 0),\n" +
                "(80, 'The local tourist bureau will send you.........about hotels in the area.', ' knowledge', 'information', 'news', 'notice', 'B', 3, 0),\n" +
                "(81, 'Sally married..........the Kennedy family.', ' with ', 'to', 'into   ', 'among', 'C', 3, 0),\n" +
                "(82, 'The boy?s allergy to dust caused his skin to........', ' itch ', 'rub ', 'blemish', 'flush', 'A', 3, 0),\n" +
                "(83, 'He has always gone.........strange hobbies like collecting bottle-tops and inventing secret codes.', ' into', 'by   ', 'in for', 'through', 'C', 3, 0),\n" +
                "(84, 'Violent programmers on television may have a bad........on children.', 'affection   B. C. D.  ', 'pressure   ', 'influence   ', 'control', 'C', 3, 0),\n" +
                "(85, 'Tell your brother to come........because it?s going rain in a minute or two.', ' indoors', 'outdoors ', 'within   ', 'homewards', 'A', 3, 0),\n" +
                "(86, 'We paid the shopkeeper.........cash.', 'in   ', 'with', 'by   ', 'on   ', 'A', 3, 0),\n" +
                "(87, 'The judge said that he was...........by the high standards of performance by the riders.', 'excited ', 'impressed ', 'interested', 'imposed', 'B', 3, 0),\n" +
                "(88, 'You can.........my surprise when I heard the news.', 'suppose ', 'think  ', 'imagine   ', 'believe', 'C', 3, 0),\n" +
                "(89, 'HTML is what type of language ? ', 'Scripting Language ', 'Programming Language', 'Markup Language', 'Network Protoco', 'C', 4, 0),\n" +
                "(90, 'Fundamental HTML Block is known as', 'HTML Body ', ' HTML Tag', 'HTML Attribute', 'HTML Element', 'B', 4, 0),\n" +
                "(91, 'Apart from <b> tag, what other tag makes text bold ? ', '<fat>', '<strong>', ' <emp>', '<black>', 'B', 4, 0),\n" +
                "(92, 'What is the full form of HTML?', 'HyperText Markup Language ', 'Hyper Tech Markup Language', ' Hyper Teach Markup Language', 'None of these', 'A', 4, 0),\n" +
                "(93, 'What should be the first tag in any HTML document? ', '<head>', '<title>', '<html>', '<document>', 'C', 4, 0),\n" +
                "(94, 'Which HTML tag produces the biggest heading? ', '<h4>', '<h5>', '<h1>', '<h6>', 'C', 4, 0),\n" +
                "(95, 'Which of the following is not a browser ? ', 'Microsofts Bing ', 'Netscape Navigator', 'Mozilla Firefox', 'Opera', 'A', 4, 0),\n" +
                "(96, 'HTML uses ', 'User defined tags', 'Fixed tags defined by the language', 'Pre-specified tags', 'Tags only for linking', 'B', 4, 0),\n" +
                "(97, 'What does CSS stand for?', 'Colorful Style Sheets      ', 'Creative Style Sheets', 'Computer Style Sheets', 'Cascading Style Sheets', 'D', 4, 0),\n" +
                "(98, 'Which HTML tag is used to define an internal style sheet?', ' <css>   ', '<script> ', '<style>', 'none', 'C', 4, 0),\n" +
                "(99, 'Which CSS property controls the text size?', 'font-size   ', 'font-style', 'text-size  ', 'text-style ', 'A', 4, 0),\n" +
                "(100, 'How do you select an element with id \"demo\"?', 'demo', '.demo', '#demo', 'none', 'C', 4, 0);";
        sql[2]=preSql+"(101, 'ATM means----', 'Any Time Money', 'Automated Teller Machine', 'Automatic Teller Machine', 'none', 'B', 2, 0),\n" +
                "(102, 'What does PHP stand for?', 'Private Home Page    ', 'Personal Hypertext Processor', 'PHP: Hypertext Preprocessor', 'none', 'C', 4, 0),\n" +
                "(103, 'How do you write \"Hello World\" in PHP', 'Document.Write(\"Hello World\");   \"Hello World\";', 'echo \"Hello World\";', '\"Hello World\";', 'none', 'B', 4, 0),\n" +
                "(104, 'All variables in PHP start with which symbol?', '!  ', '$', '&  ', '#', 'B', 4, 0),\n" +
                "(105, 'What is the correct way to end a PHP statement?', ',', '.', ';', '</PHP>', 'C', 4, 0),\n" +
                "(106, 'I ____ tennis every Sunday morning.', 'play', 'am playing', 'am play', 'playing', 'A', 3, 0),\n" +
                "(107, 'Don''t make so much noise. Noriko ______ to study for her ESL test!', 'try', 'tries', 'is trying', 'tried', 'C', 3, 0),\n" +
                "(108, 'Jun-Sik ______ his teeth before breakfast every morning.', 'will cleaned \t', 'is cleaning', 'cleans', 'clean', 'C', 3, 0),\n" +
                "(109, 'Sorry, she can''t come to the phone. She ____ a bath!', 'is having', 'have', 'having', 'has', 'A', 3, 0),\n" +
                "(110, '______ many times every winter in Frankfurt.', 'It snows \t\t', 'It is snow', 'It is snowing ', 'It snowed \t', 'A', 3, 0),\n" +
                "(111, 'How many students in your class _____ from Korea?', 'are coming', 'came', 'comes', 'come', 'D', 3, 0),\n" +
                "(112, 'Weather report: \"It''s seven o''clock in Frankfurt and _________ .\"', 'it`s snowing', 'it snows \t', 'it snowed', 'there is snow', 'A', 3, 0),\n" +
                "(113, 'Babies_____ when they are hungry.', 'cry \t \t\t', 'cries', 'cried ', 'are crying', 'A', 3, 0),\n" +
                "(114, 'Jane: \"What ______in the evenings?\"\\r\\nMary: \"Usually I watch TV or read a book.\"', 'you doing \t \t \t', 'you do', 'do you do', 'are you doing', 'C', 3, 0),\n" +
                "(115, 'Jane: \"What _______ ?\" \\r\\nMary: \"I''m trying to fix my calculator.\"', 'you doing \t \t', 'you do ', 'do you do', 'are you doing', 'D', 3, 0),\n" +
                "(116, 'Jane _____ her blue jeans today, but usually she wears a skirt or a dress.', 'is wearing', 'wear', 'wears', 'wearing', 'A', 3, 0),\n" +
                "(117, 'I think I ____ a new calculator. This one does not work properly any more.', 'needs \t\t \t', 'needed ', 'need', 'am needing', 'C', 3, 0),\n" +
                "(118, 'Sorry, you can''t borrow my pencil. I ____it myself.', 'was using \t\t\t', 'am using', 'using ', 'use ', 'B', 3, 0),\n" +
                "(119, '\tAt a school dance:\\r\\nJane: \"_______ yourself?\"\\r\\nMary: \"Yes, I''m having a great time!\"', 'Are you enjoying', 'You enjoying', 'Enjoy you', 'Do you enjoy', 'A', 3, 0),\n" +
                "(120, 'I''ve just finished reading a story called Dangerous Game. It''s about a man who ____his wife because he doesn''t want to lose her.', 'kills \t\t', 'killed ', 'kill \t', 'is killing', 'A', 3, 0),\n" +
                "(121, 'What time____________?', 'the train leaves? \t \t\t', 'is the train leaving?', 'leaves the train?', 'does the train leave?', 'D', 3, 0),\n" +
                "(122, 'Jane: \"Are you going to the dance on Friday?\" \\r\\nMary: \"No, I''m not.__________school dances; they''re loud, hot and crowded!\"', 'not enjoy  \t\t', 'don`t enjoy', 'doesn`t enjoy ', 'am not enjoying', 'B', 3, 0),\n" +
                "(123, 'I ______ for my pen. Have you seen it?', 'will look \t \t \t', 'looking', 'look', 'am looking', 'D', 3, 0),\n" +
                "(124, 'You can keep my iPod if you like. I ______ it any more.', 'don`t use ', 'doesn`t use \t\t', 'didn`t use ', 'am not using', 'A', 3, 0),\n" +
                "(125, 'The phone ______ Can you answer it, please?', 'rings \t \t\t', 'ring', 'rang ', 'is ringing', 'D', 3, 0),\n" +
                "(126, 'I come ..... Italy.', 'to', 'from', 'at', 'in', 'B', 3, 0),\n" +
                "(127, 'Ann, how are you?', 'I''m a nurse.', 'I''m fine, thanks. And you?', 'I am working', 'Good', 'B', 3, 0),\n" +
                "(128, 'Whose key is that?', 'It''s of Cate.', 'It''s Cate''s.', 'It''s Cate.', 'It''s to Cate.', 'B', 3, 0),\n" +
                "(129, 'His office is on the first ........', 'level', 'ground', 'stage', 'floor', 'D', 3, 0),\n" +
                "(130, 'I can''t find my glasses. Can you look for.., please?', 'they', 'them', 'it', 'their', 'B', 3, 0),\n" +
                "(131, '...... there any cars on the street?', 'Are', 'Is', 'Am', 'Isn''t', 'A', 3, 0),\n" +
                "(132, '(On the phone) Hello. Juliet .........', 'speak', 'speaking', 'talking', 'talk', 'B', 3, 0),\n" +
                "(133, 'do you go to the gym? - Twice a week.', 'How offten', 'How', 'Why', 'Where', 'A', 3, 0),\n" +
                "(134, 'I like ........ in my spare time', 'reading', 'read', 'to read', 'to reading', 'C', 3, 0),\n" +
                "(135, 'Chopin .................. music when he was three.', 'can read', 'could read', 'can to read', 'can''t read', 'B', 3, 0),\n" +
                "(136, 'I ......... born in 1992.', 'was', 'am', 'were', 'is', 'A', 3, 0),\n" +
                "(137, 'Where ......... Ann and Mary at 6 pm yesterday?', 'are', 'were', 'was', 'have been', 'B', 3, 0),\n" +
                "(138, 'I went to the bookshop .................... ''Harry Potter''.', 'for buying', 'to buy', 'to buying', 'for to buy', 'B', 3, 0),\n" +
                "(139, 'He is interested ......... learning Romanian.', 'in', 'on', 'to ', 'for', 'A', 3, 0),\n" +
                "(140, 'Would you like .......... to drink, sir?', 'anything', 'nothing', 'anywhere', 'something', 'D', 3, 0),\n" +
                "(141, 'The doctor gave me a ..........for some medicine last week.', 'note', 'recipe', 'prescription', 'receipt', 'C', 3, 0),\n" +
                "(142, 'What .................... next weekend?', 'do yoy do', 'are you doing', 'will you do', 'did you do', 'C', 3, 0),\n" +
                "(143, '''Why are you so hungry?''\\r\\n''Oh, I .................... breakfast this morning.''', 'didn''t have', 'don''t have', 'hadn''t', 'haven''t', 'A', 3, 0),\n" +
                "(144, 'Look! The bus .......................', 'are coming', 'is coming', 'come', 'comes', 'B', 3, 0),\n" +
                "(145, '- ''I have never been to Africa.'' - '' ........... have I.''', 'Either', 'Neither', 'So', 'No', 'B', 3, 0),\n" +
                "(146, '''Have you visited Birmingham?'' '' ............ ''', 'Not', 'Not yet', 'Ever', 'Already', 'B', 3, 0),\n" +
                "(147, 'My mother ............. the carpet when I got home\\nyesterday afternoon.', 'is hoovering', 'are hoovering', 'was hoovering', 'were hoovering', 'B', 3, 0),\n" +
                "(148, 'My aunt .................. come to our wedding reception\\nnext month.', 'will', 'isn''t', 'aren''t going to', 'isn''t going to', 'B', 3, 0),\n" +
                "(149, 'I promise I .................. study harder.', 'will', 'am going to', 'may', 'must', 'B', 3, 0),\n" +
                "(150, 'Is Emma ................... Carla?', 'as tall as', 'tall as', 'more tall', 'taller that', 'A', 3, 0);";
        sql[3]=preSql+"(151, 'Where is ..................... chemist''s, please?', 'the nearest', 'nearer', 'the most near', 'more near', 'A', 3, 0),\n" +
                "(152, 'Is that purse ............. ?', 'to you', 'you', 'yours', 'your', 'C', 3, 0),\n" +
                "(153, 'I ................... my mobile phone since 2009.', 'have had', 'have', 'had', 'am having', 'A', 3, 0),\n" +
                "(154, 'How long .......................... English?', 'are you learning', 'have you been learning', 'do you learn', 'you learn', 'B', 3, 0),\n" +
                "(155, 'We ................. the flight tickets yet.', 'don''t book', 'have booked', 'haven''t book', 'didn''t book', 'C', 3, 0),\n" +
                "(156, 'When Simon .........back tonight, he''ll do the washing up.', 'will come', 'comes', 'come', 'shall come', 'A', 3, 0),\n" +
                "(157, 'Would you mind ............... the gate, please?', 'closing', 'to close', 'close', 'closed', 'A', 3, 0),\n" +
                "(158, 'I ............ smoke when I was 20.', 'use to', 'used to', 'wouldn''t', 'couldn''t', 'B', 3, 0),\n" +
                "(159, 'You should ............ martial arts.', 'get off', 'start up', 'take up', 'take off', 'D', 3, 0),\n" +
                "(160, 'Could you tell me when ................................. ?', 'does the train leave', 'the train leaves', 'does leave the train', 'leaves the train', 'A', 3, 0),\n" +
                "(161, '............. did you travel with?', 'How', 'Who', 'Whose', 'What', 'B', 3, 0),\n" +
                "(162, 'Look out! You ..................... off the bike.', 'will fall', 'are going to fall', 'are falling', 'might fall', 'D', 3, 0),\n" +
                "(163, 'You ....... see a doctor.', 'did', 'would', 'should', 'had', 'C', 3, 0),\n" +
                "(164, 'My mobile phone  . . . . . . . . . .', 'has been stolen', 'has stolen', 'have been stolen', 'stole', 'A', 3, 0),\n" +
                "(165, 'Carla ........... me to go to university.', 'who', 'whose', 'that', 'which', 'B', 3, 0),\n" +
                "(166, 'If I were a prince, I ....... . . ....... a palace.', '''d have', '''ll have', '''d have had', 'have', 'A', 3, 0),\n" +
                "(167, 'Drive ............... otherwise you''ll have an accident.', 'more careful', 'less carefully', 'more carefully', 'much more careful', 'C', 3, 0),\n" +
                "(168, 'If they ............ next to each other on the plane, they\\r\\nwouldn''t have got married.', 'hadn''t sat', 'had sat', 'sat', 'didn''t sit', 'A', 3, 0),\n" +
                "(169, '.................. the better team, we lost the match.', 'despite being', 'despite of being', 'although', 'despite the fact', 'A', 3, 0),\n" +
                "(170, 'If only I ......... . . . . . richer', 'am', 'was', 'were', 'have been', 'C', 3, 0),\n" +
                "(171, 'I am fed up ............... . . . this exercise.', 'to do', 'to doing', 'with doing', 'for doing', 'A', 3, 0),\n" +
                "(172, 'By this time next year, I ................ all my exams', 'will take', 'will have taken', 'have taken', 'take', 'B', 3, 0),\n" +
                "(173, 'They have put speed bumps on the road to....................\\r\\naccidents', 'prohibit', 'prevent', 'avoid', 'forbid', 'B', 3, 0),\n" +
                "(174, 'You ............................. to use your mobile so there''s\\r\\nno point in leaving it on.', 'are allowed', 'have', 'aren''t allowed', 'can''t', 'C', 3, 0),\n" +
                "(175, 'It was ........... boring film that I fell asleep.', 'as', 'so ', 'such', 'such as', 'D', 3, 0),\n" +
                "(176, 'She has been . . . . . . . . . . . . . of murdering her husband.', 'charged', 'arrested', 'blamed', 'accused', 'D', 3, 0),\n" +
                "(177, 'Which number should come next in the pattern? 37, 34, 31, 28----\\r\\n', '36', '33', '30', '25', 'D', 1, 0),\n" +
                "(178, 'Book is to Reading as Fork is to:\\r\\n', 'drawing', 'writing', 'stirring', 'eating', 'D', 1, 0),\n" +
                "(179, 'Which of the following can be arranged into a 5-letter English word?\\r\\n', 'H R G S T', 'R I L S A', 'T O O M A', 'W Q R G S', 'B', 1, 0),\n" +
                "(180, 'What number best completes the analogy:\\r\\n8:4 as 10: ________', '3', '7', '24', '5', 'D', 1, 0),\n" +
                "(181, 'If there are 6 apples and you take away 4, how many do you have?', '10', '2', '4', '6', 'C', 1, 0),\n" +
                "(182, 'At a conference, 12 members shook hands with each other before & after the meeting. How many total number of hand shakes occurred?', '100 ', '132 ', '145 ', '144', 'B', 1, 0),\n" +
                "(183, 'The day after the day after tomorrow is four days before Monday. What day is it today?', 'Monday ', 'Tuesday ', 'Wednesday ', 'Thursday ', 'A', 1, 0),\n" +
                "(184, 'A fisherman has 4 fishes (namely A, B, C,D) each having a different weight.\\r\\n(i) A weighs twice as much as B.\\r\\n(ii) B weighs four and a half times as much as C.\\r\\n(iii)C weighs half as much as D.\\r\\n(iv) D weighs less than A but more than B.\\r\\nWhich of the following is the lightest?', 'A', 'B', 'C', 'D', 'C', 1, 0),\n" +
                "(185, '6121135 is to flame as 21215120 is to ?', 'voice . ', 'bald ', 'bloat ', 'castle', 'C', 1, 0),\n" +
                "(186, 'Forest is to tree as tree is to ?', 'plant ', 'leaf', 'branch ', 'mangrove', 'B', 1, 0),\n" +
                "(187, '2, 6, 1, 3, 0.5, 1.5, ? What is the missing number?', '3', '0.25', '0.15', '0.50', 'B', 1, 0),\n" +
                "(188, '1, c, 4, f, 7, i, 10, ?', 'J', 'K', 'L', 'M', 'L', 1, 0),\n" +
                "(189, 'Observe the pattern: T/3/Q/6/N/9/K/12/H/15/E/18/ ??? What comes next in this pattern?', '21', 'D', 'B', 'C', 'C', 1, 0),\n" +
                "(190, '1-2-4-8-16-32-64-128-256-???-??-??? What are the 3 missing numbers?', '512-1026-2058', '512-1026-2038', '512-1026-2048', '512-1026-2068', 'C', 1, 0),\n" +
                "(191, '-g-t-y- -y-g-t- -t-y-g-   -h-u-z- -z-h-u- -u-z-h- What will the 3 values of the next grid be?', 'I-w-z ', 'J-v-a', 'I-v-z', ' I-v-a', 'D', 1, 0),\n" +
                "(192, 'Observe the pattern? 2/AB/4/CD/9/EF/16/GH/25/IJ/??/??/?? What are the missing values?', '36/KL/48', '36/KL/56', '36/KL/49', '36/JK/48', 'B', 1, 0),\n" +
                "(193, 'How many vowels appear in this question?', '10', '12', '13', '14', 'B', 1, 0),\n" +
                "(194, 'If you move 5 steps north, 4 steps east, 3 steps north, 5 steps west, 12 steps south, then 1 step east, how many squares are you from the starting point?', '2', '4', '6', '12', 'B', 1, 0),\n" +
                "(195, '2, 20, 1, 10, 0.5, 5, 0.25, 2.5, 0.125, 1.25, ?? What comes next in the pattern?', '0.0620', '0.0625', ' 0.625', '0.00625', 'B', 1, 0),\n" +
                "(196, 'What does SQL stand for?', 'Structured Query Language  ', ' Strong Question Language', 'Structured Question Language ', 'none', 'A', 4, 0),\n" +
                "(197, 'Which answer expresses the meaning of the specified word best?\\r\\nreassuring_______', 'compassionate   ', 'comforting   ', 'explanatory   ', 'meddlesome', 'B', 1, 0),\n" +
                "(198, 'Which number logically follows this series?\\r\\n4     6     9     6     14     6      ......', '6', '17', '19', '21', 'C', 1, 0),\n" +
                "(199, 'Which conclusion follows from the statements with absolute certainty?\\r\\n\\r\\n1.None of the stamp collectors is an architect.\\r\\n2.All the drones are stamp collectors.', 'all stamp collectors are architects', 'architects are not drones', 'no stamp collectors are drones', 'some drones are architects ', 'B', 1, 0),\n" +
                "(200, 'Which answer expresses the meaning opposite of that of the specified word best?\\r\\n\\r\\ntough_____', ' cowardly   ', 'starch   ', 'strong   ', 'tender', 'D', 3, 0);";
        sql[4]=preSql+"(201, 'Water is to a pipe as ? is to a wire.', 'cord', ' electricity', 'heat', 'gas', 'B', 1, 0),\n" +
                "(202, 'Which number should come next in this series?\\r\\n10, 17, 26, 37, ?', '56', '52', '50', '56', 'C', 1, 0),\n" +
                "(203, 'If 10 people can do a piece of work in 5 days, working 2 hours a day, how long will 2 people take to do the same work, working 5 hours a day?', '8', '5', '10', '12', 'C', 1, 0),\n" +
                "(204, 'Grand Central Terminal, Park Avenue, New York is the world''s', 'largest railway station', 'highest railway station', 'longest railway station', 'None of the above', 'A', 2, 0),\n" +
                "(205, 'Entomology is the science that studies', 'Behavior of human beings', 'Insects', 'The origin and history of technical and scientific', 'The formation of rocks', 'B', 2, 0),\n" +
                "(206, 'Eritrea, which became the 182nd member of the UN in 1993, is in the continent of', 'Asia ', 'Africa', 'Europe ', 'Australia', 'B', 2, 0),\n" +
                "(207, 'Garampani sanctuary is located at', 'Junagarh, Gujarat\t', 'Diphu, Assam', 'Kohima, Nagaland', 'Gangtok, Sikkim', 'B', 2, 0),\n" +
                "(208, 'For which of the following disciplines is Nobel Prize awarded?', 'Physics and Chemistry', 'Physiology or Medicine', 'Literature, Peace and Economics', 'All of the above', 'D', 2, 0),\n" +
                "(209, 'Hitler party which came into power in 1933 is known as', 'Labour Party', 'Nazi Party', 'Ku-Klux-Klan', 'Democratic Party', 'B', 2, 0),\n" +
                "(210, 'Fastest shorthand writer was', 'Dr. G. D. Bist', 'J.R.D. Tata', 'J.M. Tagore', 'Khudada Khan', 'A', 2, 0),\n" +
                "(211, 'Epsom (England) is the place associated with', 'Horse racing ', 'Polo ', 'Shooting ', 'Snooker', 'A', 2, 0),\n" +
                "(212, 'First human heart transplant operation conducted by Dr. Christiaan Barnard on Louis Washkansky, was conducted in', '1967', '1977', '1958', '1922', 'A', 2, 0),\n" +
                "(213, 'Golf player Vijay Singh belongs to which country?', 'USA \t', 'Fiji ', 'India ', 'UK', 'B', 2, 0),\n" +
                "(214, 'Guarantee to an exporter that the importer of his goods will pay immediately for the goods ordered by him, is known as', 'Letter of Credit (L/C)\t', 'laissezfaire ', 'inflation ', 'None of the above', 'A', 2, 0),\n" +
                "(215, 'First Afghan War took place in', '1839', '1843', '1863', '1848', 'A', 2, 0),\n" +
                "(216, 'First China War was fought between', 'China and Britain', 'China and France', 'China and Egypt', 'China and Greek', 'A', 2, 0),\n" +
                "(217, 'For the Olympics and World Tournaments, the dimensions of basketball court are', '26 m * 14 m', '28 m * 15 m', '27 m * 15 m', '28 m * 16 m', 'B', 2, 0),\n" +
                "(218, 'Federation Cup, World Cup, Allywyn International Trophy and Challenge Cup are awarded to winners of', 'Tennis ', 'Volleyball ', 'Basketball ', 'Cricket', 'B', 2, 0),\n" +
                "(219, 'Each year World Red Cross and Red Crescent Day is celebrated on', 'May 8 ', 'May 18', 'June 8', 'June 18', 'A', 2, 0),\n" +
                "(220, 'Friction can be reduced by changing from', 'sliding to rolling ', 'rolling to sliding', 'potential energy to kinetic energy', 'dynamic to static', 'A', 2, 0),\n" +
                "(221, 'Fire temple is the place of worship of which of the following religion?', 'Taoism', 'Judaism ', 'Zoroastrianism (Parsi Religion)', 'Shintoism', 'C', 2, 0),\n" +
                "(222, 'Film and TV institute of India is located at', 'Pune (Maharashtra) \t', 'Rajkot (Gujarat)', 'Pimpri (Maharashtra)', 'Perambur (Tamilnadu)', 'A', 2, 0),\n" +
                "(223, 'Georgia, Uzbekistan and Turkmenistan became the members of UNO in', '1991 \t', '1992 ', '1993 ', '1994', 'B', 2, 0),\n" +
                "(224, 'During World War II, when did Germany attack France?', '1940', '1941', '1942', '1943', 'A', 2, 0),\n" +
                "(225, 'The ozone layer restricts', 'Visible light ', 'Infrared radiation', 'X-rays and gamma rays', 'Ultraviolet radiation', 'D', 2, 0),\n" +
                "(226, 'Filaria is caused by', 'Bacteria \t', 'Mosquito ', 'Protozoa ', 'Virus', 'B', 2, 0),\n" +
                "(227, 'Goa Shipyard Limited (GSL) was established in', '1958 ', '1957 ', '1956 ', '1955', 'B', 2, 0),\n" +
                "(228, 'Who was the first Indian Chief of Army Staff of the Indian Army ?', 'Gen. K.M. Cariappa', 'Vice-Admiral R.D. Katari', 'Gen. Maharaja Rajendra Singhji', 'None of the above', 'A', 2, 0),\n" +
                "(229, 'FRS stands for', 'Fellow Research System', 'Federation of Regulation Society', 'Fellow of Royal Society', 'None of the above', 'C', 2, 0),\n" +
                "(230, 'Coral reefs in India can be found in', 'the coast of Orissa', 'Waltair', 'Rameshwaram', 'Trivandrum', 'C', 2, 0),\n" +
                "(231, 'Heavy Water Project (Talcher) and Fertilizer plant (Paradeep) are famous industries of', 'Orissa B.\tC.\t D.\t', 'Tamil nadu', 'Andhra Pradesh', 'Kerala', 'A', 2, 0),\n" +
                "(232, 'Hamid Karzai was chosen president of Afghanistan in', '2000', '2001', '2002', '2003', 'C', 2, 0),\n" +
                "(233, 'Durand Cup is associated with the game of', 'Cricket ', 'Football ', 'Hockey ', 'Volleyball', 'B', 2, 0),\n" +
                "(234, 'Headquarters of UNO are situated at', 'New York, USA ', 'Hague (Netherlands)', 'Geneva ', 'Paris', 'A', 2, 0),\n" +
                "(235, 'Fathometer is used to measure', 'Earthquakes', 'Rainfall', 'Ocean depth', 'Sound intensity', '3', 2, 0),\n" +
                "(236, 'For galvanizing iron which of the following metals is used?', 'Aluminium', 'Copper', 'Lead', 'Zinc', 'D', 2, 0),\n" +
                "(237, 'Firdausi was', 'a poet ', 'well known for his epic ''Shahnama''', 'Both option A and B', 'None of the above', 'C', 2, 0),\n" +
                "(238, 'Himalayan Mountaineering Institute is at', 'Darjeeling', 'Dehradun', 'Marmago', 'Dispur', 'A', 2, 0),\n" +
                "(239, 'Gabriel Daniel Fahrenheit was', 'a German Physicist', 'developed the mercury thermometer in 1714', 'devised temperature scale', 'All of the above', 'D', 2, 0),\n" +
                "(240, 'During the first crusade, crusaders reached Jerusalem and captured it in', '1000 AD', '1099 AD', '1200 AD', '1515 AD', 'B', 2, 0),\n" +
                "(241, 'East Timor, which became the 191st member of the UN, is in the continent of', 'Asia ', 'Africa ', 'Europe', 'South America', 'A', 2, 0),\n" +
                "(242, 'GNLF stands for', 'Gorkha National Liberation Front', 'Gross National Liberation Form', 'Both option A and B', 'None of the above', 'A', 2, 0),\n" +
                "(243, 'Excessive secretion from the pituitary gland in the children results in', 'increased height', 'retarded growth', 'weakening of bones', 'None of the above', 'A', 2, 0),\n" +
                "(244, 'Which was the 1st non Test playing country to beat India in an international match?', 'Canada ', 'Sri Lanka ', 'Zimbabwe ', 'East Africa', 'B', 2, 0),\n" +
                "(245, 'Who is the first Indian woman to win an Asian Games gold in 400m run?', 'M.L.Valsamma', 'P.T.Usha', 'Kamaljit Sandhu', 'K.Malleshwari', 'C', 2, 0),\n" +
                "(246, 'Ricky Ponting is also known as what?', 'The Rickster', 'Ponts ', 'Ponter ', 'Punter', 'D', 2, 0),\n" +
                "(247, 'How long are professional Golf Tour players allotted per shot?', '45 seconds ', '25 seconds', '1 minute', '2 minutes', 'A', 2, 0),\n" +
                "(248, 'The first hang gliders to be flown were flown in', '1600s', '1700s', '1800s', '1900s', 'C', 2, 0),\n" +
                "(249, 'The nickname of Glenn McGrath is what', 'Ooh Ahh', 'Penguin ', 'Big Bird', 'Pigeon', 'D', 2, 0),\n" +
                "(250, 'Mark Waugh is commonly called what', 'Afganistan ', 'Junior ', 'Tugga', 'Julio', 'B', 2, 0);";
        sql[5]=preSql+"(251, 'India won its first Olympic hockey gold in', '1928 ', '1932 ', '1936', '1948', 'A', 2, 0),\n" +
                "(252, 'How many times did Geet Sethi win the lBSF World Billiards title', '2', '3', '4', '5', 'B', 2, 0),\n" +
                "(253, 'Who won the 1993 \"King of the Ring\"', 'Owen Hart', 'Bret Hart', 'Edge ', 'Mabe', 'B', 2, 0),\n" +
                "(254, 'Who was the 1st ODI captain for India', 'Ajit Wadekar ', 'Bishen Singh Bedi', 'Nawab Pataudi', 'Vinoo Mankad', 'A', 2, 0),\n" +
                "(255, 'Where did India play its 1st one day international match', 'Lords\t', 'Headingley ', 'Taunton ', 'The Oval', 'B', 2, 0),\n" +
                "(256, 'India reached the final of the Davis Cup for the first time in', '1964 ', '1966 ', '1970', '1974', 'B', 2, 0),\n" +
                "(257, 'In which Indian state did the game of Polo originate', 'Meghalaya ', 'Rajasthan', 'Manipur ', 'West Bengal', 'C', 2, 0),\n" +
                "(258, 'Which cricketer died on the field in Bangladesh while playing for Abahani Club', 'Subhash Gupte ', 'M.L.Jaisimha', 'Lala Amarnath', 'Raman Lamba', 'D', 2, 0),\n" +
                "(259, 'Which of the following is a Manipuri version of Hockey', 'Khong Kangjei', 'Hiyang Tanaba ', 'Yubi Lakpi', 'None of above', 'A', 2, 0),\n" +
                "(260, 'Where did the 1st ODI match was played in India', 'New Delhi ', 'Ahmedabad ', 'Kolkata ', 'Mumbai', 'B', 2, 0),\n" +
                "(261, 'What is the name of the person that controls a football match', 'A referee', 'An umpire ', 'A spectator', 'A goalkeeper', 'A', 2, 0),\n" +
                "(262, 'The Indian football team made its first appearance at Olympics in', '1936 ', '1948 ', '1952 ', '1956', 'B', 2, 4),\n" +
                "(263, 'Who was the first captain of Indian Test team', 'Vijay Hazare ', 'C K Nayudu', 'Lala Amarnath', 'Vijay Merchant', 'B', 2, 4),\n" +
                "(264, 'Which country won the Cricket World Cup in 1999', 'Australia ', 'South Africa', 'Pakistan', 'England', 'A', 2, 0),\n" +
                "(265, 'The name Kunjarani Devi is associated with', 'Weight Lifting', 'Target shooting', 'Athletics', 'Swimming', 'B', 2, 0),\n" +
                "(266, 'How many gold medals have been won by India in the Olympics so far', '4', '8', '9', '10', 'C', 2, 0),\n" +
                "(267, 'Who has scored the most Test hundreds ever', 'Steve Waugh', 'Sachin Tendulkar', 'Shane Warne', 'Sunil Gavaskar', 'B', 2, 0),\n" +
                "(268, 'When was the first cricket Test match played', '1873', '1877 ', '1870 ', '1788', 'B', 2, 0),\n" +
                "(269, 'Choose the correct alternative to complete the sentence.\"He ? to see us he had been able to\"', 'would come                      ', 'would have come', 'may have come ', 'bad attack ', 'A', 5, 2),\n" +
                "(270, 'Choose the correct sentence.', 'I asked Javed had he passed ', 'I asked Javed if he had passed', 'I asked Javed if you had passed ', 'I asked Javed that had he passed', 'B', 5, 2),\n" +
                "(271, 'Choose the correct sentence.', 'A few of the three boys got a prize', 'Each of the three boys got a prize ', 'Every of the three boys got a prize ', 'All of the three boys got a prize ', 'B', 5, 2),\n" +
                "(272, 'Choose the correct sentence.', 'The man that said that was a fool', 'The man who said that was a fool', 'The man that said that was a fool', 'The man which said that was a fool', 'B', 5, 2),\n" +
                "(273, 'Choose the correct answer. How long did you wait', 'Till lunch time', 'Till he came', 'Until six o''clock ', 'Since this morning', 'B', 5, 2),\n" +
                "(274, 'What will be the correct preposition to complete the sentence? \"I am not bad...tennis\"', 'in', 'at ', 'about ', 'with ', 'B', 5, 2),\n" +
                "(275, 'What is the antonym of gentle?', 'harsh        ', 'modest        ', 'clever        ', 'rude', 'D', 5, 2),\n" +
                "(276, 'What is the synonym of ''Jovial?''', 'Jolly        ', 'Gay        ', 'Jealous        ', 'Happy', 'A', 5, 2),\n" +
                "(277, 'What is the synonym of ''Competent?''', 'Circumspect        ', 'Discrete        ', 'Capable        ', 'Prudent', 'C', 5, 2),\n" +
                "(278, 'Who is the auther of \"A Farewell to Arms\"?', 'H. G. WeUs                        ', 'George Orwel', 'Thomas Hardy', 'Ernest Hemingway', 'D', 5, 2),\n" +
                "(279, 'Who is the auther of \"Animal Farm\"? ', 'Thomas More                       ', 'George Orwel', 'Boris Pasternak', 'Charles Dickens', 'B', 5, 2),\n" +
                "(280, 'Who is the author of \"India Wins Freedom\"?', 'Mahatma Gandhi                      ', 'J. L. Nehru  ', 'Abul Kalam Azad', 'Debashish', 'C', 5, 2),\n" +
                "(281, 'what kind of noun is \"Cattle\"?', 'Proper        ', 'Collective        ', 'Common        ', 'Material ', 'B', 5, 2),\n" +
                "(282, 'What kind of noun is \"Girl\"?', 'Proper         ', 'Collective        ', 'Common        ', 'Material', 'C', 5, 2),\n" +
                "(283, 'What is the meaning of \"White Elephant\"?', 'An elephant of white colour', 'A very costly or troublesome possession ', 'A black marketer ', 'A hoarder', 'B', 5, 2),\n" +
                "(284, 'Which of the following sentence is correct? ', 'I forbad him from going', 'I forbade him to go', 'I forbade him going ', 'I forbade him not to go ', 'B', 5, 2),\n" +
                "(285, 'Which of the following is a correct proverb?', 'Fools rush in where angels fear to tread', 'Fools rush in where an angels fear to tread', 'A Fool rushes in where an angels fears to tread', 'fools rush in where the angels fear to tread', 'A', 5, 2),\n" +
                "(286, 'Which of the following sentence is correct? ', 'Why you have done this', 'Why did you have done this', 'Why have you done this', 'Why you had done this', 'C', 5, 2),\n" +
                "(287, 'Which of the following sentence is correct?', 'That shirt which he bought is blue in colour', 'Which shirt he bought is blue in colour ', 'The shirt which he bought is blue in colour ', 'None', 'D', 5, 2),\n" +
                "(288, 'The correct passive of \"Sheila was writing a letter\" is', 'A letter was being writing by Sheila', 'A letter was written by Sheila', 'A letter was being was being written by Sheila', 'A letter was being written by Sheila ', 'D', 5, 2),\n" +
                "(289, 'Which of the following sentences is correct?', 'One of my friends are a lawyer ', 'One of my friends is a lawyer ', 'One of my friend is a lawyer', 'One of my friends are a lawyers', 'B', 5, 2),\n" +
                "(290, 'The word ecological is related to', 'Atmosphere', 'Pollution', 'Environment', 'Demography ', 'C', 5, 2),\n" +
                "(291, 'The synonym of ''genesis'' is', 'Introduction        ', 'Preface', 'Beginning', 'Foreword', 'C', 5, 2),\n" +
                "(292, 'The word ''homogeneous'' means', 'Of the same kind', 'Of the same place', 'Of the same race  ', 'Of the same density', 'A', 5, 2),\n" +
                "(293, 'The word ''imbibe'' means-', 'To learn                        ', 'To tinge', 'To drink', 'To acquire', 'C', 5, 2),\n" +
                "(294, 'Something which is obnoxious means that it is', 'very dangerous', 'very pleasant', 'very ugly', 'very unpleasant', 'D', 5, 2),\n" +
                "(295, 'A pilgrim is a person who undertakes a journey to a', 'holy place', 'a mosque', 'a bazar', 'a new country', 'A', 5, 2),\n" +
                "(296, 'Shakespeare is known mostly for his', 'poetry', 'novels', 'autobiography  ', 'plays', 'D', 5, 2),\n" +
                "(297, 'A person who writes about his own life writes', 'a chronicle ', 'an autobiography ', 'a diary ', 'a biography', 'B', 5, 2),\n" +
                "(298, 'In which century was the Victorian period?', '17th century', '18th century', '19th century', '20th century', 'D', 5, 4),\n" +
                "(299, 'গিরিজা প্রসাদ কৈরালা কত তারিখে নেপালের প্রধান মন্ত্রী হিসেবে পদত্যাগ করেন?', '৮ জুলাই ১৯৯৪', '১০ জুলাই ১৯৯৪', '৯ জুলাই ১৯৯৪', '১১ জুলাই ১৯৯৪', 'B', 5, 4),\n" +
                "(300, 'Hubble Telescope এর ত্রুটি সংশোধনের জন্য নভচারীগনকে মহাশূন্যে কোন নভোযানে প্রেরন করা হয়েছিল?', 'Endeavour', 'Challenger', 'Pathfinder', 'Apollo ', 'A', 5, 4);";
        sql[6]=preSql+"(301, 'রুয়ান্ডার প্যাট্রিয়টিক ফ্রন্ট সরকার কবে শপথ গ্রহন করে? ', '৮ জুলাই ১৯৯৪', '১৯ জুলাই ১৯৯৪', '২৪ জুলাই ১৯৯৪', '২৭ জুলাই ১৯৯৪', 'B', 5, 4),\n" +
                "(302, 'উপকূলে কোন একটি স্থানে পরপর দুটি জোয়ারের মধ্যে ব্যবধান হলো', 'প্রায় ১২ ঘন্টা', 'প্রায় ৬ ঘন্টা', 'প্রায় ২৪ ঘন্টা', 'চাঁদের তিথি অনুশারে ভিন্ন ', 'A', 5, 4),\n" +
                "(303, 'নাড়ীর স্পন্দন প্রবাহিত হয়', 'ধমনীর ভিতর দিয়ে', 'স্নায়ুর ভিতর দিয়ে', 'শিরার ভিতর দিয়ে', 'ল্যাকটিয়ারের ভিতর দিয়ে', 'A', 5, 4),\n" +
                "(304, 'বৃত্তের পরিধী ও ব্যাসের অনুপাত', ' ৩', '২২/৭', '২৫/৯', 'প্রায় ৫', 'B', 5, 3),\n" +
                "(305, 'রঙ্গীন টেলিভিশন হতে ক্ষতিকর কোন রশ্মি বের হয়?', 'মৃদু রঞ্জন রশ্মি ', 'গামা রশ্মি', 'কসমিক রশ্মি', 'বিটা রশ্মি', 'B', 5, 4),\n" +
                "(306, 'যা চিরস্থায়ী নয়', 'অস্থায়ী', 'ক্ষনিক', 'ক্ষনস্থায়ী', 'নশ্বর', 'D', 5, 1),\n" +
                "(307, 'Intellectual শব্দের বাংলা অর্থ', 'বুদ্ধিমান', 'মননশীল', 'বুদ্ধিজীবি', 'মেধাবী', 'C', 5, 1),\n" +
                "(308, 'কোন নগরীতে মোঘল আমলে সুবে বাংলার রাজধানী ছিল?', 'গৌড়', 'সোনারগাও', 'ঢাকা', 'হুগলী', 'B', 5, 4),\n" +
                "(309, 'Asia Pacific Economic Co-operation (APEC) ফোরামের নভেম্বর, ১৯৯৩ এ অনুষ্ঠিত শীর্ষ বৈঠকে কোন সদস্য দেশের সরকার প্রধান অনুপস্থিত ছিলেন?', 'মালয়শিয়া', 'ফিলিপাইন', 'অষ্ট্রেলিয়া', 'জাপান', 'D', 5, 4),\n" +
                "(310, 'কোন গ্রন্থটি ঢাকা হতে প্রথম প্রকাশিত হয়েছিল?', 'মেঘনদবদ কাব্য', 'দুর্দেশনন্দিনী', 'নীলদর্পণ', 'অগ্নিবীনা', 'C', 5, 1),\n" +
                "(311, 'পথিক তুমি পথ হারাইয়াছো? কথাটি কার?', 'রবীন্দ্রোনাথ ঠাকুর', 'বঙ্কিমচন্দ্র চট্টোপাধ্যয়', 'মীর মোশারফ হোসেন', 'শরৎচন্দ্র চট্টোপাধ্যয় ', 'B', 5, 1),\n" +
                "(312, 'প্রত্যয়গতভাবে শুদ্ধ কোনটি?', 'উৎকর্ষতা ', 'উৎকর্ষ', 'উৎকৃষ্ট', 'উৎকৃষ্টতা', 'C', 5, 1),\n" +
                "(313, 'অচিন’ শব্দের ''অ'' উপসর্গটি কোন অর্থে ব্যবহৃত?', 'নেতিবাচক', 'বিয়োগয়ান্ত', 'নঞর্থক', 'অজানা', 'C', 5, 1),\n" +
                "(314, 'বাংলায় ইউরোপীয় বণিকদের মধ্যে প্রথম কারা এসেছিল? ', 'ইংরেজরা', 'ফরাসিরা', 'ওলান্দাজর', 'প্রর্তুগীজরা', 'D', 5, 4),\n" +
                "(315, 'জিয়া সার কারখানায় উৎপাদিত সারের নাম কি?', 'অ্যামোনিয়া', 'সুপার ফসফেট', 'টি এস পি', 'ইউরিয়া', 'D', 5, 4),\n" +
                "(316, 'ল্যাপটপ হলো এক ধরনের-', 'পর্বাতারোহন সামগ্রী', 'ছোট কুকুর', 'বাদ্য যন্ত্র', 'ছোট কম্পিউটার', 'D', 5, 4),\n" +
                "(317, 'বাংলাদেশের পাহারশ্রেনীর ভূ-তাত্ত্বিক যুগের ভূমিরুপ হচ্ছে?', 'প্লাইসটোনিস যুগের', 'টারশিয়ারী যুগের', 'মায়োসিন যুগের', 'ডেবোনিয়ান যুগের', 'B', 5, 4),\n" +
                "(318, 'বাংলাদেশের সবচেয়ে উত্তরে অবস্থিত স্থানের নাম-', 'তেতু্লিয়া', 'পঞ্চগড়', 'বাংলাবান্ধা', 'নকশালবাড়ী', 'C', 5, 4),\n" +
                "(319, 'ব্রিটিশ বণিকদের বিরুদ্ধে একজন চাকমা জুমিয়া নেতা বিদ্রোহের পতাকা উড়িয়েছেন তার নাম-', 'রাজা ত্রিদিব রায়', 'রাজা ত্রিভুবন চাকমা', 'জুম্মা খান', 'জান বখস খাঁ', 'C', 5, 4),\n" +
                "(320, 'একটি কাঠের টুকরার দৈর্ঘ্য আরেকটি টুকরার দৈর্ঘ্যের তিনগুন।টুকরা দুটো সংযুক্ত করা হলে সংযুক্ত টুকরাটির দৈর্ঘ্য ছোট টুকরার চাইতে কত গুন বড় হবে? ', '৩ গুন', '৪ গুন', '৫ গুন', '৮ গুন', 'B', 5, 3),\n" +
                "(321, 'নয়া আন্তজার্তিক অর্থনৈতিক ব্যবস্থার প্রস্তাব জাতিসংঘের সাধারন পরিষদের কোন বিশেষ অধিবেশনে গৃহীত হয়?', ' দ্বিতীয়', 'তৃতীয়', 'পঞ্চম', 'ষষ্ঠ', 'D', 5, 4),\n" +
                "(322, 'মধ্য এশিয়ায় অবস্থিত আয়তনে সর্ববৃহৎ প্রজাতন্ত্রের নাম-', 'তাজিকিস্তান', 'কাজাকিস্তান', 'উজবেকিস্তান', 'কিরগিজস্তান', 'B', 5, 4),\n" +
                "(323, 'জোট নিরপেক্ষ আন্দোলনের প্রথম শীর্ষ সম্মেলন কবে অনুষ্ঠিত হয়?', 'হারারে ১৯৮৯', 'বেলগ্রেড ১৯৬১', 'হাভানা ১৯৭৩', 'কায়রো ১৯৭০', 'B', 5, 4),\n" +
                "(324, 'বায়ুমন্ডলের চাপের ফলে ভূ-গর্ভস্থ পানি লিফট পাম্পের সাহায্যে সর্বোচ্চ যে গভীরতা থেকে উঠানো যায়-', '১ মিটার', '১০ মিটার', '১৫ মিটার', '১৯ মিটার', 'B', 5, 4),\n" +
                "(325, 'বাংলাভাষার প্রথম কাব্য সংকলন চর্যাপদের আবিস্কারক-', 'ডক্টর মুহম্মদ শহীদুল্লাহ', 'ডক্টর সুনিতিকুমার চট্টোপাধ্যয়', 'হরপ্রসাদ শাস্ত্রী', 'ডক্টর সুকুমার সেন', 'C', 5, 1),\n" +
                "(326, 'তত্ত্বাবোধিনী পত্রিকা’ প্রথম প্রকাশিত হয়?', '১৮৪১ সালে', '১৮৪২ সালে', '১৮৫০ সালে', '১৮৪৩ সালে', 'D', 5, 1),\n" +
                "(327, 'যে ছন্দের মুল পর্বের মাত্রা সংখ্যা চার, তাকে বলা হয়-', 'স্বরবৃত্ত                ', 'পিয়ার', 'মাত্রাবৃত্ত', 'অক্ষরবৃত্ত', 'A', 5, 1),\n" +
                "(328, 'The antonym for ''Inimical''', 'Friendly', 'Hostile', 'Indifferent', 'Angry', 'A', 5, 2),\n" +
                "(329, 'টুথপেস্টের প্রধান উপাদান-', 'জেলী ও মসলা', 'সাবান ও পাউডার', 'ভোজ্য তেল ও সোডা', 'ফ্লোরাইড ও ক্লোরাইড', 'B', 5, 4),\n" +
                "(330, 'পানির যে ছোট ফোটা পানির যে গুনের জন্য গোলাকৃতির হয়', 'সান্দতা', 'স্তিতিস্থাপকতা', 'প্লাবতা', 'পৃষ্ঠটান', 'D', 5, 4),\n" +
                "(331, 'মুক্তা হল ঝিনুকের-', 'খোলসের টুকরা', 'চোখের মনি', 'প্রদাহের ফল', 'জমাট হরমন', 'C', 5, 4),\n" +
                "(332, '১৯৯৪ সালের পহেলা ডিসেম্বর বৃহস্পতি বার হলে, ১৯৯৫ সালের ঐ হবে', 'বৃহস্পতিবার', 'শুক্রবার', 'শনিবার', 'রবিবার', 'B', 5, 3),\n" +
                "(333, 'একটি ত্রিভূজাকৃতি ক্ষেত্রের ক্ষেত্রফল ৮৪ বর্গগজ।ত্রিভূজটির শীর্ষবিন্দু হতে ভূমির উপর অঙ্কিত লম্বের দৈর্ঘ্য ১২ গজ হলে ভূমির দৈর্ঘ্য কত?', '১০ গজ', '১২ গজ', '১৪ গজ', '৭ গজ', 'C', 5, 3),\n" +
                "(334, 'দুটি সংখ্যার গ.সা.গু, বিয়োগফল এবং ল.সা.গু যথাক্রমে ১২,৬০ এবং ২৪৪৮।সংখ্যা দুটি কত?', '১০৮ ও ১৪৪', '১১২ ও ১৪৮', '১৪৪ ও ১০৮', '১৪৪ ও ২০৪', 'D', 5, 3),\n" +
                "(335, 'বিশ্ব তামাকমুক্ত দিবস প্রতিপালিত হয় প্রতি বছরের', '৩১ জানুয়ারী', '৩০ মার্চ', '৩০ এপ্রিল', '৩১ মে', 'D', 5, 4),\n" +
                "(336, 'মার্কিন যুক্তরাষ্ট্রকে স্ট্যাচু অব লিবার্টি’ উপহার দেয় যে রাষ্ট্র-', 'যুক্তরাজ্য', 'ফ্রান্স', 'জাপান', 'জার্মান', 'B', 5, 4),\n" +
                "(337, 'নিম্নের কোন দেশটি জাতিসংঘের সদস্য নয়-', 'নামিবিয়া       ', 'সুইজারল্যান্ড', 'কিউবা', 'পানামা', 'B', 5, 4),\n" +
                "(338, 'স্বাধীনতার আগে পাপুয়া নিউগিনি কোন দেশের অধীনে ছিল?', ' ব্রিটেন', 'ফ্রান্স', 'অষ্ট্রেলিয়া', 'নিউজিল্যান্ড', 'C', 5, 4),\n" +
                "(339, 'পোলিও টিকা আবিস্কারক জোনাস সাল্ক যুক্তরাষ্ট্রের এক শহরে মারা যান, শহরটির নাম-', 'La Martini', 'La Zola', 'San Antonio', 'San Hose', 'B', 5, 4),\n" +
                "(340, 'বাংলাদোশের গবাদীপশুতে প্রথম ভ্রুন ব্যবহার করা হয়-', '৫ মে ১৯৯৪                         ', '৬ এপ্রিল ১৯৯৪', '৫ মে ১৯৯৫', '৭ মে ১৯৯৭', 'C', 5, 4),\n" +
                "(341, 'বাংলাদেশে ঢুকার পর গঙ্গা নদী, ব্রহ্মপুত্র-যমুনার সাথে নিম্নোক্ত একটা জায়গায় মেশে-', 'গোয়ালন্দ', 'বাহাদুর বাদ', 'ভৌরব বাজার', 'নারায়নগঞ্জ', 'A', 5, 4),\n" +
                "(342, 'ঢাকার বড় কাটরা ও ছোট কাটরা শহরের নিম্নোক্ত একটি এলাকায় অবস্থিত-', 'চকবাজার', 'সদরঘাট', 'লালবাগ', 'ইসলামপুর', 'A', 5, 4),\n" +
                "(343, 'পর্তুগীজ শব্দ থেকে নিম্নোক্ত একটি শব্দ বাংলাভাষায় আত্তীকরণ করা হয়েছে-', 'টেবিল                       ', 'চেয়ার', 'বালতি', 'শরবত', 'C', 5, 1),\n" +
                "(344, 'করনার স্টোন অব পিচ এই স্মৃতিসৌধটি সম্প্রতি স্থাপিত হয়েছে-', 'ম্যাকাও', 'হাইতি', 'ওকিনাওয়া', 'ভিয়েতনাম', 'B', 5, 4),\n" +
                "(345, 'বাংলাদেশের একটি জীবন্ত জীবাশ্মের নাম-', 'রাজ কাঁকরা', 'গন্ডার', 'পিপীলিকাভুক্ত ম্যানিস', 'স্নো লোরিস', 'A', 5, 4),\n" +
                "(346, 'Browning was the composer of any of the following poems-', 'Two voices', 'The scholar Gipsy', 'Andtea del Sarto', 'Oenone', 'B', 5, 2),\n" +
                "(347, 'The synonym of ''Franchise''- ', 'Privilege', 'Utility', 'French', 'Frankness', 'A', 5, 2),\n" +
                "(348, 'The opposite word of ''sluggish''-', 'Animated', 'Dull', 'Heavy', 'Slow', 'A', 5, 2),\n" +
                "(349, 'The correct spelling is-', 'Humourous', 'Humourious', 'Humorous', 'Humorious', 'C', 5, 2),\n" +
                "(350, 'Natural protein-এর কোড নাম-', 'Protein-p 53', 'Protein-p 51', 'Protein-p 52', 'Protein-p 49', 'D', 5, 4);";
        sql[7]=preSql+"(351, 'সূর্য থেকে পৃথিবীতে আলো আসতে কতক্ষন সময় লাগে? ', '৮.৩২ মিনিট', '৯.১২ মিনিট', '৭.৯৬ মিনিট', '১০.৫৬ মিনিট', 'A', 5, 4),\n" +
                "(352, 'কোনটি স্তন্যপায়ী প্রানী নয়?', 'হাতি                         ', 'কুমির', 'তিমি', 'বাদুর', 'B', 5, 1),\n" +
                "(353, 'এই শতাব্দীর সবচেয়ে উজ্জল ধূমকেতু কোনটি?', 'হেইলির ধুমকেতু', 'হেল-বপ-ধূমকেতু', 'শূমেকার লেভী ধূমকেতু', 'কোনটি নয়', 'C', 5, 4),\n" +
                "(354, 'বিদ্যুৎকে সাধারন মানুষের কাজে লাগানোর জন্য কোন বৈজ্ঞানিকের অবদান সবচেয়ে বেশি?', 'বেজ্ঞামিন ফ্রাঙ্কলিন', 'আইজ্যাক নিউটন', 'টমাস এডিসন', 'ভোল্টা', 'C', 5, 4),\n" +
                "(355, 'ভূ-পৃষ্ঠের সৌরদীপ্ত ও অন্ধকারচ্ছন্ন অংশের সংযোগ স্থলকে কি বলে?', 'ছায়াবৃত্ত', 'গুরুবৃত্ত', 'উষা', 'গোধূলী', 'A', 5, 4),\n" +
                "(356, 'ভূ-মধ্যসাগর ও আটল্যান্টিক মহাসাগরের মধ্যে কোন প্রনালীর অবস্থান?', 'হরমুজ', 'জিব্রাল্টার', 'বসফরাস', 'দার্দানেলিস', 'B', 5, 4),\n" +
                "(357, 'আকাশে উজ্জলতম নক্ষত্র কোনটি?', 'ধ্রুবতারা', 'প্রক্সিমা সেন্টারাই', 'লুব্ধক', 'পুলহ ', 'C', 5, 4),\n" +
                "(358, 'জোয়ার ভাটার তেজকটাল কখন হয়?', 'অমাবস্যায়', 'একাদশীতে', 'অষ্টমীতে', 'পঞ্চমীতে', 'A', 5, 4),\n" +
                "(359, 'একটি সংখ্যার তিনগুনের সাথে দুইগুন যোগ করলে ৯০ হয় সংখ্যাটি কত?', ' ১৬', '১৮', '২০', '২৪', 'B', 5, 3),\n" +
                "(360, 'পরপর ১০ টি সংখ্যার প্রথম ৫টি সংখ্যার যোগফল ৫৬০ হলে শেষ ৫ টির যোগফল কত?', ' ৫৮৫', '৫৮০', '৫৭৫', '৫৭০', 'A', 5, 3),\n" +
                "(361, '১২ ও ৯৬ এর মধ্যে কয়টি সংখ্যা ৪ দ্বারা বিভাজ্য?', '২১', '২৩', '২৪', '২২', 'D', 5, 3),\n" +
                "(362, 'তার বয়স বেড়েছে কিন্তু বুদ্ধি বাড়েনি''-এটা কোন ধরনের বাক্য?', 'যৌগিক বাক্য', 'সাধারন বাক্য', 'মিশ্র বাক্য', 'সরল বাক্য', 'A', 5, 1),\n" +
                "(363, 'একাদশে বৃহস্পতি''-এর অর্থ কি?', 'আশার কথা', 'সৌভগ্যের বিষয়', 'আনন্দের বিষয়', 'মজার বিষয়', 'B', 5, 1),\n" +
                "(364, 'লিঙ্গান্তর হয় না এমন শব্দ কোনটি?', 'সাহেব ', 'বেহাই', 'সঙ্গী', 'কবিরাজ', 'D', 5, 1),\n" +
                "(365, 'সাধু ভাষা সাধারনত কোথায় অনুপযোগী?', 'কবিতার পঙ্কিতে', 'গানের কলিতে', 'নাটকের সংলাপে', 'গল্পের বর্ণনায়', 'C', 5, 1),\n" +
                "(366, 'দুটি পুরুষ বাচক শব্দ রয়েছে কোনটিতে?', 'ননদ', 'প্রিয়', 'শিষ্য', 'আয়া', 'A', 5, 1),\n" +
                "(367, 'বিভক্তিহীন নাম শব্দকে কি বলে?', 'নাম পদ', 'উপপদ', 'প্রতিপাদিক', 'উপমিত', 'C', 5, 1),\n" +
                "(368, 'কোন বাক্যটি দ্বারা অনুরোধ বুঝায়?', 'তুই বাড়ি যা', 'কাল একবার এসো', 'ক্ষমা করা ঘোর অপরাধ', 'দূর হও', 'B', 5, 1),\n" +
                "(369, 'ধাতুর পর কোন প্রত্যয় যুক্ত করে ভাববাচক বিশেষ্য বুঝায়?', 'আন', 'আই', 'আও', 'আলবেনীয়দের ঔদ্ধতা', 'C', 5, 1),\n" +
                "(370, 'বচন অর্থ কি?', 'সংখ্যার ধারনা', 'গননান ধারনা', 'ক্রমের ধারনা', 'পরিমাপের ধারনা', 'A', 5, 1),\n" +
                "(371, 'মরি মরি!কি সুন্দর প্রভাতের রূপ’-বাক্যে মরি মরি কোন শ্রেনীর অব্যয়?', 'সমন্বয়ী', 'অনুন্বয়ী', 'পদান্বয়ী', 'অনুকার', 'B', 5, 1),\n" +
                "(372, 'কৌশলে কার্যোদ্ধার''-কোনটির অর্থ?', 'গাছে তুলে মই কাড়া', 'এক খুড়ে মাথা মোড়ানো', 'ধরি মাছ না ছুই পানি', 'আকাশের চাদ হাতে পাওয়া', 'C', 5, 1),\n" +
                "(373, 'সন্ধি ব্যকরনের কোন অংশের আলচ্য বিষয়?', ' রুপতত্ত্ব', 'ধনিতত্ত্ব', 'পদক্রম', 'বাক্যতত্ত্ব', 'B', 5, 1),\n" +
                "(374, 'কোনটি অপ্রানীবাচক শব্দের বহুবচনে ব্যবহৃত হয়?', 'বৃন্দ', 'কুল', 'বর্গ', 'গ্রাম', 'D', 5, 1),\n" +
                "(375, 'বাঙ্গালীর ইতিহাস বইটির লেখক কে?', 'নীহাররঞ্জন রায়', 'আর সি মজুমদার', 'অধ্যাপক আব্দুল করিম', 'অধ্যাপক সুনীতি সেন', 'A', 5, 1),\n" +
                "(376, 'তৈরি পোশাক থেকে বাংলাদেশের রপ্তানী আয়ের শতকরা কত ভাগ আসে?', ' প্রায় ৫০ ভাগ', 'প্রায় ৫৪ ভাগ', 'প্রায় ৬০ ভাগ', 'প্রায় ৫৬ ভাগ', 'D', 5, 4),\n" +
                "(377, 'খুলনা হার্ডবোর্ড মিলে কাচামাল হিসেবে ব্যবহৃত হয় কোন ধরনের কাঠ?', 'চাপলিস', 'গেওয়া', 'কেওড়া', 'সুন্দরী', 'D', 5, 4),\n" +
                "(378, 'দিনাজপুর জেলার বড়পুকুরিয়ায় কিসের খনির প্রকল্পের কাজ চলছে?', 'কঠিন শিলা                         ', 'কয়লা', 'চুনা পাথর', 'সাদামাটি', 'B', 5, 4),";
        sql[8]=preSql+"";*/
        sql[0]=preSql+"(1, 'Which one of the four is least like the other three?', 'BEAR', 'SNAKE', 'COW', 'DOG', 'B', 1, 0),\n" +
                "(2, 'If you rearrange the letters \"BARBIT\", you would have the name of a.', 'OCEAN', 'COUNTRY ', 'ANIMAL', 'STATE', 'C', 1, 0),\n" +
                "(3, 'Which one of the four is least like the other three?', 'POTATO          ', 'CORN', 'BEAN ', 'APPLE', 'D', 1, 0),\n" +
                "(4, 'Which one of the four makes the best comparison?\\nBrother is to sister as niece is to:\\n', 'MOTHER          ', 'DAUGHTER', 'NEPHEW ', 'UNCLE', 'C', 1, 0),\n" +
                "(5, 'Which one of the four makes the best comparison?\\nMilk is to glass as letter is to:\\n', 'ENVELOPE    ', 'STAMP ', 'PEN', 'MAIL    ', 'A', 1, 0),\n" +
                "(6, 'Which one of the four makes the best comparison?\\nTree is to ground as chimney is to:\\n', 'SMOKE       ', 'HOUSE    ', 'GARAGE', 'SKY ', 'B', 1, 0),\n" +
                "(7, 'Which one of the four is least like the other three?', 'TOUCH          ', 'TASTE', 'HEAR', 'SMILE ', 'D', 1, 0),\n" +
                "(8, 'Which one the four is least like the other three?', 'STOCKING            ', 'PURSE', ' SHOE ', 'DRESS', 'B', 1, 0),\n" +
                "(9, 'Which number should come next in the series?\\n1 - 1 - 2 - 3 - 5 - 8 - 13', '8', '13', '21', '26', 'C', 1, 0),\n" +
                "(10, 'Which one of the four choices makes the best comparison?\\n\\nPEACH is to HCAEP as 46251 is to:', '15264', '51462', '12654', '26451', 'A', 1, 0),\n" +
                "(11, 'Mary, who is sixteen years old, is four times as old as her brother. How old will Mary be when she is twice as old as her brother?', '20', '24', '25', '26', 'B', 1, 0),\n" +
                "(12, 'Which one of the numbers does not belong in the following series?\\n\\n2 - 3 - 6 - 7 - 8 - 14 - 15 - 30', 'EIGHT', 'NINE', 'TEN', 'THIRTY', 'A', 1, 0),\n" +
                "(13, 'Which one of the four choices makes the best comparison?\\n\\n\\nFinger is to Hand as Leaf is to:\\n', 'Twig', 'Tree', 'Branch', 'Blossom', 'A', 1, 0),\n" +
                "(14, 'If you rearrange the letters \"CIFAIPC\" you would have the name of a(n):', 'City', 'River', 'Ocean', 'Country', 'C', 1, 0),\n" +
                "(15, 'Choose the number that is 1/4 of 1/2 of 1/5 of 200:', '2', '5', '10', '50', 'B', 1, 0),\n" +
                "(16, 'Choose the word most similar to \"Trustworthy\":', 'Reliable', 'Insolent', 'Relevan', 'Tenacity', 'A', 1, 0),\n" +
                "(17, 'If you rearrange the letters \"LNGEDNA\" you have the name of a(n):', 'COUNTRY', 'CITY', 'STATE', 'ANIMAL', 'A', 1, 0),\n" +
                "(18, 'Which one of the numbers does not belong in the following series?\\n\\n\\n1 - 2 - 5 - 10 - 13 - 26 - 29 - 48', '5', '26', '29', '48', 'D', 1, 0),\n" +
                "(19, 'Ralph likes 25 but not 24; he likes 400 but not 300; he likes 144 but not 145. Which does he like:', '50', '1000', '1500', '1600', 'D', 1, 0),\n" +
                "(20, 'Which one of the following things is the least like the others?', 'Novel', 'Flower', 'Statue', 'Painting', 'B', 1, 0),\n" +
                "(21, 'FFC stands for-', 'Foreign Finance Corporation', 'Film Finance Corporation', 'Federation of Football Council', 'None of the above', 'B', 2, 0),\n" +
                "(22, 'Which number should come next? 144 121 100 81 64 ?', '54', '43', '49', '41', 'C', 1, 0),\n" +
                "(23, 'Divide 30 by half and add ten. What do you get?', '70', '20', '10', '25', 'A', 1, 0),\n" +
                "(24, 'If you had only one match and entered a COLD and DARK room, where there was an oil heater, an oil lamp and a candle, which would you light first?', 'Oil heater', 'Candle', 'Oil lamp', 'Match', 'D', 1, 0),\n" +
                "(25, 'Take 2 apples from 3 apples. What do you have?', ' 1 apple', ' 2 apples', ' 3 apples', ' 4 apples', 'B', 1, 0),\n" +
                "(26, 'A boy is 4 years old and his sister is three times as old as he is. When the boy is 12 years old, how old will his sister be?', '19', '30', '20', 'Impossible to determine', 'C', 1, 0),\n" +
                "(27, 'What number is one half of one quarter of one tenth of 800?', '20', '10', '15', '12', 'B', 1, 0),\n" +
                "(28, 'Which one of the four choices makes the best comparison? LIVED is to DEVIL as 6323 is to:', '3236', '6332', '2363', '3263', 'A', 1, 0),\n" +
                "(29, 'John likes 400 but not 300; he likes 100 but not 99; he likes 2500 but not 2400. Which does he like?', '1800', '200', '900', '600', 'C', 1, 0),\n" +
                "(30, 'NASA received three messages in a strange language from a distant planet. The scientists studied the messages and found that \"Necor Buldon Slock\" means \"Danger Rocket Explosion\" and \"Edwan Mynor Necor\" means \"Danger Spaceship Fire\" and \"Buldon Gimilzor Gondor\" means \"Bad Gas Explosion\". What does \"Slock\" mean?', 'Explosion', 'Danger', 'Gas', 'Rocket', 'D', 1, 0),\n" +
                "(31, 'A farmer had 17 sheep. All but 8 died. How many live sheep were left?', '9', '8', '17', '10', 'B', 1, 0),\n" +
                "(32, 'Who was the first man on the moon?', 'Lance Armstrong', 'George Washington', 'Neil Armstrong', ' My mom', 'C', 2, 0),\n" +
                "(33, 'What year was NASA founded?', '1958', '1968', '2009', '2003', 'A', 2, 0),\n" +
                "(34, 'How many continents are there on Earth?', '20', '7', '50', 'over 100', 'B', 2, 0),\n" +
                "(35, 'You are participating in a race. You''ve just passed the second person. What position are you now in?', '1st', '2nd', '3rd', '4th', 'B', 1, 0),\n" +
                "(36, 'Who was the first Prime minister of Bangladesh?', 'Syed Nazrul Islam', 'Tajuddin Ahmed', 'Sheikh Mujibur Rahman', 'Arshad', 'B', 2, 0),\n" +
                "(37, 'There are ___ divisions in Bangladesh.', '6', '7', '8', '9', 'B', 2, 0),\n" +
                "(38, 'What part of speech is \"ultramundane\", meaning \"pertaining to supernatural things or to another life\"?', 'Adjective', 'verb', 'noun', 'adverb', 'A', 3, 0),\n" +
                "(39, 'What part of speech is \"umbrage\", meaning \"a sense of injury\"?', 'adjective', 'verb', 'adverb', 'noun', 'D', 3, 0),\n" +
                "(40, 'What part of speech is \"unanimous\", meaning \"sharing the same views or sentiments\"?', 'adjective', 'verd', 'adverb', 'noun', 'A', 3, 0),\n" +
                "(41, 'What part of speech is \"unbearable\", meaning \"unendurable\"?', 'adjective', 'verb', 'adverb', 'noun', 'A', 3, 0),\n" +
                "(42, 'What part of speech is \"unconscious\", meaning \"not cognizant of objects, actions, etc\"?', 'verb', 'adjective', 'noun', 'adverb', 'B', 3, 0),\n" +
                "(43, 'A', 'exiles', 'immigrants', 'emigrants ', 'entrants', 'B', 3, 0),\n" +
                "(44, 'Tell your brother to come........because it?s going rain in a minute or two.', 'indoors ', 'outdoors ', 'within', 'homewards', 'A', 3, 0),\n" +
                "(45, 'The use of plastics for shoes.........of leather has ruined shoe repairing as a business.', 'although ', 'as well ', 'instead ', 'outside', 'C', 3, 0),\n" +
                "(46, 'Where do you........going for your holidays this year?', 'intend ', 'guess', 'expect   ', 'pretend  ', 'A', 3, 0),\n" +
                "(47, 'I?m sorry I?m late, I was held up in a traffic........', 'block ', 'group', 'jam ', 'crush ', 'C', 3, 0),\n" +
                "(48, 'He hit the other boxer so hard that he broke his lower.......', 'chin ', 'shoulder ', 'wrist ', ' jaw', 'D', 3, 0),\n" +
                "(49, 'Her mother had asked her to do several.........before she went out .', ' labours  ', 'works ', 'travels ', 'jobs', 'D', 3, 0),\n" +
                "(50, 'When he makes a.......by car, he takes his family with him.', 'course ', 'voyage ', 'passage', 'journey', 'D', 3, 0),\n" +
                "(51, 'I can?t advise you what to do: you must use your own.......', 'guesswork', 'justice', 'judgement ', 'ideal', 'C', 3, 0),\n" +
                "(52, 'Because of the poor harvest, wheat prices have........in the last six months.', 'added ', 'jumped ', 'amounted ', 'gathered', 'B', 3, 0),\n" +
                "(53, 'You couldn?t any secrets even for an hour in that llttle town.', ' keep   ', 'get', 'learn ', 'hear', 'A', 3, 0),\n" +
                "(54, 'The police had to.......the crow   .', 'keep ? to   ', 'keep ? under ', 'keep ? back ', 'keep ? on', 'C', 3, 0),\n" +
                "(55, 'I should like to........touch with old friends but I have so little time.', 'be out of  ', 'be in ', 'keep in', 'lose', 'C', 3, 0),\n" +
                "(56, 'Shut the window and.......the cold ........', ' keep ? in  ', 'keep ? out', 'keep ? down  ', 'keep ? behind', 'B', 3, 0),\n" +
                "(57, 'You can........your shorthand ability by taking notes in shorthand during lectures.', ' keep on ', 'keep in', 'keep up ', 'keep back', 'C', 3, 0),\n" +
                "(58, 'The room was so quiet that she could hear the..........of her heart.', 'beating ', 'striking', 'knocking', 'tapping ', 'A', 3, 0),\n" +
                "(59, 'I cannot undo the........in this piece of string.', ' bunch', 'lock', 'knot ', ' tie', 'C', 3, 0),\n" +
                "(60, '............of money prevented us from taking a holiday this year.', 'Limit   ', 'Emptiness ', ' Freeze ', 'Lack', 'D', 3, 0),\n" +
                "(61, 'It was the longest film I?ve ever seen; it........four hours.', 'ended ', 'stayed', ' lasted', 'finished ', 'C', 3, 0),\n" +
                "(62, 'It is time to.......the table for dinner.', 'place ', 'lay', 'lay out', ' put out', 'B', 3, 0),\n" +
                "(63, 'After driving for five hours, the driver pulled into.......for a rest.', ' a bypass ', 'a flyover ', 'a lay-by', 'a roundabout', 'C', 3, 0),\n" +
                "(64, 'The guide is.........a line of tourists through the narrow passage with the help of his torch.', 'conducting  ', 'bringing  ', 'leading ', 'guiding', 'C', 3, 0),\n" +
                "(65, 'She tried to.........out of the window to see the procession more clearly.', 'bend ', 'bow ', 'curve ', 'lean', 'D', 3, 0),\n" +
                "(66, 'She came to England for a year in order to the language.', 'know ', 'become  ', 'refresh ', 'learn', 'D', 3, 0),\n" +
                "(67, 'I?m sorry but what he thinks is not of the.........importance to me.', 'merest   ', 'lowest   ', 'worst   ', 'least', 'D', 3, 0),\n" +
                "(68, 'The children played in the park while their mother..........', 'looked at', 'looked on', 'looked over', 'looked round', 'B', 3, 0),\n" +
                "(69, 'The police must now.........escaped convict in the surrounding counties.', ' search  ', 'look for', 'look after', 'investigate', 'B', 3, 0),\n" +
                "(70, 'As he had no friends or relatives in the town, the traveller tried to find a.........somewhere.', ' lodge  ', 'landing   ', 'lodging   ', 'stay', 'C', 3, 0),\n" +
                "(71, 'There is a 20 minute parking.........here, so we must get back to the car very quickly.', ' freedom', 'limit', 'allowance', 'ability', 'D', 3, 0),\n" +
                "(72, 'A long line of traffic had to wait at the..........until the train had passed.', ' drawbridge ', 'level crossing', 'junction', 'subway', 'B', 3, 0),\n" +
                "(73, 'You should have your eyes tested every year in case the.........of your spectacles need changing.', ' glasses ', 'panes ', ' lenses ', 'prisms', 'C', 3, 0),\n" +
                "(74, 'He offered to..........her a hand as the suitcase was too heavy for her to carry.', 'lend  ', 'show', 'loan   ', 'borrow', 'A', 3, 0),\n" +
                "(75, 'Peter begged his neighbor to.........him five pounds until the weekend.', ' lend ', 'supply', 'provide', 'hiver', 'A', 3, 0),\n" +
                "(76, 'If the boy had the dog alone it wouldn?t have bitten him.', ' set ', 'left   ', 'put   ', 'had', 'B', 3, 0),\n" +
                "(77, 'Are you going to attend Dr Barker?s........on ?Brain Electronics? tomorrow?', 'conference  ', 'lecture ', 'meeting   ', 'discussion', 'B', 3, 0),\n" +
                "(78, 'She looked everywhere for her book but.........had to return home without it.', 'lastly ', 'at the end', 'in the end', 'at the last', 'C', 3, 0),\n" +
                "(79, 'The businessman proved to be an apparently well-behaved........middle-aged man.', ' offensive ', 'unoffending', 'inoffensive   ', 'innocent', 'C', 3, 0),\n" +
                "(80, 'The local tourist bureau will send you.........about hotels in the area.', ' knowledge', 'information', 'news', 'notice', 'B', 3, 0),\n" +
                "(81, 'Sally married..........the Kennedy family.', ' with ', 'to', 'into   ', 'among', 'C', 3, 0),\n" +
                "(82, 'The boy?s allergy to dust caused his skin to........', ' itch ', 'rub ', 'blemish', 'flush', 'A', 3, 0),\n" +
                "(83, 'He has always gone.........strange hobbies like collecting bottle-tops and inventing secret codes.', ' into', 'by   ', 'in for', 'through', 'C', 3, 0),\n" +
                "(84, 'Violent programmers on television may have a bad........on children.', 'affection   B. C. D.  ', 'pressure   ', 'influence   ', 'control', 'C', 3, 0),\n" +
                "(85, 'Tell your brother to come........because it?s going rain in a minute or two.', ' indoors', 'outdoors ', 'within   ', 'homewards', 'A', 3, 0),\n" +
                "(86, 'We paid the shopkeeper.........cash.', 'in   ', 'with', 'by   ', 'on   ', 'A', 3, 0),\n" +
                "(87, 'The judge said that he was...........by the high standards of performance by the riders.', 'excited ', 'impressed ', 'interested', 'imposed', 'B', 3, 0),\n" +
                "(88, 'You can.........my surprise when I heard the news.', 'suppose ', 'think  ', 'imagine   ', 'believe', 'C', 3, 0),\n" +
                "(89, 'HTML is what type of language ? ', 'Scripting Language ', 'Programming Language', 'Markup Language', 'Network Protoco', 'C', 4, 0),\n" +
                "(90, 'Fundamental HTML Block is known as', 'HTML Body ', ' HTML Tag', 'HTML Attribute', 'HTML Element', 'B', 4, 0),\n" +
                "(91, 'Apart from <b> tag, what other tag makes text bold ? ', '<fat>', '<strong>', ' <emp>', '<black>', 'B', 4, 0),\n" +
                "(92, 'What is the full form of HTML?', 'HyperText Markup Language ', 'Hyper Tech Markup Language', ' Hyper Teach Markup Language', 'None of these', 'A', 4, 0),\n" +
                "(93, 'What should be the first tag in any HTML document? ', '<head>', '<title>', '<html>', '<document>', 'C', 4, 0),\n" +
                "(94, 'Which HTML tag produces the biggest heading? ', '<h4>', '<h5>', '<h1>', '<h6>', 'C', 4, 0),\n" +
                "(95, 'Which of the following is not a browser ? ', 'Microsofts Bing ', 'Netscape Navigator', 'Mozilla Firefox', 'Opera', 'A', 4, 0),\n" +
                "(96, 'HTML uses ', 'User defined tags', 'Fixed tags defined by the language', 'Pre-specified tags', 'Tags only for linking', 'B', 4, 0),\n" +
                "(97, 'What does CSS stand for?', 'Colorful Style Sheets      ', 'Creative Style Sheets', 'Computer Style Sheets', 'Cascading Style Sheets', 'D', 4, 0),\n" +
                "(98, 'Which HTML tag is used to define an internal style sheet?', ' <css>   ', '<script> ', '<style>', 'none', 'C', 4, 0),\n" +
                "(99, 'Which CSS property controls the text size?', 'font-size   ', 'font-style', 'text-size  ', 'text-style ', 'A', 4, 0),\n" +
                "(100, 'How do you select an element with id \"demo\"?', 'demo', '.demo', '#demo', 'none', 'C', 4, 0),\n" +
                "(101, 'ATM means----', 'Any Time Money', 'Automated Teller Machine', 'Automatic Teller Machine', 'none', 'B', 2, 0),\n" +
                "(102, 'What does PHP stand for?', 'Private Home Page    ', 'Personal Hypertext Processor', 'PHP: Hypertext Preprocessor', 'none', 'C', 4, 0),\n" +
                "(103, 'How do you write \"Hello World\" in PHP', 'Document.Write(\"Hello World\");   \"Hello World\";', 'echo \"Hello World\";', '\"Hello World\";', 'none', 'B', 4, 0),\n" +
                "(104, 'All variables in PHP start with which symbol?', '!  ', '$', '&  ', '#', 'B', 4, 0),\n" +
                "(105, 'What is the correct way to end a PHP statement?', ',', '.', ';', '</PHP>', 'C', 4, 0),\n" +
                "(106, 'I ____ tennis every Sunday morning.', 'play', 'am playing', 'am play', 'playing', 'A', 3, 0),\n" +
                "(107, 'Don''t make so much noise. Noriko ______ to study for her ESL test!', 'try', 'tries', 'is trying', 'tried', 'C', 3, 0),\n" +
                "(108, 'Jun-Sik ______ his teeth before breakfast every morning.', 'will cleaned \t', 'is cleaning', 'cleans', 'clean', 'C', 3, 0),\n" +
                "(109, 'Sorry, she can''t come to the phone. She ____ a bath!', 'is having', 'have', 'having', 'has', 'A', 3, 0),\n" +
                "(110, '______ many times every winter in Frankfurt.', 'It snows \t\t', 'It is snow', 'It is snowing ', 'It snowed \t', 'A', 3, 0),\n" +
                "(111, 'How many students in your class _____ from Korea?', 'are coming', 'came', 'comes', 'come', 'D', 3, 0),\n" +
                "(112, 'Weather report: \"It''s seven o''clock in Frankfurt and _________ .\"', 'it`s snowing', 'it snows \t', 'it snowed', 'there is snow', 'A', 3, 0),\n" +
                "(113, 'Babies_____ when they are hungry.', 'cry \t \t\t', 'cries', 'cried ', 'are crying', 'A', 3, 0),\n" +
                "(114, 'Jane: \"What ______in the evenings?\"\\r\\nMary: \"Usually I watch TV or read a book.\"', 'you doing \t \t \t', 'you do', 'do you do', 'are you doing', 'C', 3, 0),\n" +
                "(115, 'Jane: \"What _______ ?\" \\r\\nMary: \"I''m trying to fix my calculator.\"', 'you doing \t \t', 'you do ', 'do you do', 'are you doing', 'D', 3, 0),\n" +
                "(116, 'Jane _____ her blue jeans today, but usually she wears a skirt or a dress.', 'is wearing', 'wear', 'wears', 'wearing', 'A', 3, 0),\n" +
                "(117, 'I think I ____ a new calculator. This one does not work properly any more.', 'needs \t\t \t', 'needed ', 'need', 'am needing', 'C', 3, 0),\n" +
                "(118, 'Sorry, you can''t borrow my pencil. I ____it myself.', 'was using \t\t\t', 'am using', 'using ', 'use ', 'B', 3, 0),\n" +
                "(119, '\tAt a school dance:\\r\\nJane: \"_______ yourself?\"\\r\\nMary: \"Yes, I''m having a great time!\"', 'Are you enjoying', 'You enjoying', 'Enjoy you', 'Do you enjoy', 'A', 3, 0),\n" +
                "(120, 'I''ve just finished reading a story called Dangerous Game. It''s about a man who ____his wife because he doesn''t want to lose her.', 'kills \t\t', 'killed ', 'kill \t', 'is killing', 'A', 3, 0),\n" +
                "(121, 'What time____________?', 'the train leaves? \t \t\t', 'is the train leaving?', 'leaves the train?', 'does the train leave?', 'D', 3, 0),\n" +
                "(122, 'Jane: \"Are you going to the dance on Friday?\" \\r\\nMary: \"No, I''m not.__________school dances; they''re loud, hot and crowded!\"', 'not enjoy  \t\t', 'don`t enjoy', 'doesn`t enjoy ', 'am not enjoying', 'B', 3, 0),\n" +
                "(123, 'I ______ for my pen. Have you seen it?', 'will look \t \t \t', 'looking', 'look', 'am looking', 'D', 3, 0),\n" +
                "(124, 'You can keep my iPod if you like. I ______ it any more.', 'don`t use ', 'doesn`t use \t\t', 'didn`t use ', 'am not using', 'A', 3, 0),\n" +
                "(125, 'The phone ______ Can you answer it, please?', 'rings \t \t\t', 'ring', 'rang ', 'is ringing', 'D', 3, 0),\n" +
                "(126, 'I come ..... Italy.', 'to', 'from', 'at', 'in', 'B', 3, 0),\n" +
                "(127, 'Ann, how are you?', 'I''m a nurse.', 'I''m fine, thanks. And you?', 'I am working', 'Good', 'B', 3, 0),\n" +
                "(128, 'Whose key is that?', 'It''s of Cate.', 'It''s Cate''s.', 'It''s Cate.', 'It''s to Cate.', 'B', 3, 0),\n" +
                "(129, 'His office is on the first ........', 'level', 'ground', 'stage', 'floor', 'D', 3, 0),\n" +
                "(130, 'I can''t find my glasses. Can you look for.., please?', 'they', 'them', 'it', 'their', 'B', 3, 0),\n" +
                "(131, '...... there any cars on the street?', 'Are', 'Is', 'Am', 'Isn''t', 'A', 3, 0),\n" +
                "(132, '(On the phone) Hello. Juliet .........', 'speak', 'speaking', 'talking', 'talk', 'B', 3, 0),\n" +
                "(133, 'do you go to the gym? - Twice a week.', 'How offten', 'How', 'Why', 'Where', 'A', 3, 0),\n" +
                "(134, 'I like ........ in my spare time', 'reading', 'read', 'to read', 'to reading', 'C', 3, 0),\n" +
                "(135, 'Chopin .................. music when he was three.', 'can read', 'could read', 'can to read', 'can''t read', 'B', 3, 0),\n" +
                "(136, 'I ......... born in 1992.', 'was', 'am', 'were', 'is', 'A', 3, 0),\n" +
                "(137, 'Where ......... Ann and Mary at 6 pm yesterday?', 'are', 'were', 'was', 'have been', 'B', 3, 0),\n" +
                "(138, 'I went to the bookshop .................... ''Harry Potter''.', 'for buying', 'to buy', 'to buying', 'for to buy', 'B', 3, 0),\n" +
                "(139, 'He is interested ......... learning Romanian.', 'in', 'on', 'to ', 'for', 'A', 3, 0),\n" +
                "(140, 'Would you like .......... to drink, sir?', 'anything', 'nothing', 'anywhere', 'something', 'D', 3, 0),\n" +
                "(141, 'The doctor gave me a ..........for some medicine last week.', 'note', 'recipe', 'prescription', 'receipt', 'C', 3, 0),\n" +
                "(142, 'What .................... next weekend?', 'do yoy do', 'are you doing', 'will you do', 'did you do', 'C', 3, 0),\n" +
                "(143, '''Why are you so hungry?''\\r\\n''Oh, I .................... breakfast this morning.''', 'didn''t have', 'don''t have', 'hadn''t', 'haven''t', 'A', 3, 0),\n" +
                "(144, 'Look! The bus .......................', 'are coming', 'is coming', 'come', 'comes', 'B', 3, 0),\n" +
                "(145, '- ''I have never been to Africa.'' - '' ........... have I.''', 'Either', 'Neither', 'So', 'No', 'B', 3, 0),\n" +
                "(146, '''Have you visited Birmingham?'' '' ............ ''', 'Not', 'Not yet', 'Ever', 'Already', 'B', 3, 0),\n" +
                "(147, 'My mother ............. the carpet when I got home\\nyesterday afternoon.', 'is hoovering', 'are hoovering', 'was hoovering', 'were hoovering', 'B', 3, 0),\n" +
                "(148, 'My aunt .................. come to our wedding reception\\nnext month.', 'will', 'isn''t', 'aren''t going to', 'isn''t going to', 'B', 3, 0),\n" +
                "(149, 'I promise I .................. study harder.', 'will', 'am going to', 'may', 'must', 'B', 3, 0),\n" +
                "(150, 'Is Emma ................... Carla?', 'as tall as', 'tall as', 'more tall', 'taller that', 'A', 3, 0),\n" +
                "(151, 'Where is ..................... chemist''s, please?', 'the nearest', 'nearer', 'the most near', 'more near', 'A', 3, 0),\n" +
                "(152, 'Is that purse ............. ?', 'to you', 'you', 'yours', 'your', 'C', 3, 0),\n" +
                "(153, 'I ................... my mobile phone since 2009.', 'have had', 'have', 'had', 'am having', 'A', 3, 0),\n" +
                "(154, 'How long .......................... English?', 'are you learning', 'have you been learning', 'do you learn', 'you learn', 'B', 3, 0),\n" +
                "(155, 'We ................. the flight tickets yet.', 'don''t book', 'have booked', 'haven''t book', 'didn''t book', 'C', 3, 0),\n" +
                "(156, 'When Simon .........back tonight, he''ll do the washing up.', 'will come', 'comes', 'come', 'shall come', 'A', 3, 0),\n" +
                "(157, 'Would you mind ............... the gate, please?', 'closing', 'to close', 'close', 'closed', 'A', 3, 0),\n" +
                "(158, 'I ............ smoke when I was 20.', 'use to', 'used to', 'wouldn''t', 'couldn''t', 'B', 3, 0),\n" +
                "(159, 'You should ............ martial arts.', 'get off', 'start up', 'take up', 'take off', 'D', 3, 0),\n" +
                "(160, 'Could you tell me when ................................. ?', 'does the train leave', 'the train leaves', 'does leave the train', 'leaves the train', 'A', 3, 0),\n" +
                "(161, '............. did you travel with?', 'How', 'Who', 'Whose', 'What', 'B', 3, 0),\n" +
                "(162, 'Look out! You ..................... off the bike.', 'will fall', 'are going to fall', 'are falling', 'might fall', 'D', 3, 0),\n" +
                "(163, 'You ....... see a doctor.', 'did', 'would', 'should', 'had', 'C', 3, 0),\n" +
                "(164, 'My mobile phone  . . . . . . . . . .', 'has been stolen', 'has stolen', 'have been stolen', 'stole', 'A', 3, 0),\n" +
                "(165, 'Carla ........... me to go to university.', 'who', 'whose', 'that', 'which', 'B', 3, 0),\n" +
                "(166, 'If I were a prince, I ....... . . ....... a palace.', '''d have', '''ll have', '''d have had', 'have', 'A', 3, 0),\n" +
                "(167, 'Drive ............... otherwise you''ll have an accident.', 'more careful', 'less carefully', 'more carefully', 'much more careful', 'C', 3, 0),\n" +
                "(168, 'If they ............ next to each other on the plane, they\\r\\nwouldn''t have got married.', 'hadn''t sat', 'had sat', 'sat', 'didn''t sit', 'A', 3, 0),\n" +
                "(169, '.................. the better team, we lost the match.', 'despite being', 'despite of being', 'although', 'despite the fact', 'A', 3, 0),\n" +
                "(170, 'If only I ......... . . . . . richer', 'am', 'was', 'were', 'have been', 'C', 3, 0),\n" +
                "(171, 'I am fed up ............... . . . this exercise.', 'to do', 'to doing', 'with doing', 'for doing', 'A', 3, 0),\n" +
                "(172, 'By this time next year, I ................ all my exams', 'will take', 'will have taken', 'have taken', 'take', 'B', 3, 0),\n" +
                "(173, 'They have put speed bumps on the road to....................\\r\\naccidents', 'prohibit', 'prevent', 'avoid', 'forbid', 'B', 3, 0),\n" +
                "(174, 'You ............................. to use your mobile so there''s\\r\\nno point in leaving it on.', 'are allowed', 'have', 'aren''t allowed', 'can''t', 'C', 3, 0),\n" +
                "(175, 'It was ........... boring film that I fell asleep.', 'as', 'so ', 'such', 'such as', 'D', 3, 0),\n" +
                "(176, 'She has been . . . . . . . . . . . . . of murdering her husband.', 'charged', 'arrested', 'blamed', 'accused', 'D', 3, 0),\n" +
                "(177, 'Which number should come next in the pattern? 37, 34, 31, 28----\\r\\n', '36', '33', '30', '25', 'D', 1, 0),\n" +
                "(178, 'Book is to Reading as Fork is to:\\r\\n', 'drawing', 'writing', 'stirring', 'eating', 'D', 1, 0),\n" +
                "(179, 'Which of the following can be arranged into a 5-letter English word?\\r\\n', 'H R G S T', 'R I L S A', 'T O O M A', 'W Q R G S', 'B', 1, 0),\n" +
                "(180, 'What number best completes the analogy:\\r\\n8:4 as 10: ________', '3', '7', '24', '5', 'D', 1, 0),\n" +
                "(181, 'If there are 6 apples and you take away 4, how many do you have?', '10', '2', '4', '6', 'C', 1, 0),\n" +
                "(182, 'At a conference, 12 members shook hands with each other before & after the meeting. How many total number of hand shakes occurred?', '100 ', '132 ', '145 ', '144', 'B', 1, 0),\n" +
                "(183, 'The day after the day after tomorrow is four days before Monday. What day is it today?', 'Monday ', 'Tuesday ', 'Wednesday ', 'Thursday ', 'A', 1, 0),\n" +
                "(184, 'A fisherman has 4 fishes (namely A, B, C,D) each having a different weight.\\r\\n(i) A weighs twice as much as B.\\r\\n(ii) B weighs four and a half times as much as C.\\r\\n(iii)C weighs half as much as D.\\r\\n(iv) D weighs less than A but more than B.\\r\\nWhich of the following is the lightest?', 'A', 'B', 'C', 'D', 'C', 1, 0),\n" +
                "(185, '6121135 is to flame as 21215120 is to ?', 'voice . ', 'bald ', 'bloat ', 'castle', 'C', 1, 0),\n" +
                "(186, 'Forest is to tree as tree is to ?', 'plant ', 'leaf', 'branch ', 'mangrove', 'B', 1, 0),\n" +
                "(187, '2, 6, 1, 3, 0.5, 1.5, ? What is the missing number?', '3', '0.25', '0.15', '0.50', 'B', 1, 0),\n" +
                "(188, '1, c, 4, f, 7, i, 10, ?', 'J', 'K', 'L', 'M', 'L', 1, 0),\n" +
                "(189, 'Observe the pattern: T/3/Q/6/N/9/K/12/H/15/E/18/ ??? What comes next in this pattern?', '21', 'D', 'B', 'C', 'C', 1, 0),\n" +
                "(190, '1-2-4-8-16-32-64-128-256-???-??-??? What are the 3 missing numbers?', '512-1026-2058', '512-1026-2038', '512-1026-2048', '512-1026-2068', 'C', 1, 0),\n" +
                "(191, '-g-t-y- -y-g-t- -t-y-g-   -h-u-z- -z-h-u- -u-z-h- What will the 3 values of the next grid be?', 'I-w-z ', 'J-v-a', 'I-v-z', ' I-v-a', 'D', 1, 0),\n" +
                "(192, 'Observe the pattern? 2/AB/4/CD/9/EF/16/GH/25/IJ/??/??/?? What are the missing values?', '36/KL/48', '36/KL/56', '36/KL/49', '36/JK/48', 'B', 1, 0),\n" +
                "(193, 'How many vowels appear in this question?', '10', '12', '13', '14', 'B', 1, 0),\n" +
                "(194, 'If you move 5 steps north, 4 steps east, 3 steps north, 5 steps west, 12 steps south, then 1 step east, how many squares are you from the starting point?', '2', '4', '6', '12', 'B', 1, 0),\n" +
                "(195, '2, 20, 1, 10, 0.5, 5, 0.25, 2.5, 0.125, 1.25, ?? What comes next in the pattern?', '0.0620', '0.0625', ' 0.625', '0.00625', 'B', 1, 0),\n" +
                "(196, 'What does SQL stand for?', 'Structured Query Language  ', ' Strong Question Language', 'Structured Question Language ', 'none', 'A', 4, 0),\n" +
                "(197, 'Which answer expresses the meaning of the specified word best?\\r\\nreassuring_______', 'compassionate   ', 'comforting   ', 'explanatory   ', 'meddlesome', 'B', 1, 0),\n" +
                "(198, 'Which number logically follows this series?\\r\\n4     6     9     6     14     6      ......', '6', '17', '19', '21', 'C', 1, 0),\n" +
                "(199, 'Which conclusion follows from the statements with absolute certainty?\\r\\n\\r\\n1.None of the stamp collectors is an architect.\\r\\n2.All the drones are stamp collectors.', 'all stamp collectors are architects', 'architects are not drones', 'no stamp collectors are drones', 'some drones are architects ', 'B', 1, 0),\n" +
                "(200, 'Which answer expresses the meaning opposite of that of the specified word best?\\r\\n\\r\\ntough_____', ' cowardly   ', 'starch   ', 'strong   ', 'tender', 'D', 3, 0),\n" +
                "(201, 'Water is to a pipe as ? is to a wire.', 'cord', ' electricity', 'heat', 'gas', 'B', 1, 0),\n" +
                "(202, 'Which number should come next in this series?\\r\\n10, 17, 26, 37, ?', '56', '52', '50', '56', 'C', 1, 0),\n" +
                "(203, 'If 10 people can do a piece of work in 5 days, working 2 hours a day, how long will 2 people take to do the same work, working 5 hours a day?', '8', '5', '10', '12', 'C', 1, 0),\n" +
                "(204, 'Grand Central Terminal, Park Avenue, New York is the world''s', 'largest railway station', 'highest railway station', 'longest railway station', 'None of the above', 'A', 2, 0),\n" +
                "(205, 'Entomology is the science that studies', 'Behavior of human beings', 'Insects', 'The origin and history of technical and scientific', 'The formation of rocks', 'B', 2, 0),\n" +
                "(206, 'Eritrea, which became the 182nd member of the UN in 1993, is in the continent of', 'Asia ', 'Africa', 'Europe ', 'Australia', 'B', 2, 0),\n" +
                "(207, 'Garampani sanctuary is located at', 'Junagarh, Gujarat\t', 'Diphu, Assam', 'Kohima, Nagaland', 'Gangtok, Sikkim', 'B', 2, 0),\n" +
                "(208, 'For which of the following disciplines is Nobel Prize awarded?', 'Physics and Chemistry', 'Physiology or Medicine', 'Literature, Peace and Economics', 'All of the above', 'D', 2, 0),\n" +
                "(209, 'Hitler party which came into power in 1933 is known as', 'Labour Party', 'Nazi Party', 'Ku-Klux-Klan', 'Democratic Party', 'B', 2, 0),\n" +
                "(210, 'Fastest shorthand writer was', 'Dr. G. D. Bist', 'J.R.D. Tata', 'J.M. Tagore', 'Khudada Khan', 'A', 2, 0),\n" +
                "(211, 'Epsom (England) is the place associated with', 'Horse racing ', 'Polo ', 'Shooting ', 'Snooker', 'A', 2, 0),\n" +
                "(212, 'First human heart transplant operation conducted by Dr. Christiaan Barnard on Louis Washkansky, was conducted in', '1967', '1977', '1958', '1922', 'A', 2, 0),\n" +
                "(213, 'Golf player Vijay Singh belongs to which country?', 'USA \t', 'Fiji ', 'India ', 'UK', 'B', 2, 0),\n" +
                "(214, 'Guarantee to an exporter that the importer of his goods will pay immediately for the goods ordered by him, is known as', 'Letter of Credit (L/C)\t', 'laissezfaire ', 'inflation ', 'None of the above', 'A', 2, 0),\n" +
                "(215, 'First Afghan War took place in', '1839', '1843', '1863', '1848', 'A', 2, 0),\n" +
                "(216, 'First China War was fought between', 'China and Britain', 'China and France', 'China and Egypt', 'China and Greek', 'A', 2, 0),\n" +
                "(217, 'For the Olympics and World Tournaments, the dimensions of basketball court are', '26 m * 14 m', '28 m * 15 m', '27 m * 15 m', '28 m * 16 m', 'B', 2, 0),\n" +
                "(218, 'Federation Cup, World Cup, Allywyn International Trophy and Challenge Cup are awarded to winners of', 'Tennis ', 'Volleyball ', 'Basketball ', 'Cricket', 'B', 2, 0),\n" +
                "(219, 'Each year World Red Cross and Red Crescent Day is celebrated on', 'May 8 ', 'May 18', 'June 8', 'June 18', 'A', 2, 0),\n" +
                "(220, 'Friction can be reduced by changing from', 'sliding to rolling ', 'rolling to sliding', 'potential energy to kinetic energy', 'dynamic to static', 'A', 2, 0),\n" +
                "(221, 'Fire temple is the place of worship of which of the following religion?', 'Taoism', 'Judaism ', 'Zoroastrianism (Parsi Religion)', 'Shintoism', 'C', 2, 0),\n" +
                "(222, 'Film and TV institute of India is located at', 'Pune (Maharashtra) \t', 'Rajkot (Gujarat)', 'Pimpri (Maharashtra)', 'Perambur (Tamilnadu)', 'A', 2, 0),\n" +
                "(223, 'Georgia, Uzbekistan and Turkmenistan became the members of UNO in', '1991 \t', '1992 ', '1993 ', '1994', 'B', 2, 0),\n" +
                "(224, 'During World War II, when did Germany attack France?', '1940', '1941', '1942', '1943', 'A', 2, 0),\n" +
                "(225, 'The ozone layer restricts', 'Visible light ', 'Infrared radiation', 'X-rays and gamma rays', 'Ultraviolet radiation', 'D', 2, 0),\n" +
                "(226, 'Filaria is caused by', 'Bacteria \t', 'Mosquito ', 'Protozoa ', 'Virus', 'B', 2, 0),\n" +
                "(227, 'Goa Shipyard Limited (GSL) was established in', '1958 ', '1957 ', '1956 ', '1955', 'B', 2, 0),\n" +
                "(228, 'Who was the first Indian Chief of Army Staff of the Indian Army ?', 'Gen. K.M. Cariappa', 'Vice-Admiral R.D. Katari', 'Gen. Maharaja Rajendra Singhji', 'None of the above', 'A', 2, 0),\n" +
                "(229, 'FRS stands for', 'Fellow Research System', 'Federation of Regulation Society', 'Fellow of Royal Society', 'None of the above', 'C', 2, 0),\n" +
                "(230, 'Coral reefs in India can be found in', 'the coast of Orissa', 'Waltair', 'Rameshwaram', 'Trivandrum', 'C', 2, 0),\n" +
                "(231, 'Heavy Water Project (Talcher) and Fertilizer plant (Paradeep) are famous industries of', 'Orissa B.\tC.\t D.\t', 'Tamil nadu', 'Andhra Pradesh', 'Kerala', 'A', 2, 0),\n" +
                "(232, 'Hamid Karzai was chosen president of Afghanistan in', '2000', '2001', '2002', '2003', 'C', 2, 0),\n" +
                "(233, 'Durand Cup is associated with the game of', 'Cricket ', 'Football ', 'Hockey ', 'Volleyball', 'B', 2, 0),\n" +
                "(234, 'Headquarters of UNO are situated at', 'New York, USA ', 'Hague (Netherlands)', 'Geneva ', 'Paris', 'A', 2, 0),\n" +
                "(235, 'Fathometer is used to measure', 'Earthquakes', 'Rainfall', 'Ocean depth', 'Sound intensity', '3', 2, 0),\n" +
                "(236, 'For galvanizing iron which of the following metals is used?', 'Aluminium', 'Copper', 'Lead', 'Zinc', 'D', 2, 0),\n" +
                "(237, 'Firdausi was', 'a poet ', 'well known for his epic ''Shahnama''', 'Both option A and B', 'None of the above', 'C', 2, 0),\n" +
                "(238, 'Himalayan Mountaineering Institute is at', 'Darjeeling', 'Dehradun', 'Marmago', 'Dispur', 'A', 2, 0),\n" +
                "(239, 'Gabriel Daniel Fahrenheit was', 'a German Physicist', 'developed the mercury thermometer in 1714', 'devised temperature scale', 'All of the above', 'D', 2, 0),\n" +
                "(240, 'During the first crusade, crusaders reached Jerusalem and captured it in', '1000 AD', '1099 AD', '1200 AD', '1515 AD', 'B', 2, 0),\n" +
                "(241, 'East Timor, which became the 191st member of the UN, is in the continent of', 'Asia ', 'Africa ', 'Europe', 'South America', 'A', 2, 0),\n" +
                "(242, 'GNLF stands for', 'Gorkha National Liberation Front', 'Gross National Liberation Form', 'Both option A and B', 'None of the above', 'A', 2, 0),\n" +
                "(243, 'Excessive secretion from the pituitary gland in the children results in', 'increased height', 'retarded growth', 'weakening of bones', 'None of the above', 'A', 2, 0),\n" +
                "(244, 'Which was the 1st non Test playing country to beat India in an international match?', 'Canada ', 'Sri Lanka ', 'Zimbabwe ', 'East Africa', 'B', 2, 0),\n" +
                "(245, 'Who is the first Indian woman to win an Asian Games gold in 400m run?', 'M.L.Valsamma', 'P.T.Usha', 'Kamaljit Sandhu', 'K.Malleshwari', 'C', 2, 0),\n" +
                "(246, 'Ricky Ponting is also known as what?', 'The Rickster', 'Ponts ', 'Ponter ', 'Punter', 'D', 2, 0),\n" +
                "(247, 'How long are professional Golf Tour players allotted per shot?', '45 seconds ', '25 seconds', '1 minute', '2 minutes', 'A', 2, 0),\n" +
                "(248, 'The first hang gliders to be flown were flown in', '1600s', '1700s', '1800s', '1900s', 'C', 2, 0),\n" +
                "(249, 'The nickname of Glenn McGrath is what', 'Ooh Ahh', 'Penguin ', 'Big Bird', 'Pigeon', 'D', 2, 0),\n" +
                "(250, 'Mark Waugh is commonly called what', 'Afganistan ', 'Junior ', 'Tugga', 'Julio', 'B', 2, 0),\n" +
                "(251, 'India won its first Olympic hockey gold in', '1928 ', '1932 ', '1936', '1948', 'A', 2, 0),\n" +
                "(252, 'How many times did Geet Sethi win the lBSF World Billiards title', '2', '3', '4', '5', 'B', 2, 0),\n" +
                "(253, 'Who won the 1993 \"King of the Ring\"', 'Owen Hart', 'Bret Hart', 'Edge ', 'Mabe', 'B', 2, 0),\n" +
                "(254, 'Who was the 1st ODI captain for India', 'Ajit Wadekar ', 'Bishen Singh Bedi', 'Nawab Pataudi', 'Vinoo Mankad', 'A', 2, 0),\n" +
                "(255, 'Where did India play its 1st one day international match', 'Lords\t', 'Headingley ', 'Taunton ', 'The Oval', 'B', 2, 0),\n" +
                "(256, 'India reached the final of the Davis Cup for the first time in', '1964 ', '1966 ', '1970', '1974', 'B', 2, 0),\n" +
                "(257, 'In which Indian state did the game of Polo originate', 'Meghalaya ', 'Rajasthan', 'Manipur ', 'West Bengal', 'C', 2, 0),\n" +
                "(258, 'Which cricketer died on the field in Bangladesh while playing for Abahani Club', 'Subhash Gupte ', 'M.L.Jaisimha', 'Lala Amarnath', 'Raman Lamba', 'D', 2, 0),\n" +
                "(259, 'Which of the following is a Manipuri version of Hockey', 'Khong Kangjei', 'Hiyang Tanaba ', 'Yubi Lakpi', 'None of above', 'A', 2, 0),\n" +
                "(260, 'Where did the 1st ODI match was played in India', 'New Delhi ', 'Ahmedabad ', 'Kolkata ', 'Mumbai', 'B', 2, 0),\n" +
                "(261, 'What is the name of the person that controls a football match', 'A referee', 'An umpire ', 'A spectator', 'A goalkeeper', 'A', 2, 0),\n" +
                "(262, 'The Indian football team made its first appearance at Olympics in', '1936 ', '1948 ', '1952 ', '1956', 'B', 2, 4),\n" +
                "(263, 'Who was the first captain of Indian Test team', 'Vijay Hazare ', 'C K Nayudu', 'Lala Amarnath', 'Vijay Merchant', 'B', 2, 4),\n" +
                "(264, 'Which country won the Cricket World Cup in 1999', 'Australia ', 'South Africa', 'Pakistan', 'England', 'A', 2, 0),\n" +
                "(265, 'The name Kunjarani Devi is associated with', 'Weight Lifting', 'Target shooting', 'Athletics', 'Swimming', 'B', 2, 0),\n" +
                "(266, 'How many gold medals have been won by India in the Olympics so far', '4', '8', '9', '10', 'C', 2, 0),\n" +
                "(267, 'Who has scored the most Test hundreds ever', 'Steve Waugh', 'Sachin Tendulkar', 'Shane Warne', 'Sunil Gavaskar', 'B', 2, 0),\n" +
                "(268, 'When was the first cricket Test match played', '1873', '1877 ', '1870 ', '1788', 'B', 2, 0),\n" +
                "(269, 'Choose the correct alternative to complete the sentence.\"He ? to see us he had been able to\"', 'would come                      ', 'would have come', 'may have come ', 'bad attack ', 'A', 5, 2),\n" +
                "(270, 'Choose the correct sentence.', 'I asked Javed had he passed ', 'I asked Javed if he had passed', 'I asked Javed if you had passed ', 'I asked Javed that had he passed', 'B', 5, 2),\n" +
                "(271, 'Choose the correct sentence.', 'A few of the three boys got a prize', 'Each of the three boys got a prize ', 'Every of the three boys got a prize ', 'All of the three boys got a prize ', 'B', 5, 2),\n" +
                "(272, 'Choose the correct sentence.', 'The man that said that was a fool', 'The man who said that was a fool', 'The man that said that was a fool', 'The man which said that was a fool', 'B', 5, 2),\n" +
                "(273, 'Choose the correct answer. How long did you wait', 'Till lunch time', 'Till he came', 'Until six o''clock ', 'Since this morning', 'B', 5, 2),\n" +
                "(274, 'What will be the correct preposition to complete the sentence? \"I am not bad...tennis\"', 'in', 'at ', 'about ', 'with ', 'B', 5, 2),\n" +
                "(275, 'What is the antonym of gentle?', 'harsh        ', 'modest        ', 'clever        ', 'rude', 'D', 5, 2),\n" +
                "(276, 'What is the synonym of ''Jovial?''', 'Jolly        ', 'Gay        ', 'Jealous        ', 'Happy', 'A', 5, 2),\n" +
                "(277, 'What is the synonym of ''Competent?''', 'Circumspect        ', 'Discrete        ', 'Capable        ', 'Prudent', 'C', 5, 2),\n" +
                "(278, 'Who is the auther of \"A Farewell to Arms\"?', 'H. G. WeUs                        ', 'George Orwel', 'Thomas Hardy', 'Ernest Hemingway', 'D', 5, 2),\n" +
                "(279, 'Who is the auther of \"Animal Farm\"? ', 'Thomas More                       ', 'George Orwel', 'Boris Pasternak', 'Charles Dickens', 'B', 5, 2),\n" +
                "(280, 'Who is the author of \"India Wins Freedom\"?', 'Mahatma Gandhi                      ', 'J. L. Nehru  ', 'Abul Kalam Azad', 'Debashish', 'C', 5, 2),\n" +
                "(281, 'what kind of noun is \"Cattle\"?', 'Proper        ', 'Collective        ', 'Common        ', 'Material ', 'B', 5, 2),\n" +
                "(282, 'What kind of noun is \"Girl\"?', 'Proper         ', 'Collective        ', 'Common        ', 'Material', 'C', 5, 2),\n" +
                "(283, 'What is the meaning of \"White Elephant\"?', 'An elephant of white colour', 'A very costly or troublesome possession ', 'A black marketer ', 'A hoarder', 'B', 5, 2),\n" +
                "(284, 'Which of the following sentence is correct? ', 'I forbad him from going', 'I forbade him to go', 'I forbade him going ', 'I forbade him not to go ', 'B', 5, 2),\n" +
                "(285, 'Which of the following is a correct proverb?', 'Fools rush in where angels fear to tread', 'Fools rush in where an angels fear to tread', 'A Fool rushes in where an angels fears to tread', 'fools rush in where the angels fear to tread', 'A', 5, 2),\n" +
                "(286, 'Which of the following sentence is correct? ', 'Why you have done this', 'Why did you have done this', 'Why have you done this', 'Why you had done this', 'C', 5, 2),\n" +
                "(287, 'Which of the following sentence is correct?', 'That shirt which he bought is blue in colour', 'Which shirt he bought is blue in colour ', 'The shirt which he bought is blue in colour ', 'None', 'D', 5, 2),\n" +
                "(288, 'The correct passive of \"Sheila was writing a letter\" is', 'A letter was being writing by Sheila', 'A letter was written by Sheila', 'A letter was being was being written by Sheila', 'A letter was being written by Sheila ', 'D', 5, 2),\n" +
                "(289, 'Which of the following sentences is correct?', 'One of my friends are a lawyer ', 'One of my friends is a lawyer ', 'One of my friend is a lawyer', 'One of my friends are a lawyers', 'B', 5, 2),\n" +
                "(290, 'The word ecological is related to', 'Atmosphere', 'Pollution', 'Environment', 'Demography ', 'C', 5, 2),\n" +
                "(291, 'The synonym of ''genesis'' is', 'Introduction        ', 'Preface', 'Beginning', 'Foreword', 'C', 5, 2),\n" +
                "(292, 'The word ''homogeneous'' means', 'Of the same kind', 'Of the same place', 'Of the same race  ', 'Of the same density', 'A', 5, 2),\n" +
                "(293, 'The word ''imbibe'' means-', 'To learn                        ', 'To tinge', 'To drink', 'To acquire', 'C', 5, 2),\n" +
                "(294, 'Something which is obnoxious means that it is', 'very dangerous', 'very pleasant', 'very ugly', 'very unpleasant', 'D', 5, 2),\n" +
                "(295, 'A pilgrim is a person who undertakes a journey to a', 'holy place', 'a mosque', 'a bazar', 'a new country', 'A', 5, 2),\n" +
                "(296, 'Shakespeare is known mostly for his', 'poetry', 'novels', 'autobiography  ', 'plays', 'D', 5, 2),\n" +
                "(297, 'A person who writes about his own life writes', 'a chronicle ', 'an autobiography ', 'a diary ', 'a biography', 'B', 5, 2),\n" +
                "(298, 'In which century was the Victorian period?', '17th century', '18th century', '19th century', '20th century', 'D', 5, 4),\n" +
                "(299, 'গিরিজা প্রসাদ কৈরালা কত তারিখে নেপালের প্রধান মন্ত্রী হিসেবে পদত্যাগ করেন?', '৮ জুলাই ১৯৯৪', '১০ জুলাই ১৯৯৪', '৯ জুলাই ১৯৯৪', '১১ জুলাই ১৯৯৪', 'B', 5, 4),\n" +
                "(300, 'Hubble Telescope এর ত্রুটি সংশোধনের জন্য নভচারীগনকে মহাশূন্যে কোন নভোযানে প্রেরন করা হয়েছিল?', 'Endeavour', 'Challenger', 'Pathfinder', 'Apollo ', 'A', 5, 4),\n" +
                "(301, 'রুয়ান্ডার প্যাট্রিয়টিক ফ্রন্ট সরকার কবে শপথ গ্রহন করে? ', '৮ জুলাই ১৯৯৪', '১৯ জুলাই ১৯৯৪', '২৪ জুলাই ১৯৯৪', '২৭ জুলাই ১৯৯৪', 'B', 5, 4),\n" +
                "(302, 'উপকূলে কোন একটি স্থানে পরপর দুটি জোয়ারের মধ্যে ব্যবধান হলো', 'প্রায় ১২ ঘন্টা', 'প্রায় ৬ ঘন্টা', 'প্রায় ২৪ ঘন্টা', 'চাঁদের তিথি অনুশারে ভিন্ন ', 'A', 5, 4),\n" +
                "(303, 'নাড়ীর স্পন্দন প্রবাহিত হয়', 'ধমনীর ভিতর দিয়ে', 'স্নায়ুর ভিতর দিয়ে', 'শিরার ভিতর দিয়ে', 'ল্যাকটিয়ারের ভিতর দিয়ে', 'A', 5, 4),\n" +
                "(304, 'বৃত্তের পরিধী ও ব্যাসের অনুপাত', ' ৩', '২২/৭', '২৫/৯', 'প্রায় ৫', 'B', 5, 3),\n" +
                "(305, 'রঙ্গীন টেলিভিশন হতে ক্ষতিকর কোন রশ্মি বের হয়?', 'মৃদু রঞ্জন রশ্মি ', 'গামা রশ্মি', 'কসমিক রশ্মি', 'বিটা রশ্মি', 'B', 5, 4),\n" +
                "(306, 'যা চিরস্থায়ী নয়', 'অস্থায়ী', 'ক্ষনিক', 'ক্ষনস্থায়ী', 'নশ্বর', 'D', 5, 1),\n" +
                "(307, 'Intellectual শব্দের বাংলা অর্থ', 'বুদ্ধিমান', 'মননশীল', 'বুদ্ধিজীবি', 'মেধাবী', 'C', 5, 1),\n" +
                "(308, 'কোন নগরীতে মোঘল আমলে সুবে বাংলার রাজধানী ছিল?', 'গৌড়', 'সোনারগাও', 'ঢাকা', 'হুগলী', 'B', 5, 4),\n" +
                "(309, 'Asia Pacific Economic Co-operation (APEC) ফোরামের নভেম্বর, ১৯৯৩ এ অনুষ্ঠিত শীর্ষ বৈঠকে কোন সদস্য দেশের সরকার প্রধান অনুপস্থিত ছিলেন?', 'মালয়শিয়া', 'ফিলিপাইন', 'অষ্ট্রেলিয়া', 'জাপান', 'D', 5, 4),\n" +
                "(310, 'কোন গ্রন্থটি ঢাকা হতে প্রথম প্রকাশিত হয়েছিল?', 'মেঘনদবদ কাব্য', 'দুর্দেশনন্দিনী', 'নীলদর্পণ', 'অগ্নিবীনা', 'C', 5, 1),\n" +
                "(311, 'পথিক তুমি পথ হারাইয়াছো? কথাটি কার?', 'রবীন্দ্রোনাথ ঠাকুর', 'বঙ্কিমচন্দ্র চট্টোপাধ্যয়', 'মীর মোশারফ হোসেন', 'শরৎচন্দ্র চট্টোপাধ্যয় ', 'B', 5, 1),\n" +
                "(312, 'প্রত্যয়গতভাবে শুদ্ধ কোনটি?', 'উৎকর্ষতা ', 'উৎকর্ষ', 'উৎকৃষ্ট', 'উৎকৃষ্টতা', 'C', 5, 1),\n" +
                "(313, 'অচিন’ শব্দের ''অ'' উপসর্গটি কোন অর্থে ব্যবহৃত?', 'নেতিবাচক', 'বিয়োগয়ান্ত', 'নঞর্থক', 'অজানা', 'C', 5, 1),\n" +
                "(314, 'বাংলায় ইউরোপীয় বণিকদের মধ্যে প্রথম কারা এসেছিল? ', 'ইংরেজরা', 'ফরাসিরা', 'ওলান্দাজর', 'প্রর্তুগীজরা', 'D', 5, 4),\n" +
                "(315, 'জিয়া সার কারখানায় উৎপাদিত সারের নাম কি?', 'অ্যামোনিয়া', 'সুপার ফসফেট', 'টি এস পি', 'ইউরিয়া', 'D', 5, 4),\n" +
                "(316, 'ল্যাপটপ হলো এক ধরনের-', 'পর্বাতারোহন সামগ্রী', 'ছোট কুকুর', 'বাদ্য যন্ত্র', 'ছোট কম্পিউটার', 'D', 5, 4),\n" +
                "(317, 'বাংলাদেশের পাহারশ্রেনীর ভূ-তাত্ত্বিক যুগের ভূমিরুপ হচ্ছে?', 'প্লাইসটোনিস যুগের', 'টারশিয়ারী যুগের', 'মায়োসিন যুগের', 'ডেবোনিয়ান যুগের', 'B', 5, 4),\n" +
                "(318, 'বাংলাদেশের সবচেয়ে উত্তরে অবস্থিত স্থানের নাম-', 'তেতু্লিয়া', 'পঞ্চগড়', 'বাংলাবান্ধা', 'নকশালবাড়ী', 'C', 5, 4),\n" +
                "(319, 'ব্রিটিশ বণিকদের বিরুদ্ধে একজন চাকমা জুমিয়া নেতা বিদ্রোহের পতাকা উড়িয়েছেন তার নাম-', 'রাজা ত্রিদিব রায়', 'রাজা ত্রিভুবন চাকমা', 'জুম্মা খান', 'জান বখস খাঁ', 'C', 5, 4),\n" +
                "(320, 'একটি কাঠের টুকরার দৈর্ঘ্য আরেকটি টুকরার দৈর্ঘ্যের তিনগুন।টুকরা দুটো সংযুক্ত করা হলে সংযুক্ত টুকরাটির দৈর্ঘ্য ছোট টুকরার চাইতে কত গুন বড় হবে? ', '৩ গুন', '৪ গুন', '৫ গুন', '৮ গুন', 'B', 5, 3),\n" +
                "(321, 'নয়া আন্তজার্তিক অর্থনৈতিক ব্যবস্থার প্রস্তাব জাতিসংঘের সাধারন পরিষদের কোন বিশেষ অধিবেশনে গৃহীত হয়?', ' দ্বিতীয়', 'তৃতীয়', 'পঞ্চম', 'ষষ্ঠ', 'D', 5, 4),\n" +
                "(322, 'মধ্য এশিয়ায় অবস্থিত আয়তনে সর্ববৃহৎ প্রজাতন্ত্রের নাম-', 'তাজিকিস্তান', 'কাজাকিস্তান', 'উজবেকিস্তান', 'কিরগিজস্তান', 'B', 5, 4),\n" +
                "(323, 'জোট নিরপেক্ষ আন্দোলনের প্রথম শীর্ষ সম্মেলন কবে অনুষ্ঠিত হয়?', 'হারারে ১৯৮৯', 'বেলগ্রেড ১৯৬১', 'হাভানা ১৯৭৩', 'কায়রো ১৯৭০', 'B', 5, 4),\n" +
                "(324, 'বায়ুমন্ডলের চাপের ফলে ভূ-গর্ভস্থ পানি লিফট পাম্পের সাহায্যে সর্বোচ্চ যে গভীরতা থেকে উঠানো যায়-', '১ মিটার', '১০ মিটার', '১৫ মিটার', '১৯ মিটার', 'B', 5, 4),\n" +
                "(325, 'বাংলাভাষার প্রথম কাব্য সংকলন চর্যাপদের আবিস্কারক-', 'ডক্টর মুহম্মদ শহীদুল্লাহ', 'ডক্টর সুনিতিকুমার চট্টোপাধ্যয়', 'হরপ্রসাদ শাস্ত্রী', 'ডক্টর সুকুমার সেন', 'C', 5, 1),\n" +
                "(326, 'তত্ত্বাবোধিনী পত্রিকা’ প্রথম প্রকাশিত হয়?', '১৮৪১ সালে', '১৮৪২ সালে', '১৮৫০ সালে', '১৮৪৩ সালে', 'D', 5, 1),\n" +
                "(327, 'যে ছন্দের মুল পর্বের মাত্রা সংখ্যা চার, তাকে বলা হয়-', 'স্বরবৃত্ত                ', 'পিয়ার', 'মাত্রাবৃত্ত', 'অক্ষরবৃত্ত', 'A', 5, 1),\n" +
                "(328, 'The antonym for ''Inimical''', 'Friendly', 'Hostile', 'Indifferent', 'Angry', 'A', 5, 2),\n" +
                "(329, 'টুথপেস্টের প্রধান উপাদান-', 'জেলী ও মসলা', 'সাবান ও পাউডার', 'ভোজ্য তেল ও সোডা', 'ফ্লোরাইড ও ক্লোরাইড', 'B', 5, 4),\n" +
                "(330, 'পানির যে ছোট ফোটা পানির যে গুনের জন্য গোলাকৃতির হয়', 'সান্দতা', 'স্তিতিস্থাপকতা', 'প্লাবতা', 'পৃষ্ঠটান', 'D', 5, 4),\n" +
                "(331, 'মুক্তা হল ঝিনুকের-', 'খোলসের টুকরা', 'চোখের মনি', 'প্রদাহের ফল', 'জমাট হরমন', 'C', 5, 4),\n" +
                "(332, '১৯৯৪ সালের পহেলা ডিসেম্বর বৃহস্পতি বার হলে, ১৯৯৫ সালের ঐ হবে', 'বৃহস্পতিবার', 'শুক্রবার', 'শনিবার', 'রবিবার', 'B', 5, 3),\n" +
                "(333, 'একটি ত্রিভূজাকৃতি ক্ষেত্রের ক্ষেত্রফল ৮৪ বর্গগজ।ত্রিভূজটির শীর্ষবিন্দু হতে ভূমির উপর অঙ্কিত লম্বের দৈর্ঘ্য ১২ গজ হলে ভূমির দৈর্ঘ্য কত?', '১০ গজ', '১২ গজ', '১৪ গজ', '৭ গজ', 'C', 5, 3),\n" +
                "(334, 'দুটি সংখ্যার গ.সা.গু, বিয়োগফল এবং ল.সা.গু যথাক্রমে ১২,৬০ এবং ২৪৪৮।সংখ্যা দুটি কত?', '১০৮ ও ১৪৪', '১১২ ও ১৪৮', '১৪৪ ও ১০৮', '১৪৪ ও ২০৪', 'D', 5, 3),\n" +
                "(335, 'বিশ্ব তামাকমুক্ত দিবস প্রতিপালিত হয় প্রতি বছরের', '৩১ জানুয়ারী', '৩০ মার্চ', '৩০ এপ্রিল', '৩১ মে', 'D', 5, 4),\n" +
                "(336, 'মার্কিন যুক্তরাষ্ট্রকে স্ট্যাচু অব লিবার্টি’ উপহার দেয় যে রাষ্ট্র-', 'যুক্তরাজ্য', 'ফ্রান্স', 'জাপান', 'জার্মান', 'B', 5, 4),\n" +
                "(337, 'নিম্নের কোন দেশটি জাতিসংঘের সদস্য নয়-', 'নামিবিয়া       ', 'সুইজারল্যান্ড', 'কিউবা', 'পানামা', 'B', 5, 4),\n" +
                "(338, 'স্বাধীনতার আগে পাপুয়া নিউগিনি কোন দেশের অধীনে ছিল?', ' ব্রিটেন', 'ফ্রান্স', 'অষ্ট্রেলিয়া', 'নিউজিল্যান্ড', 'C', 5, 4),\n" +
                "(339, 'পোলিও টিকা আবিস্কারক জোনাস সাল্ক যুক্তরাষ্ট্রের এক শহরে মারা যান, শহরটির নাম-', 'La Martini', 'La Zola', 'San Antonio', 'San Hose', 'B', 5, 4),\n" +
                "(340, 'বাংলাদোশের গবাদীপশুতে প্রথম ভ্রুন ব্যবহার করা হয়-', '৫ মে ১৯৯৪                         ', '৬ এপ্রিল ১৯৯৪', '৫ মে ১৯৯৫', '৭ মে ১৯৯৭', 'C', 5, 4),\n" +
                "(341, 'বাংলাদেশে ঢুকার পর গঙ্গা নদী, ব্রহ্মপুত্র-যমুনার সাথে নিম্নোক্ত একটা জায়গায় মেশে-', 'গোয়ালন্দ', 'বাহাদুর বাদ', 'ভৌরব বাজার', 'নারায়নগঞ্জ', 'A', 5, 4),\n" +
                "(342, 'ঢাকার বড় কাটরা ও ছোট কাটরা শহরের নিম্নোক্ত একটি এলাকায় অবস্থিত-', 'চকবাজার', 'সদরঘাট', 'লালবাগ', 'ইসলামপুর', 'A', 5, 4),\n" +
                "(343, 'পর্তুগীজ শব্দ থেকে নিম্নোক্ত একটি শব্দ বাংলাভাষায় আত্তীকরণ করা হয়েছে-', 'টেবিল                       ', 'চেয়ার', 'বালতি', 'শরবত', 'C', 5, 1),\n" +
                "(344, 'করনার স্টোন অব পিচ এই স্মৃতিসৌধটি সম্প্রতি স্থাপিত হয়েছে-', 'ম্যাকাও', 'হাইতি', 'ওকিনাওয়া', 'ভিয়েতনাম', 'B', 5, 4),\n" +
                "(345, 'বাংলাদেশের একটি জীবন্ত জীবাশ্মের নাম-', 'রাজ কাঁকরা', 'গন্ডার', 'পিপীলিকাভুক্ত ম্যানিস', 'স্নো লোরিস', 'A', 5, 4),\n" +
                "(346, 'Browning was the composer of any of the following poems-', 'Two voices', 'The scholar Gipsy', 'Andtea del Sarto', 'Oenone', 'B', 5, 2),\n" +
                "(347, 'The synonym of ''Franchise''- ', 'Privilege', 'Utility', 'French', 'Frankness', 'A', 5, 2),\n" +
                "(348, 'The opposite word of ''sluggish''-', 'Animated', 'Dull', 'Heavy', 'Slow', 'A', 5, 2),\n" +
                "(349, 'The correct spelling is-', 'Humourous', 'Humourious', 'Humorous', 'Humorious', 'C', 5, 2),\n" +
                "(350, 'Natural protein-এর কোড নাম-', 'Protein-p 53', 'Protein-p 51', 'Protein-p 52', 'Protein-p 49', 'D', 5, 4),\n" +
                "(351, 'সূর্য থেকে পৃথিবীতে আলো আসতে কতক্ষন সময় লাগে? ', '৮.৩২ মিনিট', '৯.১২ মিনিট', '৭.৯৬ মিনিট', '১০.৫৬ মিনিট', 'A', 5, 4),\n" +
                "(352, 'কোনটি স্তন্যপায়ী প্রানী নয়?', 'হাতি                         ', 'কুমির', 'তিমি', 'বাদুর', 'B', 5, 1),\n" +
                "(353, 'এই শতাব্দীর সবচেয়ে উজ্জল ধূমকেতু কোনটি?', 'হেইলির ধুমকেতু', 'হেল-বপ-ধূমকেতু', 'শূমেকার লেভী ধূমকেতু', 'কোনটি নয়', 'C', 5, 4),\n" +
                "(354, 'বিদ্যুৎকে সাধারন মানুষের কাজে লাগানোর জন্য কোন বৈজ্ঞানিকের অবদান সবচেয়ে বেশি?', 'বেজ্ঞামিন ফ্রাঙ্কলিন', 'আইজ্যাক নিউটন', 'টমাস এডিসন', 'ভোল্টা', 'C', 5, 4),\n" +
                "(355, 'ভূ-পৃষ্ঠের সৌরদীপ্ত ও অন্ধকারচ্ছন্ন অংশের সংযোগ স্থলকে কি বলে?', 'ছায়াবৃত্ত', 'গুরুবৃত্ত', 'উষা', 'গোধূলী', 'A', 5, 4),\n" +
                "(356, 'ভূ-মধ্যসাগর ও আটল্যান্টিক মহাসাগরের মধ্যে কোন প্রনালীর অবস্থান?', 'হরমুজ', 'জিব্রাল্টার', 'বসফরাস', 'দার্দানেলিস', 'B', 5, 4),\n" +
                "(357, 'আকাশে উজ্জলতম নক্ষত্র কোনটি?', 'ধ্রুবতারা', 'প্রক্সিমা সেন্টারাই', 'লুব্ধক', 'পুলহ ', 'C', 5, 4),\n" +
                "(358, 'জোয়ার ভাটার তেজকটাল কখন হয়?', 'অমাবস্যায়', 'একাদশীতে', 'অষ্টমীতে', 'পঞ্চমীতে', 'A', 5, 4),\n" +
                "(359, 'একটি সংখ্যার তিনগুনের সাথে দুইগুন যোগ করলে ৯০ হয় সংখ্যাটি কত?', ' ১৬', '১৮', '২০', '২৪', 'B', 5, 3),\n" +
                "(360, 'পরপর ১০ টি সংখ্যার প্রথম ৫টি সংখ্যার যোগফল ৫৬০ হলে শেষ ৫ টির যোগফল কত?', ' ৫৮৫', '৫৮০', '৫৭৫', '৫৭০', 'A', 5, 3),\n" +
                "(361, '১২ ও ৯৬ এর মধ্যে কয়টি সংখ্যা ৪ দ্বারা বিভাজ্য?', '২১', '২৩', '২৪', '২২', 'D', 5, 3),\n" +
                "(362, 'তার বয়স বেড়েছে কিন্তু বুদ্ধি বাড়েনি''-এটা কোন ধরনের বাক্য?', 'যৌগিক বাক্য', 'সাধারন বাক্য', 'মিশ্র বাক্য', 'সরল বাক্য', 'A', 5, 1),\n" +
                "(363, 'একাদশে বৃহস্পতি''-এর অর্থ কি?', 'আশার কথা', 'সৌভগ্যের বিষয়', 'আনন্দের বিষয়', 'মজার বিষয়', 'B', 5, 1),\n" +
                "(364, 'লিঙ্গান্তর হয় না এমন শব্দ কোনটি?', 'সাহেব ', 'বেহাই', 'সঙ্গী', 'কবিরাজ', 'D', 5, 1),\n" +
                "(365, 'সাধু ভাষা সাধারনত কোথায় অনুপযোগী?', 'কবিতার পঙ্কিতে', 'গানের কলিতে', 'নাটকের সংলাপে', 'গল্পের বর্ণনায়', 'C', 5, 1),\n" +
                "(366, 'দুটি পুরুষ বাচক শব্দ রয়েছে কোনটিতে?', 'ননদ', 'প্রিয়', 'শিষ্য', 'আয়া', 'A', 5, 1),\n" +
                "(367, 'বিভক্তিহীন নাম শব্দকে কি বলে?', 'নাম পদ', 'উপপদ', 'প্রতিপাদিক', 'উপমিত', 'C', 5, 1),\n" +
                "(368, 'কোন বাক্যটি দ্বারা অনুরোধ বুঝায়?', 'তুই বাড়ি যা', 'কাল একবার এসো', 'ক্ষমা করা ঘোর অপরাধ', 'দূর হও', 'B', 5, 1),\n" +
                "(369, 'ধাতুর পর কোন প্রত্যয় যুক্ত করে ভাববাচক বিশেষ্য বুঝায়?', 'আন', 'আই', 'আও', 'আলবেনীয়দের ঔদ্ধতা', 'C', 5, 1),\n" +
                "(370, 'বচন অর্থ কি?', 'সংখ্যার ধারনা', 'গননান ধারনা', 'ক্রমের ধারনা', 'পরিমাপের ধারনা', 'A', 5, 1),\n" +
                "(371, 'মরি মরি!কি সুন্দর প্রভাতের রূপ’-বাক্যে মরি মরি কোন শ্রেনীর অব্যয়?', 'সমন্বয়ী', 'অনুন্বয়ী', 'পদান্বয়ী', 'অনুকার', 'B', 5, 1),\n" +
                "(372, 'কৌশলে কার্যোদ্ধার''-কোনটির অর্থ?', 'গাছে তুলে মই কাড়া', 'এক খুড়ে মাথা মোড়ানো', 'ধরি মাছ না ছুই পানি', 'আকাশের চাদ হাতে পাওয়া', 'C', 5, 1),\n" +
                "(373, 'সন্ধি ব্যকরনের কোন অংশের আলচ্য বিষয়?', ' রুপতত্ত্ব', 'ধনিতত্ত্ব', 'পদক্রম', 'বাক্যতত্ত্ব', 'B', 5, 1),\n" +
                "(374, 'কোনটি অপ্রানীবাচক শব্দের বহুবচনে ব্যবহৃত হয়?', 'বৃন্দ', 'কুল', 'বর্গ', 'গ্রাম', 'D', 5, 1),\n" +
                "(375, 'বাঙ্গালীর ইতিহাস বইটির লেখক কে?', 'নীহাররঞ্জন রায়', 'আর সি মজুমদার', 'অধ্যাপক আব্দুল করিম', 'অধ্যাপক সুনীতি সেন', 'A', 5, 1),\n" +
                "(376, 'তৈরি পোশাক থেকে বাংলাদেশের রপ্তানী আয়ের শতকরা কত ভাগ আসে?', ' প্রায় ৫০ ভাগ', 'প্রায় ৫৪ ভাগ', 'প্রায় ৬০ ভাগ', 'প্রায় ৫৬ ভাগ', 'D', 5, 4),\n" +
                "(377, 'খুলনা হার্ডবোর্ড মিলে কাচামাল হিসেবে ব্যবহৃত হয় কোন ধরনের কাঠ?', 'চাপলিস', 'গেওয়া', 'কেওড়া', 'সুন্দরী', 'D', 5, 4),\n" +
                "(378, 'দিনাজপুর জেলার বড়পুকুরিয়ায় কিসের খনির প্রকল্পের কাজ চলছে?', 'কঠিন শিলা                         ', 'কয়লা', 'চুনা পাথর', 'সাদামাটি', 'B', 5, 4);";
        sql[1]=preSql+"";
        return sql;
    }
}
