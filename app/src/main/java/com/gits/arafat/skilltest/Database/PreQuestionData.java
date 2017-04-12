package com.gits.arafat.skilltest.Database;

/**
 * Created by Arafat on 11/04/2017.
 */

public class PreQuestionData {
    private String preSql="INSERT INTO `question` (`id`, `question`, `optionA`, `optionB`, `optionC`, `optionD`, `correctAns`, `categoryId`, `subCategoryId`) VALUES ";
    public String[] getQuestionInsertText(){
        String[] sql=new String[5];
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
                "(199, 'Which conclusion follows from the statements with absolute certainty?\\r\\n\\r\\n1.None of the stamp collectors is an architect.\\r\\n2.All the drones are stamp collectors.', 'all stamp collectors are architects', 'architects are not drones', 'no stamp collectors are drones', 'some drones are architects ', 'B', 1, 0);";
        sql[1]=preSql+"(200, 'Which answer expresses the meaning opposite of that of the specified word best?\\r\\n\\r\\ntough_____', ' cowardly   ', 'starch   ', 'strong   ', 'tender', 'D', 3, 0),\n" +
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
                "(378, 'দিনাজপুর জেলার বড়পুকুরিয়ায় কিসের খনির প্রকল্পের কাজ চলছে?', 'কঠিন শিলা                         ', 'কয়লা', 'চুনা পাথর', 'সাদামাটি', 'B', 5, 4),\n" +
                "(379, 'বাংলাদেশের বিদ্যুৎ শক্তির উৎস?', 'খনিজ তৈল                         ', 'প্রাকৃতিক গ্যাস', 'পাহাড়ী নদী', 'উপরের সবগুলোই', 'D', 5, 4),\n" +
                "(380, 'ধলেশ্বরী নদীর শাখা নদী কোনটি?', 'শীতলক্ষা                ', 'বুড়িগঙ্গা', 'ধরলা', 'বংশী', 'B', 5, 4),\n" +
                "(381, 'Existentialism'' কি?', 'একটি দার্র্শনিক মতবাদ', 'প্রানিবিদ্যার একটি তত্ত্ব', 'ভূ-বিদ্যার একটি তত্ত্ব', 'পদার্থ বিদ্যার একটি তত্ত্ব', 'A', 5, 4),\n" +
                "(382, 'Adult cell'' ক্লোন করে কোন দেশে একটি ভেড়ার জন্ম হয়েছে?', 'যুক্তরাজ্য', 'যুক্তরাষ্ট্র', 'অস্ট্রেলিয়া', 'ফ্রান্স', 'A', 5, 4),\n" +
                "(383, 'শাহনামা এর লেখক কে?', 'কবি ফেরদৌসী', 'মাওলানা রুমি', 'কবি নিজামী', 'কবি জামি', 'A', 5, 1),\n" +
                "(384, 'মেসোপটোমিয়া এলাকার বেশিরভাগ বর্তমানে কোন দেশে?', 'ইরাক ', 'ইরান', 'তুরস্ক', 'সিরিয়া', 'A', 5, 4),\n" +
                "(385, 'টলেমি কি ছিলেন?', 'চিকিৎসক                        ', 'দার্শনিক', 'জ্যোতির্বিদ', 'সেনাপতি', 'C', 5, 4),\n" +
                "(386, 'স্টিভেন হকিং একজন খুবেই বিখ্যাত', 'দার্শনিক', 'পদার্থবিদ', 'রসায়ণবিদ', 'কবি জামি', 'B', 5, 4),\n" +
                "(387, 'একজন রাজনীতিবিদ কিন্তু সাহিত্যে নোবেল পুরস্কার পেয়েছে', 'চার্চিল', 'কিসিঞ্জার', 'দ্য গল', 'রুজভেল্ট', 'A', 5, 4),\n" +
                "(388, '২০০০ সালে অলম্পিক কোন শহরে অনুষ্ঠিত হয়?', 'বেইজিং', 'সিডনি', 'টোকিও', 'মেলবোর্ন', 'C', 5, 4),\n" +
                "(389, 'সম্প্রতি কুয়ালালামপুরে অনুষ্ঠিত আই.সি.সি ট্রফিতে কয়টি দেশ অংশ গ্রহন করে?', '২০', '২৩', '২২', '২১', 'C', 5, 4),\n" +
                "(390, 'সবচেয়ে শক্ত বস্তু কোনটি?', 'হীরা', 'লোহা', 'পিতল', 'গ্রানাইট পাথর', 'A', 5, 4),\n" +
                "(391, 'জাতিসংঘের কোন মহাসচিব বিমান দূর্ঘটনায় নিহত হয়েছিল?', 'ট্রিগভে লাই', 'কুর্ট্ ওয়াল্ডহেইম', 'দ্যাগ হ্যামারশোল্ড', 'উ থান্ট', 'C', 5, 4),\n" +
                "(392, 'মোনালিসা চিত্রটির চিত্রকর কে?', ' মাইকেল এঞ্জেলো', 'লিওনার্দো দ্যা ভিনচি', 'ভ্যানগগ', 'পাবলো পিকাসো', 'B', 5, 4),\n" +
                "(393, 'কোন দেশে ''তালেবান'' নামক রাজনৈতিক গ্রুপ ক্ষমতায় অধিষ্ঠিত', 'সুদান', 'তিউনিসিয়া', 'তিউনিসিয়া', 'আফগানিস্তান', 'D', 5, 4),\n" +
                "(394, 'All of the people at theAAME conference are', 'Mathematic teachers', 'Mathematics teachers                ', 'Mathematics teacher', 'Mathematic''s teachers', 'B', 5, 2),\n" +
                "(395, 'Prices for bicycles can run....Tk.Tk. 2000.00 ', 'as high as', 'so high as', 'as high to', 'as hish for', 'A', 5, 2),\n" +
                "(396, 'Travellers ___ their reservations well in advance if they want to fly during the Eid holidays.', 'had better to get', 'had to get better', 'had better get', 'had better got', 'C', 5, 2),\n" +
                "(397, 'মহাজাগতিক রশ্মি আবিস্কার করে কোন বিজ্ঞানী নোবেল পুরস্কার পান? ', 'হেস', 'গোল্ডস্টাইন', 'রাদার ফোর্ড', 'আইনস্টাইন', 'A', 5, 4),\n" +
                "(398, 'সমুদ্রের গভীরতা মাপা হয় কোন যন্ত্র দিয়ে?', 'ফ্যাদোমিটার', 'জাইরো কম্পাস', 'সাবমেরিন', 'এনিয়মিটার', 'A', 5, 4),\n" +
                "(399, 'কম্পিউটার কে আবিস্কার করেন?', 'উইলিয়াম অটরেড', 'ব্রেইসি প্যাসকেল', 'হাওয়ার্ড এইকিন', 'আবাকাস', 'C', 5, 4);";
        sql[2]=preSql+ "(400, 'একটি সরল রেখার অঙ্কিত বর্গ ঐ সরল রেখার অর্ধেকের উপর অঙ্কিত বর্গের কত গুণ?', 'দ্বিগুন ', 'তিনগুন', 'চারগুন', 'পাঁচগুন', 'C', 5, 3),\n" +
                "(401, 'পদ'' বলতে কি বুঝায়?', 'কবিতার চরণ           ', ' যে কোন শব্দ', 'প্রত্যয়ন্ত শব্দ বা ধাতু ', 'বিভক্তিযুক্ত শব্দ বা ধাতু', 'D', 5, 1),\n" +
                "(402, 'বাংলা ভাষার ইতিবৃত্ত''কার রচনা?', 'মুহাম্মাদ শহীদুল্লাহ', 'মুহাম্মাদ আব্দুল হাই', 'মুনীর চৌধুরী', 'মোফাজ্জল হায়দার চৌধুরী', 'A', 5, 1),\n" +
                "(403, 'প্রভাবতী সম্ভাষণ'' কার রচনা?', 'দেবেন্দ্রনাথ ঠাকুর  ', 'ঈশ্বরচন্দ্র বিদ্যাসাগর ', 'রামমোহন রায়', 'কৃষ্ণমোহন বন্দ্যোপাধ্যয়', 'B', 5, 1),\n" +
                "(404, 'চতুর্দশপদী কবিতাবলী কার রচনা?', 'হেমচন্দ্র বন্দ্যোপাধ্যয়', 'মাইকেল মধুসূদন দত্ত', 'নবীন চন্দ্র বন্দ্যোপাধ্যয়', 'রঙ্গলাল বন্দ্যোপাধ্যয়', 'B', 5, 1),\n" +
                "(405, 'কোনটি কাজী নজরুল ইসলামের রচিত গ্রন্থ?', 'বিষের বাঁশী', 'বন্দীর বন্দনা', 'সন্দীপের চর', 'রূপসী বাংলা', 'A', 5, 1),\n" +
                "(406, 'কবর'' নাটক কার রচনা?', 'শহীদুল্লা কায়সার', 'মুনীর চৌধুরী', 'জহির রায়হান', 'সত্যেন সেন', 'B', 5, 1),\n" +
                "(407, 'চাঁদের হাট''- অর্থ কি?', 'বন্ধুদের সমাগম', 'আত্নীয় সমাগম', 'প্রিয়জন সমাগম', 'আনন্দের প্রাচুয্য', 'C', 5, 1),\n" +
                "(408, 'কোন বানানটি শুদ্ধ?', 'সূচিষ্মিতা', 'সূচিস্মিতা', 'সুচীস্মিতা', 'সুচিস্মিতা', 'D', 5, 1),\n" +
                "(409, 'If the boy had the dog alone it wouldn?t have bitten him.', 'set ', 'left  ', 'put ', 'had', 'B', 3, 0),\n" +
                "(410, 'একটি গাড়ির চাকা প্রতি মিনিটে ৯০ বার ঘুরে। এক সেকেন্ডে চাকাটি কত ডিগ্রি ঘুরে?', ' ১৮০ ডিগ্রি', '৩৬০ ডিগ্রি', '২৭০ ডিগ্রি', '৫৪০ ডিগ্রি', 'D', 5, 3),\n" +
                "(411, 'কোন ক্লাশে ৩০ জন ছাত্র আছে। তাদের মধ্যে ১৮ জন ফুটবল খেলে,এবং ১৪ জন ক্রিকেট খেলে । এবং ৫ জন কিছুই খেলে না। কত জন উভয়ই খেলে?', '৩', '৫', '৭', '৯', 'C', 5, 3),\n" +
                "(412, 'কটি সোনার গহনার ওজন ১৬ গ্রাম। এতে সোনা ও তামার অনুপাত ৩:১। কি পরিমান সোনা মিশালে অনুপাত ৪:১ হয়?', '৮ গ্রাম', '৬ গ্রাম', '৩ গ্রাম', '৪ গ্রাম', 'D', 5, 3),\n" +
                "(413, '১,০০০ টাকা ক ও খ ১:৪ অনুপাতে ভাগ করে নেয়। খ এর অংশ সে এবং তার মা ও মেয়ের মধ্যে ২:১:১ অনুপাতে ভাগ করে। মেয়ে কত টাকা পাবে? ', '১০০ টাকা', '৪০০ টাকা', '২০০ টাকা', '৮০০ টাকা', 'C', 5, 3),\n" +
                "(414, '৯৯৯৯৯৯-এর সঙ্গে কোন ক্ষুদ্রতম সংখ্যা যোগ করলে ২,৩,৪,৫,এবং ৬ দ্বারা নিঃশেষে বিভাজ্য হবে? ', '২১', '৩৯', '৩৩', '২৯', 'A', 5, 3),\n" +
                "(415, 'একটি কুকুর একটি খরগোশকে ধরার জন্য তাড়া করে। কুকুর যে সময়ে ৪ বার লাফ দেয়,খরগোশ সে সময়ে ৫ বার লাফ দেয়। কিন্তু খরগোশ ৪ লাফে যতদূর যায় কুকুর ৩ লাফে তত দূর যায়। কুকুর ও খরগোশের গতিবেগের অনুপাত কত?', '১৫:১৬', '১৬:১৫', '২০:১২', '১২:২০', 'B', 5, 3),\n" +
                "(416, 'এক দোকারদার ১১০ টাকা কেজি কিছু চায়ের সাঙ্গে ১০০ টাকা কেজি দামের দ্বিগুন পরিমান চা মিশ্রিত করে তা ১২০ টাকা কেজি দরে বিক্রি করে মোট ২০০০ টাকা লাভ করলো । দোকানদার দ্বিতীয় প্রকারের কত কেজি চা ক্রয় করেছিল?', '১০০ কেজি', '৮০ কেজি', '৫০ কেজি', '৬০ কেজি', 'B', 5, 3),\n" +
                "(417, 'একটি সরলরেখার উপর অঙ্কিত বর্গের ক্ষেত্রফল এ সরল রেখার এক চতুর্থাংশের উপর অঙ্কিত বর্গের ক্ষেত্রফলের কত গুন?', '১৬', '৪', '৮', '২', 'A', 5, 3),\n" +
                "(418, 'No one can___that he is clever.', 'defy', 'admire', 'deny', 'denounce', 'C', 5, 2),\n" +
                "(419, 'A reward has been announced for the employees who____hard.', 'have worked', 'has worked', 'Will be work', 'have had worked', 'A', 5, 2),\n" +
                "(420, 'TO - the arrival of Spring, Bangladesh Televisic a special function.', 'commemorate : launched', 'announce : telecast', 'celebrate : organized', 'welcome : sanctions', 'C', 5, 2),\n" +
                "(421, 'He has paid the penalty....his crimes.....five years in prision.', 'for- with', 'at- by', 'about- at', 'after- in', 'A', 5, 2),\n" +
                "(422, 'The path....paved, so we were able to walk through the path.', 'was', 'had been', 'has been', 'being', 'A', 5, 2),\n" +
                "(423, 'In spite of my requests, he did not....', 'give in', 'fall in', 'get off', 'give forth', 'A', 5, 2),\n" +
                "(424, 'The children studied in a class room....windows were never opened.', 'that', 'which', 'where', 'whose', 'B', 5, 2),\n" +
                "(425, 'Choose the correct meaning of the following words : Cul-de-sac', 'selection', 'dead end', 'error', 'bubble', 'B', 5, 2),\n" +
                "(426, 'Parcel---', 'Piece of land', 'Postage', 'Unobstructed view', 'l Quarrel', 'A', 5, 2),\n" +
                "(427, 'Ruminant---', 'Soup', 'Noise-maker', 'Cud-chewing animal', 'Gossip', 'C', 5, 2),\n" +
                "(428, 'একটি সংখ্যা ৬৫০ থেকে যত বড় ৮৫০ থেকে তত ছোট।সংখ্যাটি কত?', '৭৩০', '৭৩৫', '৮০০', '৭৮০', 'B', 5, 3),\n" +
                "(429, 'কোন পরীক্ষায় পরীক্ষার্থীর ৮০% গনিত এবং ৭০% বাংলায় পাশ করলো।উভয় বিষয়ে পাশ করলো ৬০%, উভয় বিষয়ে শতকরা কত জন ফেল করল?', '১৫%                   ', '১০%', '১১%', '১২%', 'B', 5, 3),\n" +
                "(430, 'কোন কোন স্বাভাবিক সংখ্যা দ্বারা ৩৪৬ কে ভাগ করলে প্রতি ক্ষেত্রে ৩১ অবশিষ্ট থাকবে?', '৩৫-৪৫-৬৩-১০৫-৩১৫', '৩৫-৪০-৬৫-১১০-৩১৫', '৩৫-৪৫-৭০-১০৫-৩১৫', '৩৫-৪৫-৬৩-১১০-৩১৫', 'A', 5, 3),\n" +
                "(431, 'দুইটি ক্রমিক সংখ্যার বর্গের অন্তর ১৯৯ হলে বড় সংখ্যাটি কত?', '৭০', '৮০', '৯০', '১০০', 'D', 5, 3),\n" +
                "(432, 'x+y=12এবং x-y=2 হলে xy এর মান কত?', '৩৫', '১৪০', '৭০', '১৪৪', 'A', 5, 3),\n" +
                "(433, 'এক ব্যাক্তি তার স্ত্রীর চেয়ে ৫ বছরের বড়। তার স্ত্রীর বয়ষ ছেলের বয়ষের ৪ গুন।৫ বছর পরে ছেলের বয়ষ ১২ বছর হলে বর্তমানে ঐ ব্যাক্তির বয়ষ কত?', '৬৫ বছর', '২৮ বছর', '৩৩ বছর', '৫৩ বছর', 'C', 5, 3),\n" +
                "(434, 'যে সব নিউক্লিয়াসের নিউট্রন সংখ্যা সমান কিন্তু ভর সংখ্যা সমান নয় তাদের কে বলা হয়-', 'আইসোটোপ', 'আইসোমার', 'আইসোটোন', 'আইসোবার', 'C', 5, 4),\n" +
                "(435, 'উড়োজাহাজের গতি নির্নায়ক যন্ত্র-', 'ক্রোনমিটার', 'ট্যাকোমিটার', 'ক্রোনমিটার', 'ক্রোনমিটার', 'B', 5, 4),\n" +
                "(436, 'ভূমিকম্প নির্নায়ক যন্ত্র-', 'ব্যারোমিটার', 'সেক্সট্যান্ট', 'সিসমোগ্রাফ', 'ম্যানোমিটার', 'C', 5, 4),\n" +
                "(437, 'একটি সমদ্বিবাহু ত্রিভুজের ভুমি ১৬ একক এবং অপর প্রত্যেক বাহুদ্বয় ১০ একক। ত্রিভুজটির ক্ষেত্রফল কত বর্গ একক?', '২৪', '৩৬', '৪৮', '৫০', 'C', 5, 3),\n" +
                "(438, '২০ সদস্য বিশিষ্ট একটি ফুটবল দল হতে একজন অধিনায়ক ও একজন সহ-অধিনায়ক কতভাগে নির্বাচন করা যাবে?', '২০', '১৯০', '৩৮০', '৭৬০', 'B', 5, 3),\n" +
                "(439, 'কোন সমান্তর প্রগামনে প্রথম দুইটি সংখ্যা যদি ৫ ও ১৭ হয়, তবে তৃতীয় সংখ্যাটি কত?', '২২', '২৫', '২৯', '৮৫', 'C', 5, 3),\n" +
                "(440, '১,২,৩,৫,৮,১৩,২১,৩৪,........ধারাটির পরবর্তী সংখ্যাটি কত?', '৫৫                         ', '৪০', '৬৮', '৮৯', 'A', 5, 3),\n" +
                "(441, '৭২ কেজি ওজন বিশিষ্ট একটি মিশ্রন A এর ১৭ ভাগ, B এর ৩ ভাগ এবং C এর ৪ ভাগ দ্বারা গঠিত। মিশ্রনে B কতটুকু আছে?', '৯ কেজি', '১২ কেজি', '১৭ কেজি', '৫১ কেজি', 'A', 5, 3),\n" +
                "(442, 'বেলজিয়ামের মূদ্রার নাম কি?', 'শিলিং                        ', 'ইউরো', 'পাউন্ড', 'ক্রাউন', 'B', 5, 4),\n" +
                "(443, 'কোনটি চির শান্তির শহর নামে পরিচিত?', 'রোম', 'ভেনিস', 'এথেন্স', 'ওসলো', 'A', 5, 4),\n" +
                "(444, 'দুধেভাতে উৎপাত গল্পগ্রন্থের রচয়িত?', 'শওকত ওসমান', 'জ্যোতিপ্রকাশ দত্ত', 'আখতারুজ্জামান ইলিয়াস', 'হাসান আজিজুল হক', 'C', 5, 1),\n" +
                "(445, 'আমার সন্তান যেন থাকে দুধে ভাতে''- এই প্রাথনাটি করেছে?', 'ভাঁড় দত্ত', 'চাঁদ সওদাগর', 'ঈশ্বরী পাটনী', 'নলকুবের', 'C', 5, 1),\n" +
                "(446, 'নারীকে সম্মোধনের ক্ষেত্রে প্রযোজ্য হবে-', 'কল্যাণীয়েষু', 'সুচরিতেষু', 'শ্রদ্ধাস্পদাসু', 'প্রীতিভাজনেসষু ', 'A', 5, 1),\n" +
                "(447, 'পেয়ারা'' কোন ভাষা থেকে আগত শব্দ?', 'হিন্দি', 'উর্দু', 'পর্তুগিজ', 'গ্রীক', 'C', 5, 1),\n" +
                "(448, 'যে পদে বাক্যের ক্রিয়াপদটির গুন, প্রকৃতি, তীব্রতা ইত্যাদি প্রকৃতি গত অবস্থা বোঝায়, তাকে বলা হয়-', 'ক্রিয়াবাচক বিশেষ্য', 'ক্রিয়াবিশেষণ', 'ক্রিয়াবিশেষ্যজাত বিশেষণ', 'ক্রিয়াবিভক্তি', 'B', 5, 1),\n" +
                "(449, 'রামগরুড়ের ছানা'' কথাটির অর্থ?', 'কাল্পনিক জন্তু', 'গোমরামুখো লোক', 'মুরগী', 'পুরাণোক্ত পাখি', 'B', 5, 1),\n" +
                "(450, 'বামেতর শব্দটির অর্থ-', 'বামচোখ', 'ডান', 'ইতর', 'বাম দিক', 'B', 5, 1),\n" +
                "(451, 'Complete the flowing sentence: If I had known you were coming....', 'I would go to the station', 'I had gone to the station', 'I would be going to the station', 'I would have gone to the station', 'D', 5, 2),\n" +
                "(452, 'Choose the correct option: Even as harvesting was going on-', 'The rainy season began', 'The rainy season was began', 'The rainy season had began', 'The rainy season begins', 'A', 5, 2),\n" +
                "(453, 'Which phrase contains words opposed to each other in meaning?', 'Hopes and aspirations', 'Heat and dust', 'Reproduction and death', 'Emerged and advanced', 'C', 5, 2),\n" +
                "(454, 'I Find out the correct translation(সকাল থেকে গুড়ি গুড়ি বৃষ্টি হচ্ছে)', 'Is is raining from morning', 'It has been raining from morning', 'It has been drizzling since morning', 'It is drizzling since morning', 'C', 5, 2),\n" +
                "(455, '''Maiden speech'' means-', 'First speech', 'Last speech', 'Late speech', 'Early speech', 'A', 5, 2),\n" +
                "(456, 'আন্তজাতিক সম্পর্কের ক্ষেত্রে শক্তি প্রয়োগ নিষিদ্ধকারী প্যারিস প্যাক্ট সাক্ষরিত হয়-', '১৯৭২সনের ১২ আগষ্ট', '১৯২৮ সনের ২৭ আগষ্ট', '১৯২৮ সনের ৩ নভেম্বর', '১৯২৯ সনের ৫ জানুয়ারী', 'B', 5, 5),\n" +
                "(457, 'যুদ্ধ ও সশস্ত্র সংঘর্ষ সংক্রান্ত আইন প্রনয়ন বিষয়ে ১৯৪৯ সনের জেনেভা কনভেনশন সমুহ অভিহিত-', 'দুটি রেডক্রস কনভেনশন নামে', 'তিনটি রেডক্রস কনভেনশন নামে', 'চারটি রেডক্রস কনভেনশন নামে', 'একটি রেডক্রস কনভেনশন নামে', 'C', 5, 5),\n" +
                "(458, 'স্থায়ী সালিস আদালত কোথায় অবস্থিত?', 'জেনেভায়', 'লন্ডনে', 'প্যারিসে', 'হেগে', 'D', 5, 5),\n" +
                "(459, 'মানবাধিকার বাস্তবায়নের লক্ষ্যে কখন আন্তর্জাতিক চুক্তি সাক্ষরিত হয়?', '১৯৪৮ সনে', '১৯৫৫ সনে', '১৯৬৫ সনে', '১৯৬৬ সনে', 'D', 5, 5),\n" +
                "(460, 'ইসিএ (ECA) এর সদর দপ্তর কোথায়?', 'আদ্দিস আবাবা', 'নাইরোবি', 'ডাকার', 'কায়রো', 'A', 5, 5),\n" +
                "(461, 'ডেটন শান্তি'' চুক্তি সাক্ষরিত হয় –', '১৯৯০ সনে', '১৯৯১ সনে', '১৯৯২ সনে', '১ ডিসেম্বর ১৯৯৫ সনে', 'D', 5, 5),\n" +
                "(462, 'কোন চুক্তির মাধ্যমে ইইসি (EEC) প্রতিষ্ঠা লাভ করে?', 'রোম চুক্তি', 'ম্যাসট্রিক্ট চুক্তি', 'ভিয়েনা কনভেনশন ', 'ব্রাসেলস কনভেনশন', 'A', 5, 5),\n" +
                "(463, 'MIGA কখন গঠিত হয়?', '১৯৮০ সনে', '১৯৮২ সনে', '১৯৮৫ সনে', '১৯৮৮ সনে', 'D', 5, 5),\n" +
                "(464, 'বিখ্যাত ল্যান্ডমার্ক টাওয়ার অবস্থিত?', 'নিউইয়ক', 'টোকিওতে', 'শিকাগোতে', 'লন্তনে', 'B', 5, 5),\n" +
                "(465, 'হ্যারি পটার'' কি?', 'এক জাতীয় ধাতব পাত্র', 'সাম্প্রতিক কালের সর্বাধিক বিক্রিত একটি শিশুতোষ বই', 'এক জাতীয় গুচ্ছ বোমা', 'এক ধরনের খেলনা', 'B', 5, 5),\n" +
                "(466, 'বিশ্বের সবচেয়ে প্রাচীন সভ্যতা কোথায় গড়ে উঠেছিল?', 'গ্রীসে', 'মেসোপটোমিয়ায়', 'রোমে', 'ভারতে', 'B', 5, 5),\n" +
                "(467, 'ও আই সি-এর বর্তমান মহাসচিব কোন দেশের নাগরিক?', ' বাংলাদেশে                        ', 'তুরস্ক', 'মরক্কো', 'লিবিয়া', 'C', 5, 5),\n" +
                "(468, 'বিশ্ব বানিজ্য সংস্থার (WTO) পঞ্চম মিনিস্টারিয়াল কনফারেন্স কোথায় এবং কখন অনুষ্ঠিত হয়?', 'নভেম্বর ২০০৩ ভারতের বেঙ্গালোর', 'ডিসেম্বর ২০০৩ কানাডার অটোয়া', 'জানুয়ারী ২০০৪ পাকিস্তানের ইসলামাবাদ', 'সেপ্টেম্বর ২০০৩ মেক্সিকোর কানকুন', 'D', 5, 5),\n" +
                "(469, 'নিকারাগুহার \"কন্ট্রা\"বিদ্রোহীরা কোন দেশের সমর্থন পুষ্ট ছিল?', 'যুক্তরাজ্য', 'যুক্তরাষ্ট্র', 'কোরিয়া', 'কিউবা', 'B', 5, 5),\n" +
                "(470, 'ইসরাইল -প্যালেস্টাইন ''রোডম্যাপ'' কর্মসুচির উদ্দেশ্য কি?', 'স্বাধীন প্যালেস্টাইন রাষ্ট্র প্রতিষ্ঠা করা', 'দুটি রাষ্ট্রের মধ্যে সড়ক যোগাযোগ ব্যবস্থা স্থাপন', 'দুটি রাষ্ট্রের মধ্যে অবাধ বানিজ্য স্থাপন', 'দুটি রাষ্ট্রের মধ্যে সীমানা চিহ্নিত করন', 'A', 5, 5),\n" +
                "(471, 'নিম্নের কোন দেশটি জি-৮ ভুক্ত দেশ নয়?', 'ফ্রান্স', 'যুক্তরাজ্য', 'রাশিয়া', 'দি নেদারল্যান্ডস', 'D', 5, 5),\n" +
                "(472, 'ব্রেটন উডস'' ইনস্টিটিউট নিম্নের কোন সংস্থাকে বুঝায়?', 'আই এম এফ', 'এডিবি', 'আইডিবি', 'বিশ্বব্যাংক', 'D', 5, 5),\n" +
                "(473, 'প্রথম ক্লোন শিশু ''ইভ'' -এর জন্মতারিখ কি?', 'নভেম্বর ২০-২০০২', 'ডিসেম্বর ২৬-২০০২', 'জানুয়ারী ৭-২০০৩', 'মার্চ ২৩-২০০৩', 'B', 5, 5),\n" +
                "(474, 'A Long Walk to Freedom বইটির লেখক কে?', 'হোসে গুসামাও', 'রবার্ট মুগাবে', 'নেলসন মেন্ডেলা', 'অং সাং সুচি', 'C', 5, 5),\n" +
                "(475, 'লাইন অব কন্ট্রোল বলতে কোন দুটি দেশের সীমান্তবর্তী রেখাকে চিহ্নিত করে?', 'ইসরাইল ও জর্ডান', 'দক্ষিন কোরিয়া ও উত্তর কোরিয়া', 'চীন ও তাইওয়ান', 'ভারত ও পাকিস্তান', 'D', 5, 5),\n" +
                "(476, 'মস্তিকের ক্ষমতা ক্ষয় পেতে থাকে স্নায়ুকোষের-', 'এক চতুর্থাংশ ধংশ হয়ে গেলে', 'অর্ধেক ধংশ হয়ে গেলে', 'এক তৃতীয় অংশ বেড়ে গেলে', 'এক চতুর্থাংশ বেড়ে গেলে', 'A', 5, 5),\n" +
                "(477, 'রাসয়নিক অগ্নিনির্বাপক কাজ করে অগ্নিতে-', 'প্রচুর পরিমানে অক্সিজেন সরবরাহ করে', 'অক্সিজেন সরবরাহে প্রতিবন্ধকতা সৃষ্টি করে', 'নাইট্রোজেন সরবরাহ করে', 'হাইড্রোজেন সরবরাহ করে', 'B', 5, 5),\n" +
                "(478, 'আবাসিক বাড়ির বর্তনীতে সার্কিট ব্রেকার ব্যবহার করা হয়', 'বিদ্যুৎ প্রবাহ জনিত দুর্ঘটনা রোধের জন্য', 'বিদ্যুৎ খরচ কমানোর উদ্দেশ্যে', 'বৈদ্যুতিক বাল্ব থেকে বেশি আলো পাওয়ার জন্য', 'বৈদ্যুতিক যন্ত্রপাতি যাতে সুষ্ঠোভাবে কাজ করে', 'A', 5, 5),\n" +
                "(479, 'পরমানু (Atom) চার্জ নিরপেক্ষ হয় কারন-', 'নিউট্রন ও প্রোটনের সংখ্যা সমান', 'প্রোটন ও নিউটনের ওজন সমান', 'নিউট্রন ও প্রটন নিউক্লিয়াসে থাকে', 'ইলেকট্রন ও প্রোটন সংখ্যা সমান', 'D', 5, 5),\n" +
                "(480, 'মাইট্রোকন্ডিয়ায় কত ভাগ প্রোটিন?', '৭০%', '৭২%', '৭৩%', '৮০%', 'C', 5, 5),\n" +
                "(481, 'মূল নাই কোন উদ্ভিদে?', 'ফনিমনসা                         ', 'বিরুৎ', 'গুল্ম', 'মস', 'D', 5, 5),\n" +
                "(482, 'রঙ্গীন টেলিভিশন থেকে ক্ষতিকর কোন রশ্মি বের হয়?', 'মৃদু রঞ্জন রশ্মি', 'বিটা রশ্মি ', 'গামা রশ্মি', 'কসমিক রশ্মি', 'C', 5, 5),\n" +
                "(483, 'ল্যাপটপ'' কি?', 'ছোট কুকুর', 'পর্বাতারোহন সামগ্রী', 'বাদ্যযন্ত্র', 'ছোট কম্পিউটার', 'D', 5, 5),\n" +
                "(484, 'এসবেসটস কি?', 'অগ্নি নিরোধক খনিজ পদার্থ', 'কম ঘনাত্ব বিশিষ্ট তরল পদার্থ', 'বেশি ঘনাত্ব বিশিষ্ট তরল পদার্থ', 'এক ধরনের রাসয়নিক পদার্থ', 'A', 5, 5),\n" +
                "(485, 'পাহারের উপর রান্না করতে বেশি সময় লাগে কেন?', 'বায়ুর চাপ বেশি থাকার কারনে', 'বায়ুর চাপ কম থাকার কারনে', 'পাহারের উপর বাতাশ কম থাকায়', 'পাহারের উপর তাপমাত্রা বেশি থাকায়', 'B', 5, 5),\n" +
                "(486, 'এক ব্যক্তি একটি দ্রব্য ১২০০ টাকায় কিনে ১৫% লাভে বিক্রয় করল;ক্রেতা ঐ দ্রব তৃতীয় এক ব্যক্তির কাছে ৫% ক্ষতিতে বিক্রি করল।শেষ বিক্রয় মূল্য কত ছিল?', '১২৮০', '১২৮১', '১৩১০', '১৩১১', 'D', 5, 5),\n" +
                "(487, 'চালের দাম ২৫% বেড়ে যাওয়ায় এক ব্যক্তি চালের দাম এমন ভাবে কমালেন যেন তার সাংসারিক ব্যয় অপরিবর্তিত থাকে।তিনি চালের ব্যবহার শতকরা কত ভাগ কমালেল?', '২০%                        ', '২৫%', '১৬%', '১৮%', 'A', 5, 5),\n" +
                "(488, 'কোন ভগ্নাংশটি লঘিষ্ঠ আকারে প্রকাশিত?', '৭৭/১৪৩', '১০২/২৮৯', '১১৩/৩৫৫', '৩৪৩/১০০১', 'C', 5, 5),\n" +
                "(489, 'এক ব্যক্তি তার মোট সম্পত্বির ৩/৭ অংশ ব্যয় করার পরে অবশিষ্টের ৫/১২ অংশ ব্যয় করে দেখলেন যে তার নিকট ১০০০ টাকা রয়েছে। তার মোট সম্পত্বির মূল্য কত?', ' ২০০০ টাকা   ', '২৫০০ টাকা', '২৩০০ টাকা', '৩০০০ টাকা', 'D', 5, 5),\n" +
                "(490, 'একটি ত্রিভুজের তিনটি বাহুর দৈর্ঘ ৫,৬,৭ মিটার।নিকটতম বর্গমিটারে ত্রিভুজটির ক্ষেত্রফল কত?', '১৬ বর্গমিটার', '১৫ বর্গমিটার', '১৭ বর্গমিটার', '১৪ বর্গমিটার', 'B', 5, 5),\n" +
                "(491, '৯,৩৬,৮১,১৪৪.....এর পরবর্তী সংখ্যাটি কত?', '১৬৯', '২২৫', '২৫৬', '২৭২', 'B', 5, 5),\n" +
                "(492, 'একটি আয়তক্ষেত্রের দৈর্ঘ্য প্রস্থের ৩ গুন। আয়তক্ষেত্রটির ক্ষেত্রফল ৩০০ বর্গমিটার হলে উহার পরিসীমা কত?', '৭০ মিটার', '৭৫ মিটার', '৮০ মিটার', '৯০ মিটার', 'C', 5, 5),\n" +
                "(493, ' x+y=7 এবং xy=10 হলে (x-y)² এর মান কত?', '3', '9', '6', '12', 'B', 5, 5),\n" +
                "(494, 'বাঙ্গালা ভাষার ইতিবৃত্ত কে রচনা করেন?', 'সুনীতি কুমার চট্টোপাধ্যয়', 'সুকুমার সেন', 'মুহাম্মদ শহীদুল্লাহ', 'মুহাম্মদ এনামুল হক', 'C', 5, 5),\n" +
                "(495, 'রবীন্দ্রনাথ ঠাকুরের কোন গ্রন্থটি উপন্যাস?', 'শেষের কবিতা', 'বলাকা', 'ডাকঘর', 'কালন্তর', 'A', 5, 5),\n" +
                "(496, 'কাজী নজরুল ইসলাম নামের সাথে জড়িত ধুমকেতু কোন ধরনের প্রকাশনা?', 'কবিতা', 'পত্রিকা', 'উপন্যাস', 'ছোটগল্প', 'B', 5, 5),\n" +
                "(497, 'জসীমউদ্দিনের প্রথম প্রকাশিত কাব্য গ্রন্থ কোনটি?', 'রাখালী', 'সোজন বাদিয়ার ঘাট', 'নকশী কাথার মাঠ', 'বালুচর', 'A', 5, 5),\n" +
                "(498, 'রাইফেল রোটি আওরাত'' উপন্যাসের রচয়িতা কে?', 'হাসান হাফিজুর রহমান ', 'জহির রায়হান', 'শহিদুল্লাহ কায়সার', 'আনোয়ার পাশা', 'D', 5, 5),\n" +
                "(499, 'জঙ্গম এর বিপরীত শব্দ কোনটি?', 'অরন্য', 'পর্বত', 'স্থাবর', 'সমুদ্র', 'C', 5, 5),\n" +
                "(500, 'উৎকর্ষতা কি কারনে অশুদ্ধ?', 'সন্ধি জনিত', 'প্রত্যয় জনিত', 'বিভক্তি জনিত', 'উপসর্গ জনিত', 'B', 5, 5),\n" +
                "(501, 'তুমি না বলেছিলে আগামীকাল আসবে ? এখানে না এর ব্যবহার কোন অর্থে?', 'না-বাচক', 'হ্যাঁ বাচক', 'প্রশ্নবোধক', 'বিস্ময় সূচক', 'B', 5, 5),\n" +
                "(502, 'কাজী নজরুল ইসলামের উপন্যাস কোনটি?', 'মৃত্যুক্ষুধা', 'আলেয়া', 'ঝিলিমিলি', 'মধুমালা', 'A', 5, 5),\n" +
                "(503, '''মা যে জননী কান্দে'' কোন ধরনের রচনা?', 'কাব্য', 'নাটক', 'উপন্যাস', 'প্রবন্ধ', 'A', 5, 5),\n" +
                "(504, 'কার মাথায় হাত বুলিয়েছো'' এখানে মাথা'' শব্দের অর্থ –', 'স্বভাব নষ্ট করা', 'স্পর্ধা বাড়া', 'ফাঁকি দেওয়া', 'কোন উপায়ে', 'C', 5, 5),\n" +
                "(505, 'শরৎচন্দ্রের কোন উপন্যাসটি সরকার কতৃক বাজেয়াপ্ত হয়েছিল?', 'পথের দাবী                         ', 'নিষ্কৃতি', 'চরিত্রহীণ', 'দত্তা', 'A', 5, 5),\n" +
                "(506, 'There are.....dangerous driver.', 'A very lot of', 'A very much of', 'A lot of', 'Very much of', 'C', 5, 5),\n" +
                "(507, 'I have read the book.....you lent me.', 'That', 'Whom', 'Whose', 'What', 'A', 5, 5),\n" +
                "(508, 'Water boils.....You heat it to 100° Centigrade', 'Unless', 'Until', 'If', 'Although', 'C', 5, 5),\n" +
                "(509, 'Tell me.....that.', 'Whom told you', 'That told you', 'Who told you', 'Told you', 'C', 5, 5),\n" +
                "(510, 'I opened the door as soon as I.....the bell.', 'Have heard', 'Have hearing', 'Am heard', 'Heard', 'D', 5, 5),\n" +
                "(511, 'I am looking for someone who.....play the piano.', 'Able to', 'Can be able', 'Is able', 'Can', 'D', 5, 5),\n" +
                "(512, 'Don’t make a noise while your father.....', 'Is being asleep', 'Is sleeping', 'Has slept', 'Asleep', 'B', 5, 5),\n" +
                "(513, 'As the sun .....I decided to go out', 'Shines', 'Has shone', 'Shine', 'Was shining', 'D', 5, 5),\n" +
                "(514, 'He gave up .....football when he got married.', 'To play', 'Playing', 'Play', 'Of playing', 'B', 5, 5),\n" +
                "(515, 'I have....interest in the matter.', 'Not', 'Any', 'None', 'No', 'D', 5, 5),\n" +
                "(516, '.....is not the only thing that tourists want to see', 'A scenery', 'Scencries', 'The sceneries', 'Scenery', 'D', 5, 5),\n" +
                "(517, 'Just now he.....his dinner but he says he’ll see you when he’s finished', 'Is having', 'Has had', 'Was having', 'Had', 'B', 5, 5),\n" +
                "(518, 'The children were entrusted.....the care of their uncle.', ' With', 'For', 'To', 'At', 'C', 5, 5),\n" +
                "(519, 'He parted.....his friends in tears.', 'With', 'From', 'Against', 'Beside', 'B', 5, 5),\n" +
                "(520, 'The expression ''lingua franca'' means-', 'the common language', 'The first language', 'International language', 'The French language', 'A', 5, 5),\n" +
                "(521, 'Choose the correct meaning : -He raised his eyebrow at my explanation', 'Show surprise or disapproval', 'Show agreement', 'Show happiness', 'Show indifference', 'A', 5, 5),\n" +
                "(522, 'Razzmatazz'' means -', 'A musical instrument', 'A well-planned programme', 'A noisy activity', 'A musical activity', 'C', 5, 5),\n" +
                "(523, 'The antonym for ''Recalcitrant'' -', 'Compliant', 'Passive', 'Indifferent', 'Careful', 'A', 5, 5),\n" +
                "(524, 'The synonym for ''Obdurate'' -', 'Deceitful', 'Stubborn', 'Sly', 'Swindler', 'B', 5, 5),\n" +
                "(525, 'বাংলাদেশের স্বাধীনতা যুদ্ধে বীরত্বপূর্ন অবদানের জন্য কত জনকে বীর উত্তম উপধিতে ভূষিত করা হয়?', '২৫৭ জন', '১৪৭ জন', '৪৪ জন', '৬৮ জন', 'D', 5, 5),\n" +
                "(526, 'বাংলাদেশের জাতীয় পতাকার ডিজাইনার কে?', 'কামরুল হাসান', 'জয়নুল আবেদিন', 'হামেদুর রহমার', 'হাসেম খান', 'A', 5, 5),\n" +
                "(527, 'কোন উৎস থেকে বাংলাদেশ সরকারের সর্বোচ্চ রাজস্ব আয় হয়?', 'আয়কর', 'আমদানী ও রপ্তানী', 'ভূমি ও রাজস্ব', 'মূল্য সংযোজন কর', 'D', 5, 5),\n" +
                "(528, 'বাংলাদেশের একমাত্র প্রবল দ্বীপের নাম কি?', 'সেন্ট মার্টিন', 'মহেশ খালী', 'হাতিয়া', 'সন্দীপ', 'A', 5, 5),\n" +
                "(529, 'সকল নাগরিক আইনের দৃষ্টিতে সমান এবং আইনের সমান আশ্রয় লাভের অধিকারী” সংবিধানের কোন অনুচ্ছেদে বর্নিত আছে?', '২৭', '২৬', '২৮', '৩০', 'A', 5, 5),\n" +
                "(530, 'প্রথম মহিলা পুলিশ নিয়োগ করা হয় কত সালে?', '১৯৭২', '১৯৭৪', '১৯৭৫', '১৯৭৭', 'B', 5, 5),\n" +
                "(531, 'সম্প্রতি গার্মেন্টসহ কতিপয় দ্রব্য বিনাশুল্কে কোন দেশে প্রবেশ অধিকার পেয়েছ?', 'যুক্তরাষ্ট', 'কানাডা', 'জাপান', 'চীন', 'B', 5, 5),\n" +
                "(532, 'স্বাধীনতার প্রথম ডাকটিকেটে কোন ছবি ছিল?', 'শহীদ মিনার', 'বাংলাদেশের ম্যাপ', 'সোনা মসজিদ', 'লালবাগের কেল্লা', 'A', 5, 5),\n" +
                "(533, 'বাংলাদেশের সর্বপ্রথম জাদুঘর কোনটি?', 'জাতিতাত্তিক জাদুঘর', 'বরেন্দ্র গবেষনা জাদুঘর', 'ঢাকা নগন জাদুঘর', 'জাতীয় যাদুঘর', 'B', 5, 5),\n" +
                "(534, '২০০৩-০৪ সনের বার্ষিক উন্নয়ন কর্মসূচির মোট ব্যয়?', '২০৩০০ কোটি টাকা', '১৯২০০ কোটি টাকা', '১৭১০০ কোটি টাকা', '১৯৫০০ কোটি টাকা', 'A', 5, 5),\n" +
                "(535, 'বাংলাদেশের বৃহত্তম স্থলবন্দর-', 'সোনা মসজিদ', 'চট্টোগ্রাম', 'বেনাপোল', 'হিলি', 'C', 5, 5),\n" +
                "(536, 'বীরশ্রেষ্ঠ ক্যাপ্টেন মহিউদ্দিন জাহাঙ্গীরের কবর এই জেলায়-', 'নাটোর', 'চাপাঁই নবাবগঞ্জ', 'জয়পুর হাট', 'নওগা', 'B', 5, 5),\n" +
                "(537, 'মার্কিন ডলারে ২০০১-০২ অর্থ বছরে বাংলাদেশের রপ্তানী আয় প্রায়-', 'আট বিলিয়ন', 'ছয় বিলিয়ন', 'পাঁচ বিলিয়ন', 'সাত বিলিয়ন', 'B', 5, 5),\n" +
                "(538, 'সম্প্রতি ‘সাফ’ ফুটবলে এই দেশের সাথে খেলে বাংলাদেশ শিরোপা পায়-', 'মালদ্বীপ', 'ভারত', 'পাকিস্তান', 'নেপাল', 'A', 5, 5),\n" +
                "(539, 'বাংলাদেশের সম্প্রতি এই জেলায় চা বাগান করা হয়', 'পঞ্চগড়', 'দিনাজপুর', 'কুড়িগ্রাম', 'বান্দরবন', 'A', 5, 5),\n" +
                "(540, 'বাংলাদেশের এই জেলায় সম্প্রতি এই প্রথম রেল সংযোগ হয়-', 'ময়মনসিংহ', 'টাঙ্গাইল', 'বরিশাল', 'সিরাজগঞ্জ', 'B', 5, 5),\n" +
                "(541, 'আইন- শৃংখলা বিঘ্নকারী অপরাধ(দ্রুত বিচার) জাতীয় সংসদে পাশ হয় কোন সালের কত তারিখে?', '১৭ এপ্রিল ২০০২', '৯ এপ্রিল ২০০২', '১৮ মার্চ২০০২', '৩ এপ্রিল ২০০২', 'B', 5, 5),\n" +
                "(542, 'দক্ষিন তালপট্টি দ্বীপের অপর নাম কি?', 'কুতুবদিয়া', 'সোনাদিয়া', 'সন্দীপ', 'পূর্বাশা দ্বীপ', 'D', 5, 5),\n" +
                "(543, 'হালদা ভ্যালি কোথায় অবস্থিত?', 'রাঙ্গামাটি', 'খাগড়াছড়ি', 'বান্দরবন', 'সন্দীপ', 'B', 5, 5),\n" +
                "(544, 'বাংলা সাহিত্যের প্রথম ইতিহাস গ্রন্থ রচনা করেন?', 'সুকুমার সেন', 'দিনেশচন্দ্র সেন', 'মুহম্মদ শহীদুল্লাহ', 'অসিত কুমার বন্দোপাধ্যয়', 'B', 5, 6),\n" +
                "(545, 'বঙ্গদর্শন পত্রিকার প্রথম সম্পাদক কে?', 'প্যারিদাশ মিত্র', 'বঙ্কিমচন্দ্র চট্টোপাধ্যয়', 'রবীন্দ্রনাথ ঠাকুর', 'প্রমথ চৌধুরী', 'B', 5, 6),\n" +
                "(546, 'মৃন্ময়ী'' রবীন্দ্রনাথ ঠাকুরের কোন ছোট গল্পের নায়িকা?', 'সমাপ্তি', 'দেনাপাওনা', 'পোষ্টমাষ্টার', 'মধ্যবর্তিনী', 'A', 5, 6),\n" +
                "(547, 'উত্তম পুরুষ'' উপন্যাসের রচয়িতা কে?', 'শওকত ওসমান', 'জহির রায়হান', 'শহীদুল্লাহ কায়সার', 'রশীদ করিম', 'D', 5, 6),\n" +
                "(548, 'কাশবনের কন্যা'' কোন জাতীয় রচনা?', 'নাটক', 'উপন্যাস', 'ছোট গল্প', 'কাব্য', 'B', 5, 6),\n" +
                "(549, 'কোনটি মুহাম্মাদ এনামুল হকের রচনা?', 'ভায়ার ইতিবৃত্ত', 'আধুনিক ভাষাতত্ত্ব', 'মনীষা মঞ্জুষা', 'বাংলাদেশের আঞ্চলিক ভাষার অভিধান', 'C', 5, 6),\n" +
                "(550, 'বাংলা সাহিত্যে সনেট রচনার প্রবতক কে?', 'মাইকেল মধুসূদন দত্ত', 'রবীন্দ্রনাথ ঠাকুর', 'দেবেন্দ্রনাথ সেন', 'মোহিত লাল মজুমদার', 'A', 5, 6),\n" +
                "(551, 'জসীমউদ্দিনের কবর'' কবিতা কোন পত্রিকায় প্রথম প্রকাশিত হয়?', 'তত্ববোধিনী পত্রিকা', 'ধুমকেতু', 'কল্লোল', 'কালি ও কলম', 'C', 5, 6),\n" +
                "(552, 'ক্ষীয়মান'' এর বিপরীত শব্দ কি?', 'বৃহৎ', 'বর্ধিষ্ঞ', 'বর্ধমান', 'দ্ধিপ্রাপ্ত', 'C', 5, 6),\n" +
                "(553, 'নষ্ট হওয়ার অভাব যার'' এক কথায় হবে-', 'নিদাঘ', 'নশ্বর', 'নষ্টমান', 'বিনশ্বর', 'B', 5, 6),\n" +
                "(554, 'যে সমাসের পূর্বাপদ সংখ্যাবাচক এবং সমস্ত পদের দ্বারা সমাহার বুঝায় তাকে বলে-', 'দ্বন্ধ সমাস', 'রুপক সমাস', 'বহুব্রিহি সমাস', 'দ্বিগু সমাস', 'D', 5, 6),\n" +
                "(555, 'কোন বাক্যটি শুদ্ধ?', 'তাহার জীবন সংশয়পূর্ন', 'তাহার জীবন সংশয়ময়', 'তাহার জীবন সংশয়াপূর্ন', 'তাহার জীবন সংশয়ভরা', 'C', 5, 6),\n" +
                "(556, 'চাঁদমুখ এর ব্যাসবাক্য হলো-', 'চাঁদ মুখের ন্যায়', 'চাঁদের মত মুখ', 'চাঁদ মুখ যার', 'চাঁদরুপ মুখ', 'B', 5, 6),\n" +
                "(557, 'সবাঙ্গে ব্যাথা, ঔষধ দিব কোথা’ এই বাক্যে ''ঔষধ'' শব্দ কোন কারকে কোন বিভক্তির উদাহরণ?', 'কর্ম কারকে শূন্য', 'সম্পাদনে সপ্তমী', 'অধিকরনে শূন্য', 'কতৃকারকে শূন্য', 'A', 5, 6),\n" +
                "(558, 'যেহেতু তুমি বেশি নম্বর পেয়েছো,সুতরাং তুমি প্রথম হবে'' কোন ধরনের বাক্য?', 'সরল', 'জটিল', 'যৌগিক', 'অনুজ্ঞামুলক', 'B', 5, 6),\n" +
                "(559, 'সন্ধ্যারাগে ঝিলিমিলি ঝিলমের স্রোতখানি বাকা'' রবীন্দ্রনাথের কোন কাব্যের কবিতা?', 'বলাকা', 'সোনার তরী', 'চিত্রা', 'পুনশ্চ', 'A', 5, 6),\n" +
                "(560, 'বাংলা ছন্দ কত রকমের?', 'এক রকমের', 'দু রকমের', 'তিন রকমের', 'চার রকমের', 'C', 5, 6),\n" +
                "(561, 'কোনটি শুদ্ধ বানান?', 'দন্দ', 'দ্বন্দ', 'দ্বন্দ্ব', 'দন্ব', 'C', 5, 6),\n" +
                "(562, 'অমিত্রাক্ষর'' ছন্দের বৈশিষ্ট্য হলো-', 'অন্ত্যমিল আছে', 'অন্ত্যমিল নেই', 'চরনের প্রথমে মিল থাকে', 'বিশ মাত্রার পব থাকে', 'B', 5, 6),\n" +
                "(563, 'পূনর্ভবা , নাগর ও টাঙ্গন কোন নদীর উপনদী?', 'মহানন্দা', 'ভৈরব', 'কুমার', 'বরাল', 'A', 5, 6),\n" +
                "(564, 'প্রাচীন পুন্ড্রনগর'' কোথায় অবস্থিত ?', 'ময়নামতি', 'বিক্রম পুর', 'পাহারপুর', 'মহাস্থানগড়', 'D', 5, 6),\n" +
                "(565, 'উপমহাদেশীয়দের মধ্যে ঢাকা বিশ্ববিদ্যালয়ের প্রথম ভাইস চ্যান্সেলর', 'ড: রমেশচন্দ্র মজুমদার', 'ড: মুহাম্মদ হাসান', 'ড: সৈয়দ মোয়াজ্জেম হোসেন', 'স্যার এ.এফ.রহমান', 'D', 5, 6),\n" +
                "(566, 'প্রধান নির্বাচন কমিশনের মেয়াদকাল কত?', '৪ বছর', '৫ বছর', '৩ বছর', '৭ বছর', 'B', 5, 6),\n" +
                "(567, 'সার্কভুক্ত কোন দেশের দূতাবাস বাংলাদেশে নেই?', 'মালদ্বীপ', 'নেপাল', 'শ্রীলঙ্কা', 'ভুটান', 'A', 5, 6),\n" +
                "(568, 'কোন বাংলাদেশী উপজাতির পারিবারিক কাঠামো পিতৃতান্ত্রিক?', 'মারমা', 'খাসিয়া', 'সাওতাল', 'গারো', 'A', 5, 6),\n" +
                "(569, 'নিম্নের কোন পযটক সোনারগাও এসেছিলেন?', 'ফা হিয়েন', 'ইবনে বতুতা', 'মার্কো পোলো', 'হিউয়েন সাং', 'B', 5, 6),\n" +
                "(570, 'বাংলাদেশে বতমানে কয় স্তর বিশিষ্ট স্থানীয় সরকার ব্যবস্থা চালু আছে?', '৩', '৪', '৫', '৬', 'B', 5, 6),\n" +
                "(571, 'বাংলাদেশে অষ্টম জাতীয় সংসদে কোন সদস্য নিজেই নিজের কাছে সংসদ সদস্য হিসাবে শপথ নেন?', 'বেগম খালেদা জিয়া', 'শেখ হাসিনা', 'জমির উদ্দিন সরকার', 'আবদুল হামিদ', 'D', 5, 6),\n" +
                "(572, 'বাংলাদেশ কোন সালে CTBT অনুমোদন করেন?', '১৯৯৯', '২০০০', '২০০১', '২০০২', 'B', 5, 6),\n" +
                "(573, 'সদ্য ঘোষিত তিতাস উপজেলা কোন জেলায় অবস্থিত?', 'নোয়াখালি', 'কুমিল্লা', 'রংপুর', 'সিলেট', 'B', 5, 6),\n" +
                "(574, 'বাংলাদেশ জাতীয় সংসদে কোরাম হয় কত সদস্যের উপস্থিতিতে?', '৫৭ জন', '৬০ জন', '৬২ জন', '৬৩ জন', 'B', 5, 6),\n" +
                "(575, 'বাংলাদেশে একমাত্র কিশোরী সংশোধন প্রতিষ্ঠানটি কোথায় অবস্থিত?', 'টঙ্গি', 'কোনাবাড়ি', 'যশোর', 'গাজীপুর', 'B', 5, 6),\n" +
                "(576, 'বাঙালী ও যমুনা নদীর সংযোগ কোথায়?', 'রাজশাহী', 'পাবনা', 'বগুড়া', 'সিরাজগঞ্জ', 'C', 5, 6),\n" +
                "(577, 'সাবমেরিন কেবল'' প্রকল্পটি কোন মন্ত্রনালয়ের কার্যক্রম?', 'অর্থ', 'ডাক ও টেলিযোগাযোগ', 'বিঞ্জান ও প্রযুক্তি', 'পররাষ্ট্র', 'B', 5, 6),\n" +
                "(578, '২০০৪ সালে সর্বপ্রথম কোন দেশের রাষ্ট্রপ্রধান বাংলাদেশ সফর করেন?', 'ভিয়েতনাম', 'মিয়ানমার', 'নেপাল', 'ভুটান', 'A', 5, 6),\n" +
                "(579, 'মূল্য সংযোজন কর বাংলাদেশে কখন থেকে চালু করা হয়?', '১ জুলাই ১৯৯১', '১ জুলাই ১৯৯৩', '১ জুলাই ১৯৯৪', '১ জানুয়ারী ১৯৯৬', 'A', 5, 6),\n" +
                "(580, 'বাংলাদেশ উন্নয়ন ফোরামের সমন্বয়কারী কোন সংস্থা?', 'জিকা', 'ইউএন ডিপি', 'বিশ্বব্যাংক', 'আই এম এফ', 'C', 5, 6),\n" +
                "(581, 'কর্নফুলী নদীর উৎস ভারতের কোন রাজ্যে?', 'ত্রিপুরা', 'আসাম', 'মনিপুর', 'মেঘালয়', 'B', 5, 6),\n" +
                "(582, 'ক্রিকেটে বাংলাদেশ কোন সালে টেষ্ট মর্যাদা লাভ করে?', '২০০০ \\r\\n      ', '২০০১', '১৯৯৯', '১৯৯৮', 'A', 5, 6),\n" +
                "(583, '১ মিটার কত ইঞ্চির সমান\"?', '৩৯.৪৭ ইঞ্চি', '৩৭.৩৯ ইঞ্চি', '৩৯.৩৭ ইঞ্চি', '৩৭.৪৯ ইঞ্চি', 'C', 5, 6),\n" +
                "(584, '১+২+৩+৪+........+৯৯=কত?', '৪৬৫০  ', '৪৭৫০', '৪৮৫০', '৪৯৫০', 'D', 5, 6),\n" +
                "(585, 'log2+log4 +log8+.............', '45 log2', '55 log2', '65 log2', '75 log2', 'B', 5, 6),\n" +
                "(586, 'একটি 48 মিটার লম্বা খুটি ভেঙে গিয়ে সম্পূর্নভাবে বিছিন্ন না হয়ে ভূমির সাথে 30 ডিগ্রি কোন উৎপন্ন করে ।খুটিটি কত উচুতে ভেঙেছিল?', '14 মিটার', '16 মিটার', '18 মিটার', '20 মিটার', 'B', 5, 6),\n" +
                "(587, 'একটি আয়তকার ঘরের দৈর্ঘ্য বিস্তারের দ্বিগুন ।এর ক্ষেত্রফল ৫১২ বর্গমিটার হলে পরিসীমা কত?', '98 মিটার', '96 মিটার', '94 মিটার', '92 মিটার', 'B', 5, 6),\n" +
                "(588, 'y=3x+2,y=-3x+2 এবং y=-2দ্বারা গঠিত জ্যামিতিক চিত্রটি কোনটি হবে?', 'একটি সমকোনী ত্রিভুজ', 'একটি সমদ্বিবাহু ত্রিভুজ', 'একটি সমবাহু ত্রিভুজ', 'একটি বিষম বাহু ত্রিভুজ', 'B', 5, 6),\n" +
                "(589, 'জোট নিরপেক্ষ দেশ সমুহের প্রথম শীর্ষ সম্মেলন কোথায় অনুষ্ঠিত হয়?', 'দিল্লী', 'কায়রো', 'বেলগ্রেড', 'জাকার্তা', 'C', 5, 6),\n" +
                "(590, 'পানামা খাল কোন কোন মহাসাগরকেযুক্ত করেছে?', 'আটলান্টিক ও প্রশান্ত মহাসাগর', 'আটলান্টিক ও ভূমধ্যসাগর', 'ভারত ও প্রশান্ত মহাসাগর', 'প্রশান্ত ও ভূমধ্যসাগর', 'A', 5, 6),\n" +
                "(591, 'কে লৌহ মানবী বলিয়া পরিচিত?', 'ইন্দিরা গান্ধী', 'বেগম খালেদা জিয়া', 'মার্গারেট থ্যাচার', 'আং সাং শুকী', 'C', 5, 6),\n" +
                "(592, 'আবু গারিব বলিতে কি বুঝায়?', 'একজন বিখ্যাত দার্শনিক', 'একটি জাদুঘর', 'একটি জেলখানা', 'একজন বৈঞ্জানিক', 'C', 5, 6),\n" +
                "(593, 'বিগত ৫০ বছরের সেরা ফুটবলার কে?', 'পেলে', 'জিদান', 'বেকেন বাওয়ার', 'ম্যারাডোনা', 'A', 5, 6),\n" +
                "(594, 'ইউনেস্কোর প্রধান কার্যালায় কোথায় অবস্থিত?', 'নিউইয়র্ক', 'প্যারিস', 'রোম', 'জেনেভা', 'B', 5, 3),\n" +
                "(595, 'রাষ্ট্রপ্রধান না হয়েও কোন ব্যাক্তি রাষ্ট্রপ্রধানের মর্যাদা ভোগ করেন?', 'ইয়াসির আরাফাত', 'ওসামাবিন লাদেন', 'কফি আনান', 'অ্যারিয়েল শ্যারন', 'A', 5, 6),\n" +
                "(596, 'ডিজ আর্মিং ইরাক'' গ্রন্থটির রচিয়িতা কে?', 'সালমান রুশদী', 'কুলদীপ নায়ার', 'হ্যান্স ব্লিক্স', 'হিলারী ক্লিনটন', 'C', 5, 6),\n" +
                "(597, 'এ উপমহাদেশ থেকে এ যাবত কতজন নোবেল পুরস্কার পেয়েছেন?', 'চারজন', 'পাঁচজন', 'ছয়জন', 'সাতজন', 'D', 5, 6),\n" +
                "(598, 'নেপালের বর্তমান প্রধান মন্ত্রীর নাম কি?', 'মাধব কুমার নেপাল', 'মি: খাপা', 'মি: রানা', 'মি: দেউবা', 'A', 5, 6),\n" +
                "(599, 'ইরাকে কখন মার্কিন- বৃটিশ যৌথ সময়িক অভিযান শুরু হয়?', '২০০৩ সালের ১৮ মার্চ', '২০০৩ সলের ২০ মার্চ', '২০০৩ সালের ২২ মার্চ', '২০০৩ সালের ২৪ মার্চ', 'B', 5, 6);";
        sql[3]=preSql+ "(600, 'বর্তমানে জাতিসংঘের মহাসচিব কোন দেশের নাগরিক?', 'গিনি', 'ঘানা', 'দক্ষিন কোরিয়া', 'মরোক্কো', 'C', 5, 6),\n" +
                "(601, 'বিশ্বের নতুনতম রাষ্ট্র কোনটি?', 'লাইবেরিয়া', 'হংকং', 'আবখাজিয়া', 'তাইওয়ান', 'C', 5, 6),\n" +
                "(602, 'আরবলীগের প্রতিষ্ঠাতা সদস্য দেশ নয়-', 'সংযুক্ত আরব আমিরাত', 'মিশর', 'লেবানন', 'ইয়েমেন', 'A', 5, 6),\n" +
                "(603, 'কোন দেশটি ল্যাটিন আমেরিকার অন্তভুক্ত নয়?', 'ব্রাজিল', 'আর্জেটিনা', 'পেরু', 'পানামা', 'D', 5, 6),\n" +
                "(604, 'ইন্টারপোল সংস্থার সদর দপ্তর কোথায়?', 'প্যারিস', 'লিয়ো', 'ভার্সাই', 'মাসাই', 'B', 5, 6),\n" +
                "(605, 'মধ্য প্রাচ্যে কখন প্রথম তেলঅস্ত্র ব্যবহার করা হয়েছিল?', '১৯৭৩ সালে', '১৯৯১ সালে', '১৯৮১ সালে', '২০০৩ সালে', 'A', 5, 6),\n" +
                "(606, 'বান্দুং'' শহর টি কোন দেশে অবস্থিত?', 'চীন', 'ইন্দ্রোনেশিয়া', 'যুগোস্নাভিয়া', 'মালয়েশিয়া', 'B', 5, 6),\n" +
                "(607, 'কার্টাগেনা'' প্রটোকল হচ্ছে', 'জাতিসংঘের জৈবনিরাপত্তা বিষয়ক চুক্তি', 'ইরাক পুর্নগঠন চুক্তি', 'যুক্তরাষ্ট্র-মেক্সিকো বৈধ চুক্তি', 'শিশু অধিকার চুক্তি', 'A', 5, 6),\n" +
                "(608, 'এ বছরে তামাক নিষিদ্ধ নিয়ন্ত্রন আন্তর্জাতিক জেনেভা সম্মেলনে সভাপতি কোন দেশের নাগরিক?', 'বাংলাদেশ', 'ভারত', 'পাকিস্তান', 'সুইজারল্যান্ড', 'C', 5, 6),\n" +
                "(609, 'Stocking are -------Stocks.', 'Long', 'Small', 'Big', 'Short', 'A', 5, 6),\n" +
                "(610, 'Many students will now be starting to - about their exams result', 'Worry', 'Reflect', 'Inquire', 'Comment', 'A', 5, 6),\n" +
                "(611, 'She told me his name after he', 'Left', 'Had left', 'Has been left', 'Has been leaving', 'B', 5, 6),\n" +
                "(612, 'Climate is a....of the environment', 'state', 'rank', 'size', 'situation', 'A', 5, 6),\n" +
                "(613, 'I finally killed the fly....a rolled up newspaper.', 'By', 'with', 'through', 'from', 'B', 5, 6),\n" +
                "(614, 'We must look pleased or else he''ll be....', 'dissatisfied', 'cross', 'happy', 'delighted', 'A', 5, 6),\n" +
                "(615, 'The inan died ____ over eating.', 'by', 'of', 'for', 'from', 'D', 5, 6),\n" +
                "(616, 'He advised me ___ smoking', 'giving up', 'to give up', 'in giving up', 'from giving up', 'B', 5, 6),\n" +
                "(617, 'The expression ''after one''s own heart'' means....', 'To be in low spirit', 'With complete devotion', 'To one''s own liking', 'To be in high spirit', 'C', 5, 6),\n" +
                "(618, 'The day of my sister''s marriage is drawing (near).The braket word is a / an', 'adjective', 'verb', 'preposition', 'adverb', 'D', 5, 6),\n" +
                "(619, 'He intends to___in the country for two months', 'live', 'stay', 'stop', 'halt', 'B', 5, 6),\n" +
                "(620, 'What are you so angry--?', 'about', 'at', 'with', 'for', 'C', 5, 6),\n" +
                "(621, 'The parents became extremely....when their son had not returned by eleven, o''clock', 'angry', 'annoyed', 'disturbed', 'anxious', 'D', 5, 6),\n" +
                "(622, 'I.....remember the holiday I spent in your home'', she said.', 'ever', 'hardly', 'usually', 'always', 'D', 5, 6),\n" +
                "(623, 'He knew it was a very ..... operation, but he was determined to carry it out', 'difficult', 'dangerous', 'risky', 'troublesome', 'C', 5, 6),\n" +
                "(624, 'Misanthropist means --', 'One who flirts with ladies', 'A person of narrow views', 'A hater of mankind ', 'One who believe that God is in everything', 'C', 5, 6),\n" +
                "(625, 'First language means the ---language', 'important', 'main', 'natural', 'official', 'C', 5, 6),\n" +
                "(626, 'Shaheen would never have taken the job if__ what great demand it would make on his time.', 'he knew', 'he had been knowing ', 'he had known', 'he was knowing', 'C', 5, 6),\n" +
                "(627, 'She has ___ her hair a beautiful shade of brown.', 'colored', 'given', 'dried', 'dyed', 'D', 5, 6),\n" +
                "(628, '৬% হারে ৯ মাসে ১০,০০০/-টাকার উপর সুদ কত হবে?', '৫০০ টাকা', '৬০০ টাকা', '৪৫০ টাকা', '৬৫০ টাকা', 'C', 5, 6),\n" +
                "(629, 'যদি ১৫ টি পোশাকের মধ্যে শতকরা ৪০ ভাগ শার্ট হয় তবে ১৫ টি পোশাকের মধ্যে কতটি শার্ট নয়?', '৬ টি', '৯ টি', '১২ টি', '১৫ টি', 'B', 5, 6),\n" +
                "(630, 'প্রেসার কুকারে পানির স্ফুটনাংক --', 'কম হয়', 'বেশি হয়', 'ঠিক থাকে', 'কোনটিই নয়', 'B', 5, 6),\n" +
                "(631, 'তাপমাত্রায় পানির ঘনত্ব সবচেয়ে বেশি?', '০° সেন্টিগ্রেট', '১০° সেন্টিগ্রেট', '৪° সেন্টিগ্রেট', '১০০° সেন্টিগ্রেট', 'C', 5, 6),\n" +
                "(632, 'CNG এর অর্থ---', 'কার্বনমুক্ত নতুন পরিবেশ বান্ধব তেল', 'নতুন ধরনের ট্যাক্সি ক্যাব', 'সীসামুক্ত পেট্রোল', 'কমপ্রেস করা প্রাকৃতিক গ্যাস', 'D', 5, 6),\n" +
                "(633, 'নারভাস সিষ্টেমের ষ্ট্রাকচারাল এবং ফাংশনাল ইউনিটকে কি বলে?', 'নেফ্রোন', 'নিউরোন', 'থাইমাস', 'মাষ্ট সেল', 'B', 5, 6),\n" +
                "(634, 'কোন মাধ্যমে শব্দের গতি সবচেয়ে বেশি?', 'শূনতায়', 'লোহা', 'পানি', 'বাতাশ', 'D', 5, 6),\n" +
                "(635, 'সুন্দর বনের আয়তন প্রায় কত বর্গ কিলোমিটার?', '৩৮০০', '৪১০০', '৫৫৭৫', '৬৯০০', 'C', 5, 6),\n" +
                "(636, 'রক্তে হিমোগ্লোবিনের কাজ কি?', 'অক্সিজেন পরিবহন করা', 'রোগ প্রতিরোধ করা', 'রক্তে জমাট বাধতে সাহাজ্য করা', 'উল্লেখিত সবকয়টি', 'A', 5, 6),\n" +
                "(637, 'ইন্টারপোল সংস্থার সদর দপ্তর কোথায়?', 'ব্রাজিল', 'আর্জেটিনা', 'পেরু', 'পানামা', 'D', 5, 6),\n" +
                "(638, 'Balled কি?', 'লোকগীতি', 'লোকগাথা', 'গীতিকা', 'গাথা', 'D', 5, 7),\n" +
                "(639, 'শাহনামা মৌলিক গ্রন্থটি কার?', 'মালিক জয়সী', 'ফেরদৌসী', 'সৈয়দ হামজা', 'কাজী দৌলত উজির বাহরাম খাঁ ', 'B', 5, 6),\n" +
                "(640, 'ড. মুহাম্মদ শহিদুল্লাহর বাংলা সাহিত্যর ইতিহাস গ্রন্থের নাম', 'বঙ্গভাষা ও সাহিত্য', 'বাংলা সাহিত্যের কথা', 'বাঙ্গলা সাহিত্যের ইতিহাস', 'বাংলা সাহিত্যের ইতিবৃও ', 'B', 5, 6),\n" +
                "(641, 'চৌ-হদ্দি শব্দটি কোন কোন ভাষার শব্দ মিলে হয়েছে?', 'বাংলা+ফারসি', 'সংস্কৃত+ফারসি', 'ফারসি+আরবি', 'সংস্কৃত +আরবি', 'D', 5, 7),\n" +
                "(642, 'রূপ লাগি আঁখি ঝুর গুনে মন ভোর'' কার রচনা?', 'তানদাস', 'চন্ডীদাস', 'বিদ্যাপতি', 'লোচন দাস', 'B', 5, 7),\n" +
                "(643, 'সাজাহান’ নাটকের প্রথম রচয়িতা কে?', 'ক্ষীরোদপ্রসাদ বিদ্যাবিনোদ', 'তুলসি লাহিড়ি', 'দ্বিজেন্দ্রলাল রায়', 'বলাইচাদ মুখোপাধ্যয়', 'C', 5, 7),\n" +
                "(644, 'নেমেসিস'' নাটকে নুরুল মোমেন কোন বিষয়কে তুলে ধরেছেন?', 'দ্বিতীয় বিশ্বযুদ্ধ', 'ঊনপঞ্চাশের মনান্তর', 'বায়ান্নর ভাষা আন্দোলন', 'একাওরের মুক্তিযুদ্ধ', 'A', 5, 7),\n" +
                "(645, 'ভারতচন্দ্র রায়গুনাকর কোন রাজসভার কবি?', 'আরাকান রাজসভা', 'কৃষ্ণ নগর রাজসভা', 'রাজাগনেশের রাজসভা', 'লক্ষনসেনেস রাজসভা', 'B', 5, 7),\n" +
                "(646, 'যা কিছু হারায় গিন্নি বলেন,কেষ্টা বেটাই চোর''-এখানে হারায় কোন ধাতু?', 'প্রযোজক ধাতু', 'ভাব বাচ্যের ধাতু', 'সংযোগ মুলক ধাতু', 'নাম ধাতু', 'A', 5, 7),\n" +
                "(647, 'ভারতচন্দ্র রায়গুনাকর কোন রাজসভার কবি?', 'আরাকান রাজসভা', 'কৃষ্ণ নগর রাজসভা', 'রাজাগনেশের রাজসভা', 'লক্ষনসেনেস রাজসভা ', 'B', 5, 7),\n" +
                "(648, 'যা কিছু হারায় গিন্নি বলেন,কেষ্টা বেটাই চোর''-এখানে হারায় কোন ধাতু?', 'প্রযোজক ধাতু', 'ভাব বাচ্যের ধাতু', 'সংযোগ মুলক ধাতু', 'নাম ধাতু', 'A', 5, 7),\n" +
                "(649, 'মহুয়া'' পালাটির রচয়িতা?', 'দ্বিজ কানাই', 'মনসুর বয়াতি', 'নয়নচাদ ঘোষ', 'দ্বিজ ঈশান', 'A', 5, 7),\n" +
                "(650, 'ফোর্ট উইলিয়াম কলেজে বাংলা বিভাগ খোলা হয়-', '১৮০০ সালে', '১৮০১ সালে', '১৮০২ সালে', '১৮০৪ সালে', 'B', 5, 7),\n" +
                "(651, 'কে সর্বপ্রথম বাংলা টাহপ সংযোগে বাংলা ব্যাকরন মুদ্রন করেন?', 'স্যার উইলিয়াম জোনস', 'স্যার উইলিয়াম ক্যারি', 'রাজীব লোচন মুখোপাধ্যায়', 'ব্রাসি হ্যালহেড', 'D', 5, 7),\n" +
                "(652, 'তত্ত্ববোধিনী'' পত্রিকার সম্পাদক কে?', 'ঈশ্বরচন্দ্র গুপ্ত', 'অক্ষয় কুমার দত্ত', 'প্যারিচাদ মিত্র', 'বঙ্কিমচন্দ্র চট্টোপাধ্যায়', 'B', 5, 7),\n" +
                "(653, 'কোনটি দীনবন্ধু মিত্রের রচনা?', 'কমলে কামিনী', 'চক্ষুদান', 'বিধবা বিবাহ', 'ভদ্রার্জুন', 'A', 5, 7),\n" +
                "(654, 'কোন গ্রন্থটি মহাকাব্য?', 'অবকাশ রঞ্জিনী', 'বৃত্র সংহার', 'বিরহ বিলাপ', 'বীরাঙ্গনা কাব্য', 'B', 5, 7),\n" +
                "(655, 'বত্রিশ সিংহাসন কার রচনা?', 'মিত্যুঞ্জয় বিদ্যালঙ্কার', 'রামরাম বসু', 'বিদ্যাসাগর', 'রাজীব লোচন মুখোপাধ্যায়', 'A', 5, 7),\n" +
                "(656, 'ঠকচাচা’ চরিত্রটি কোন উপন্যাসে?', 'হুতোম পেচার নকশা', 'আলালের ঘরের দুলাল', 'সধবার একাদশী', 'বুড়োশালিকের ঘাড়ে রোঁ', 'B', 5, 7),\n" +
                "(657, 'উদাসীন পথিকের মনের কথা'' কোন জাতীয় রচনা?', 'নাটক', 'কাব্য', 'আত্মজৈবনিক উপন্যাস', 'গীতি কবিতার সংকলন', 'C', 5, 7),\n" +
                "(658, 'তাজকেরাতুল আওলিয়া'' অবলম্বনে তাপসমালা''কে রচনা করেন?', 'মুন্সি আবদুল লতিফ', 'কাজী আকরাম হোসেন', 'গিরিশচন্দ্র সেন', 'শেখ আব্দুল জব্বার', 'C', 5, 7),\n" +
                "(659, 'কোন নাটকটি সেলিম আল-দিনের?', 'মুনতাসীরি ফ্রান্টাসি', 'পায়ের আওয়াজ পাওয়া যায়', 'কবর', 'বহুব্রীহি', 'A', 5, 7),\n" +
                "(660, 'আন্তজাতিক মাতৃভাষা দিবস কোন সালে স্বীকৃত হয়?', '১৯৯৮', '১৯৯৯', '২০০০', '২০০১', 'B', 5, 7),\n" +
                "(661, 'বাংলা একাডেমী কোন সালে প্রতিষ্ঠিত হয়?', '১৯৪৫', '১৯৫৫', '১৯৫৬', '১৯৫৭', 'B', 5, 7),\n" +
                "(662, 'দারিদ্র্য'' কবিতাটি নজরুল ইসলামের কোন কাব্যের অন্তভুক্ত?', 'সাম্যবাদী', 'বিষের বাঁশি', 'সিন্ধুহিন্দোল', 'নতুন চাঁদ', 'C', 5, 7),\n" +
                "(663, 'কোন শব্দটি ফারসি?', 'মুসাফির', 'তকদির', 'পেরেশান', 'মজলুম', 'C', 5, 7),\n" +
                "(664, 'উপসর্গ কোনটি?', 'অতি', 'থেকে', 'চেয়ে', 'দ্বারা', 'A', 5, 7),\n" +
                "(665, 'দাপ্তরিক কোন শব্দটির ইংরেজী ভাষা থেকে আগত?', 'আইন', 'দাখিল', 'এজেন্ট', 'মুচলেকা', 'C', 5, 7),\n" +
                "(666, 'নেমেসিস'' কোন জাতীয় রচনা?', 'কাব্য', 'নাটক', 'উপন্যাস', 'গীতিকবিতা', 'B', 5, 7),\n" +
                "(667, 'তোমার সৃষ্টির পথে রেখেছ আকীর্ণ করি’-রবিন্দ্রনাথের কোন কাব্যের কবিতা?', 'পূরবী', 'শেষলেখা', 'আকাশ প্রদীপ', 'সেজুঁতি', 'B', 5, 7),\n" +
                "(668, 'জয়গুন'' কোন উপন্যাসের চরিত্র?', 'জননী', 'সূর্যদীঘল বাড়ি', 'সারেং বৌ', 'হাজার বছর ধরে', 'C', 5, 7),\n" +
                "(669, 'নবান্ন'' শব্দটি কোন প্রক্রিয়ায় গঠিত?', 'সমাস', 'সন্ধি', 'প্রত্যয়', 'উপসর্গ', 'B', 5, 7),\n" +
                "(670, 'কোনটি অর্থ পক্ক অর্থে প্রকাশ পায়?', 'পাকা বাড়ি', 'পাকা রং', 'পাকা কাজ', 'পাকা আম', 'D', 5, 7),\n" +
                "(671, 'পাখি সব করে রব রাতি পোহাইল''পংক্তির রচয়িতা কে?', 'মদন মোহন তর্কালংকার', 'রাম নারায়ন তর্কারত্ন', 'বিহারীলাল চক্রবর্তী', 'কৃষ্ঞচন্দ্র মজুমদার', 'A', 5, 7),\n" +
                "(672, 'বনফুল'' কার ছদ্মনাম?', 'প্রমথ চৌধুরী', 'বলাইচাঁদ মুখোপাধ্যায়', 'যতীন্দ্রমোহন বাগচী', 'মোহিতলাল মজুমদার', 'B', 5, 7),\n" +
                "(673, 'কাজী নজরুল ইসলামের উপন্যাস কোনটি?', 'মৃত্যুক্ষুধা', 'আলেয়া', 'ঝিলিমিলি', 'মধুমালা', 'A', 5, 7),\n" +
                "(674, 'যে-ই তার দর্শন পেলাম,সে-ই আমরা প্রস্থান করলাম''-এটি কোন জাতীয় বাক্য?', 'সরল বাক্য', 'যোগিক বাক্য', 'মৌলিক বাক্য', 'মিশ্র বাক্য', 'D', 5, 7),\n" +
                "(675, 'লাঠালাঠি'' –এটি কোন সমাস?', 'প্রাদি সমাস', 'ব্যাতিহার বহুব্রীহি সমাস', 'ততপুরুষ সমাস', 'কর্মধারয় সমাস', 'B', 5, 7),\n" +
                "(676, 'ভানু সিংহ ঠাকুরের পদাবলী''-রচয়িতা কে?', 'ভানু বন্দোপাধ্যায়', 'চন্ডীদাস', 'রবী্ন্দ্রনাথ ঠাকুর', 'ভারতচন্দ্র', 'C', 5, 7),\n" +
                "(677, 'প্র,পরা,অপ--', 'বাংলা উপসর্গ', 'সংস্কৃত উপসর্গ', 'বিদেশি উপসর্গ', 'উপসর্গ স্থানীয় অব্যয়', 'B', 5, 7),\n" +
                "(678, 'টা,টি,খানা ইত্যাদি--', 'পদাশ্রিত নিদের্শক', 'প্রকৃতি', 'বিভক্তি', 'উপসর্গ', 'A', 5, 7),\n" +
                "(679, 'কাজী নজরুল ইসলাম কোন কবিতা রচনার জন্য কারাবরণ করেন?', 'বিদ্রোহী', 'প্রলয়োল্লাস', 'আনন্দময়ীর আগমনে', 'নারী', 'C', 5, 7),\n" +
                "(680, 'Choose the correct sentence.', 'Every body have gone there', 'Every body are gone there', 'Every body has gone there', 'Every body has went there', 'C', 5, 7),\n" +
                "(681, 'Choose the correct sentence.', 'The train is running in time', 'The train is running on time', 'The train is running with time', 'The train is running to time', 'B', 5, 7),\n" +
                "(682, 'Choose the correct preposition.My brother has no interest.....music', 'For', 'In', 'With', 'At', 'B', 5, 7),\n" +
                "(683, 'Fill in the blank with write option. I am looking forward.......you', 'To seeing', 'Seeing', 'To see', 'To have seen', 'A', 5, 7),\n" +
                "(684, 'Choose the correct form (passive) of- Who will do the work?\"', 'Who will be done the work?', 'Who will done the work?', 'By whom will the work be done?', 'None', 'C', 5, 7),\n" +
                "(685, 'Fill in the blank with the correct phrase: ..... your shoes before entering the mosque.', 'Put on', 'Put off', 'Put away', 'Put outs', 'B', 5, 7),\n" +
                "(686, 'Choose the correct sentence.', 'I have looked for a good doctor before I met you', 'I had looked for a good doctor before I met you', 'I looked for a good doctor before I met you', 'I am looking for a good doctor before meeting you', 'B', 5, 7),\n" +
                "(687, 'Fill in the blank with correct preposition.He is devoid ......commonsense.', 'Of', 'From', 'Introduction', 'At', 'A', 5, 7),\n" +
                "(688, 'Select the write word.He run fast lest he ....... miss the train', 'Can', 'Should', 'Could', 'Has', 'B', 5, 7),\n" +
                "(689, 'Choose the correct preposition.The police is looking .....the case.', 'After', 'On', 'Up', 'Into', 'D', 5, 7),\n" +
                "(690, 'Choose the correct spelling', 'Ascertain', 'Assertain', 'Ascertain', 'asartain', 'A', 5, 7),\n" +
                "(691, 'Select the correct sentence', 'The man was tall who stole my bag', 'The man stole my bag who was tall', 'The man who stole my bag was tall', 'The man was tall who is stealing tall my bag', 'C', 5, 7),\n" +
                "(692, 'Complete the sentence with the correct verb form: Neela ..... her hand when she was cooking dinner', 'Is burning', 'Burnt', 'Will burn', 'Was burning', 'B', 5, 7),\n" +
                "(693, 'Choose the correct preposition: The tree has been blown ....... by the storm', 'Away', 'Up', 'Off', 'Out', 'A', 5, 7),\n" +
                "(694, 'Identify the correct passive form of` He is going to open a shop', 'He is being gone to open a shop', 'A shop is being gone opened by him', 'A shop will be opened by him', 'A shop is going to be opened by him', 'D', 5, 7),\n" +
                "(695, 'Identify the correct synonym for the word ''Magnanimous''', 'Generous', 'Unkind', 'Revengeful', 'Friendly', 'A', 5, 7),\n" +
                "(696, 'Fill in the blank with the correct phrase: He...... arrested if he had tried to leave the country.', 'Would', 'Could be', 'Would have been', 'Must be', 'C', 5, 7),\n" +
                "(697, 'Choose the write word to fill the blank. Two of the children have to sleep in one bed,but the other three have.....ones.', 'Different', 'separate', 'Complete', 'Lonely', 'B', 5, 7),\n" +
                "(698, 'Choose the write word to fill the blank: The democratic partiy''s candidate.....defeat in the small hours of the morning.', 'Consented', 'Agreed', 'Accepted', 'Granted', 'C', 5, 7),\n" +
                "(699, 'The proper function of the press is surely to......the man in the street with facts.', 'Equip', 'Deliver', 'Proffer', 'Provide', 'D', 5, 7),\n" +
                "(700, 'Choose the write word to fill the blank: Since his retirement, Mr. Chowdhury, who was - a teacher, has written four novels.', 'Usually', 'Presently', 'Already', 'Formerly', 'D', 5, 7),\n" +
                "(701, 'Choose the write word to fill the blank:I should appreciate it if you could complete this work....... Thursday.', 'Till', 'Until', 'Upto', 'By', 'D', 5, 7),\n" +
                "(702, 'Choose the write word to fill the blank: If will be your task to make sure the – of traffic is maintained without interruption.', 'Circulation', 'Flow', 'Current', 'procession', 'B', 5, 7),\n" +
                "(703, 'Paediatric'' relates to the treatment of', 'Adults', 'Children', 'Women', 'Old people', 'B', 5, 7),\n" +
                "(704, 'The word ecological is related to-', 'Demography', 'Pollution', 'Atmosphere', 'Environment', 'D', 5, 7),\n" +
                "(705, 'The correct spelling is-', 'Humorious', 'Humorous', 'Humourous', 'Humurious', 'B', 5, 7),\n" +
                "(706, 'A pilgrim is a person who undertakes a journey to a-', 'Mosque', 'New country', 'Holy place', 'Bazaar', 'C', 5, 7),\n" +
                "(707, 'A person who writes about his own life writes-', 'A biography', 'A diary', 'A chronicle', 'An autobiography', 'D', 5, 7),\n" +
                "(708, 'What is the meaning of White elephant?', 'An elephant of white colour', 'A hoarder', 'A black marketer', 'A very costly and troublesome possession', 'D', 5, 6),\n" +
                "(709, 'If we want concrete proof, we are looking for-', 'Building materials', 'Something to cover a path', 'Clear evidence', 'A cement mixer', 'C', 5, 7),\n" +
                "(710, 'The lights have been blown – by the strong wind', 'Out', 'Away', 'Up', 'Off', 'A', 5, 7),\n" +
                "(711, 'Maiden speech means-', 'Late speech', 'Early speech', 'Final speech', 'First speech', 'D', 5, 7),\n" +
                "(712, 'Out and out means-', 'Not at all', 'Brave', 'Thoroughtly', 'Whole heartedly', 'C', 5, 7),\n" +
                "(713, 'He divided the money --the two children.', 'Over', 'In between', 'Among', 'Between', 'D', 5, 7),\n" +
                "(714, 'No one can -- that he is cleaver', 'Deny', 'Defy', 'Denounce', 'Discard', 'A', 5, 7),\n" +
                "(715, 'Do not make a noise while your father-', 'Is sleeping', 'Has slept', 'Asleep', 'Is being asleep', 'A', 5, 7),\n" +
                "(716, 'He gave up – football when he got married', 'Of playing', 'Playing', 'To play', 'Play', 'B', 5, 7),\n" +
                "(717, 'He has been ill – Friday last:', 'From', 'On', 'In', 'Since', 'D', 5, 7),\n" +
                "(718, 'ঢাকায় বাংলার রাজধানী স্থাপনের সময় মোগল সুবেদার কে ছিলেন?', 'ইসলাম খান', 'ইব্রাহিম খান', 'শায়েস্তা খান', 'মীর জুমলা', 'A', 5, 7),\n" +
                "(719, 'শিক্ষা বিভাগের ট্রেনিংয়ের শীর্ষ প্রতিষ্ঠান কোনটি?', 'বিয়াম', 'নায়েম', 'টিটিসি', 'ইউজিসি', 'B', 5, 7),\n" +
                "(720, 'সাবাস বাংলাদেশ'' ভাস্কর্যটির শিল্পী কে?', 'হামিদুজ্জামান', 'নিতুন কুন্ডু', 'মৃনাল হক', 'শামীম শিকদার', 'B', 5, 7),\n" +
                "(721, 'সুর্যদীঘল বাড়ি'' চলচ্চিত্রের পরিচালক কে?', 'শেখ নিয়ামত শাকের', 'জহির রায়হান', 'সুভাস দত্ত', 'খান আতা', 'A', 5, 7),\n" +
                "(722, 'স্টক শেয়ারে প্রবতিত নতুন পদ্ধতি কোনটি?', 'ডিভিডেন্ড', 'ডিভ্যালু', 'ডিম্যাট', 'ডিসকাউন্ট', 'B', 5, 7),\n" +
                "(723, 'বাংলাদেশের চিনি শিল্পের ট্রেনিং ইনষ্টিটিউট কোথায় অবস্থিত?', 'দিনাজপুর', 'রংপুর', 'ইশ্বরদী', 'যশোর', 'C', 5, 7),\n" +
                "(724, 'মানবাধিকার দিবস পালিত হয় কবে?', '২৬ জুন', '১ আগষ্ট', '১ মে', '১০ ডিসেম্বর', 'D', 5, 7),\n" +
                "(725, 'শহীদ চান্দু স্টেডিয়াম কোন শহরে অবস্থিত?', 'রাজশাহী', 'বগুড়া', 'কুমিল্লা', 'চট্টগ্রাম', 'B', 5, 7),\n" +
                "(726, 'বাংলা একাডেমির প্রথম মহাপরিচালক কে ছিলেন?', 'প্রফেসর আব্দুল হাই', 'ড. মুহাম্মদ শহিদুল্লাহ', 'কাজী মোতাহার হোসেন', 'মাজাহারুল ইসলাম', 'D', 5, 7),\n" +
                "(727, 'বাংলাদেশের সর্ববৃহৎ ঈদের জামাত কোথায় হয়ে থাকে?', 'বায়তুল মোকারম-ঢাকা', 'শাহ মখদুম মসজিদ-রাজশাহী', 'জাতীয় ঈদগাহ-ঢাকা', 'শোলাকিয়া-কিশোরগঞ্জ', 'D', 5, 7),\n" +
                "(728, 'বাংলাদেশের GDP তে কৃষিখাতের অবদান কত?', '৭০ শতাংশ', '৭৩ শতাংশ', '৭৫ শতাংশ', '২১.৭৭ শতাংশ', 'D', 5, 7),\n" +
                "(729, 'দক্ষিন তালপট্টি দীপ কোন নদীর মোহনায় অবস্থিত?', 'রূপসা', 'বালেশ্বর', 'হাড়িয়াভাঙ্গা', 'ভৈরব', 'C', 5, 7),\n" +
                "(730, 'বাংলাদেশে মোট আবাদযোগ্য জমির পরিমান কত?', '২ কোটি ৪০ লাখ একর', '২ কোটি ৫০ লাখ একর', '২ কোটি ২৫ লাখ একর', '২ কোটি একর', 'A', 5, 7),\n" +
                "(731, 'বাংলার নববর্ষ পহেলা বৈশাখ চালু করেছিলেন?', 'ফখরুদ্দিন মুবারক শাহ', 'ইলিয়াস শাহ', 'সম্রাট আকবর', 'সম্রাট বাবর', 'C', 5, 7),\n" +
                "(732, 'কান্তজীর মন্দির'' কোন জেলায় অবস্থিত?', 'জয়পুর হাট', 'কুমিল্লা', 'দিনাজপুর', 'রাঙ্গামাটি', 'C', 5, 7),\n" +
                "(733, 'মহাখালী ফ্লাইওভারে কয়টি স্প্যান আছে?', '১৭ টি', '১৮ টি', '১৯ টি', '২১ টি', 'C', 5, 7),\n" +
                "(734, 'চলতি আর্থিক বাজেটে কৃষিতে ভুতুর্কি কত টাকা ধরা হয়েছে?', '৩০০ কোটি টাকা', '৪০০ কোটি টাকা', '৫০০ কোটি টাকা', '৬০০ কোটি টাকা', 'D', 5, 7),\n" +
                "(735, 'বাংলাদেশের সীমান্তবতী কোন জেলার সাথে ভারতের কোন সংযোগ নেই?', 'বান্দরবন', 'চাপাইনবাবগঞ্জ', 'পঞ্চগড়', 'দিনাজপুর', 'A', 5, 7),\n" +
                "(736, 'বাংলাদেশে একমাত্র মৎস গবেষনা ইনষ্টিটিউট কোথায় অবস্থিত?', 'রাজশাহী', 'ঢাকা', 'চট্টগ্রাম', 'চাঁদপুর', 'D', 5, 7),\n" +
                "(737, 'বাংলাদেশের একমাত্র পাহাড়ি দ্বীপ কোনটি?', 'সেন্ট মার্টিন', 'মহেশখালী', 'ছেড়া দ্বীপ', 'নিঝুম', 'B', 5, 7),\n" +
                "(738, 'বাংলাদেশে সর্বপ্রথম ডিজিটাল টেলিফোন ব্যবস্থা কবে চালু হয়?', '৪ জানুয়ারী ১৯৯০', '৩ ফেব্রুয়ারী ১৯৯০', '৩ মার্চ ১৯৯০', '৪ জানুয়ারী ১৯৯১', 'A', 5, 7),\n" +
                "(739, 'সংবিধানের কোন অনুচ্ছেদ অনুযায়ী বাংলাদেশের নাগরিকগন বাংলাদেশী বলে পরিচিত হবেন?', '৬(১)', '৬(২)', '৭', '৮', 'B', 5, 7),\n" +
                "(740, 'বাংলাদেশ OIC-এর সদস্য হয় কত সালে?', '১৯৭৩', '১৯৭৪', '১৯৭৫', '১৯৭৬', 'B', 5, 7),\n" +
                "(741, 'কতজন ব্যক্তি নিয়ে গ্রাম সরকার গঠিত?', '৯ জন', '১১ জন', '১৩ জন', '১৫ জন', 'D', 5, 7),\n" +
                "(742, 'মুক্তিযুদ্ধ বিষয়ক মন্ত্রনালায় কোন সালে গঠিত হয়?', '১৯৯২ সালে', '২০০১ সালে', '২০০২ সালে', '২০০০ সালে', 'B', 5, 7),\n" +
                "(743, 'চর্চাপদ আবিস্কৃত হয় কোথা থেকে?', 'বাকুড়ার এক গৃহস্থলির গোয়াল ঘর থেকে', 'আরাকান রাজগ্রন্থ থেকে', 'নেপালের রাজগ্রন্থশালা থেকে', 'সূদুর চীন দেশ থেকে', 'C', 5, 8),\n" +
                "(744, 'মঙ্গল যুগের সর্বশেষ কবির নাম কি?', 'বিজয়গুপ্ত', 'ভারতচন্দ্ররায়গুণাকর', 'মুকুন্দরাম চক্রবর্তি', 'কানাহরি দত্ত', 'B', 5, 8),\n" +
                "(745, 'বিদ্যাপতি কোথাকার কবি ছিলেন?', 'নবদ্বীপের', 'মিথিলার', 'বৃন্দবনের', 'বর্ধমানের', 'B', 5, 8),\n" +
                "(746, 'শ্রীকৃষ্ণ কাব্যর বড়াই কোন ধরনের চরিত্র?', 'শ্রী রাধার ননদিনী', 'শ্রী রাধার শাশুড়ি', 'রাধাকৃষ্ণের প্রেমের দূতি', 'জনৈক গোপবালা', 'C', 5, 8),\n" +
                "(747, 'লোকসাহিত্য কাকে বলে?', 'গ্রামীন নরনারীর প্রনয় সংবলিত উপাখ্যানকে', 'লোকের মুখে মুখে প্রচলিত কাহিনী গান ছড়া ইত্যাদিকে', 'গ্রামীন অশিক্ষিত ত্ত অখ্যাত লোকের সৃষ্ট রচনাকে', 'বাংলা সাহিত্য কখন গদ্যের সুচনা হয়?', 'B', 5, 8),\n" +
                "(748, 'বাংলা সাহিত্য কখন গদ্যের সুচনা হয়?', 'নবম শতকে', 'ত্রয়োদশ শতকে', 'ষোড়শ শতকে', 'উনিশ শতকে', 'D', 5, 8),\n" +
                "(749, 'বাংলা ভাষায় প্রথম সাময়িকপত্র কোনটি?', 'দিক দর্শন', 'সংবাদ প্রভাকর', 'তত্তবোধিনী', 'বঙ্গদর্শন', 'A', 5, 8),\n" +
                "(750, 'ইয়ং বেঙ্গল কি?', 'বাংলাভাষা শিক্ষার্থী ইংরেজ', 'ইংরেজি ভাবধারাপুষ্ট বাঙালী যুবক', 'একটি সাহ্যিতক গোস্ঠির নাম', 'একটি সাময়িক পত্রের নাম', 'B', 5, 8),\n" +
                "(751, 'দীনবন্ধু মিত্রের প্রহসন কোনটি?', 'বুড়ো শালিকের গাড়ে রো', 'বিয়ে পাগলা বুড়ো', 'কিঞ্চিত জলযোগ', 'জলযোগ', 'B', 5, 8),\n" +
                "(752, 'মীর মোশারফ হোসেনের নাটক কোনটি?', 'নটির পুজা', 'বেহুলা গীতাভিনয়', 'নবীন তপস্বীনি', 'কৃঞ্চকুমারি', 'B', 5, 8),\n" +
                "(753, 'কোলকাতায় প্রথম রঙ্গমঞ্চ তৈরি হয় কত সালে?', '১৮১৭ সালে', '১৮৩২ সালে', '১৮৫২ সালে', '১৭৫৩ সালে', 'D', 5, 8),\n" +
                "(754, 'রবীন্দ্রনাথ ঠাকুরের অতিপ্রাকৃত গল্প কোনটি?', 'একরাত্রি', 'নষ্ঠনীড়', 'ক্ষুধিত পাষাণ', 'ক্ষুধিত', 'C', 5, 8),\n" +
                "(755, 'বাংলা সাহিত্যর প্রথম মুসলিম ঔপন্যাসিকের নাম কি?', 'মোতাহার হোসেন', 'ইসমাইল হোসেন সিরাজি', 'মীর মোশাররফ হোসেন', 'ফররুখ আহমেদ', 'C', 5, 8),\n" +
                "(756, 'নজরুল ইসলামের সম্পাদিত পত্রিকা কোনটি?', 'মাহে নত্ত', 'সত্তগাত', 'ধূমকেতু', 'কালিকলম', 'C', 5, 8),\n" +
                "(757, 'সাত সাগরের মাঝি'' কাব্যগ্রন্থের রচয়িতা কে?', 'কাজী নজরুল ইসলাম', 'ফররুখ আহমেদ', 'আব্দুল কাদির', 'বন্দে আলি মিয়া', 'B', 5, 8),\n" +
                "(758, 'বাংলাদেশের ভাষা আন্দোলনভিত্তিক উপন্যাস কোনটি?', 'অগ্নীসাক্ষী', 'আরেফ ফাল্গুন', 'চিলেকোঠার সেপাই', 'অনেক সুর্যের আশা', 'B', 5, 8),\n" +
                "(759, 'মুক্তিযুদ্ধভিত্তিক উপন্যাস কোনটি?', 'শঙ্খনীল কারাগার', 'কাটাতারে প্রজাপতি', 'জাহান্নাম হতে বিদায়', 'আর্তনাদ', 'C', 5, 8),\n" +
                "(760, 'শত্তকত ত্তসমান কোন উপন্যাসের জন্য আদমজি পুরস্কার লাভ করেন?', 'বনি আদম', 'জননী', 'চৌরসন্ধি', 'ক্রিতদাসের হাসি', 'D', 5, 8),\n" +
                "(761, 'উপরোধ'' শব্দের অর্থ কি?', 'প্রতিরোধ', 'উপস্থাপন', 'অনুরোধ', 'উপযোগি', 'C', 5, 8),\n" +
                "(762, 'Dhaka is becoming one of the------cities in asia', 'More busy', 'Busy', 'Busiest', 'Most busiest', 'C', 5, 8),\n" +
                "(763, 'He had written the book before he------', 'Retired', 'Had retired', 'Has retired', 'Will be retired', 'A', 5, 8),\n" +
                "(764, 'Rizvi requested rini------- telephone to attend the meeting', 'Over', 'Through', 'With', 'By', 'A', 5, 8),\n" +
                "(765, 'The word ''precedence'' means-', 'Example', 'Priority', 'Elderly', 'Case', 'B', 5, 8),\n" +
                "(766, 'The prices of the rice are ---', 'Raising', 'Risen', 'Rising', 'Raised', 'C', 5, 8),\n" +
                "(767, 'To get along with'' means-', 'To adjust', 'To accompany', 'To interest', 'To walk', 'A', 5, 8),\n" +
                "(768, 'If winter comes, can spring be far behind?'' the lines were written by', 'Keats', 'Frost', 'Eliot', 'Shelley', 'D', 5, 8),\n" +
                "(769, 'The verb of the word ''short'' is---', 'Enshort', 'Shorten', 'Shorted', 'Shorting', 'B', 5, 8),\n" +
                "(770, '''Light'' is to ''dark'' as ''cold'' is to--', 'Hot', 'Heat', 'Cool', 'winter', 'A', 5, 8),\n" +
                "(771, 'Many prefer donating money-----distributing clothes', 'Than', 'But', 'To', 'Without', 'C', 5, 8),\n" +
                "(772, 'Julia has been ill ---- three months', 'Since', 'About', 'In', 'For', 'D', 5, 8),\n" +
                "(773, 'We were waiting (for the bus )The braket part is--', 'A noun phrase', 'An infinitive phrase', 'A prepositional phrase', 'A verb phrase', 'A', 5, 8),\n" +
                "(774, 'The word ''disinterested'' means-', 'Lack of interest', 'Indifferent', 'Callous', 'Neutral', 'D', 5, 8),\n" +
                "(775, 'Who did write first English dictionary?', 'Boswell', 'Ben jonson', 'Samual jonson', 'Milton', 'C', 5, 8),\n" +
                "(776, 'New program will be----next in Bangladesh television', 'Telecast', 'Published', 'Telecasted', 'Broadcasted', 'A', 5, 8),\n" +
                "(777, 'The word ''electorate'' means—', 'Electron office', 'A body of voters', 'Many electrons', 'Candidates', 'B', 5, 8),\n" +
                "(778, '''Animal Farm'' was written by –', 'George orwell', 'Stevension', 'Swift', 'Mark tawin', 'A', 5, 8),\n" +
                "(779, 'There is no alternative -----training.', 'To', 'For', 'Than', 'Of', 'A', 5, 8),\n" +
                "(780, 'Which sentence is correct?', 'This is an unique case', 'This is a unique case', 'This is a very unique case', 'This is the most unique case', 'B', 5, 8),\n" +
                "(781, 'I can not --- to pay such high prices', 'Able', 'But', 'Try', 'Afford', 'D', 5, 8),\n" +
                "(782, 'কোন গোস্ঠি থেকে বাঙ্গালি জাতির প্রধান অংশ গড়ে উঠেছিল?', 'নেগ্রিটো', 'ভোটচীন', 'দ্রাবির', 'অস্ট্রিক', 'D', 5, 8),\n" +
                "(783, 'ঢাকায় সর্বপ্রথম কবে বাংলার রাজধানি স্থাপিত হয়?', '১২০৬ খ্রিস্টাব্দে', '১৩১০ খ্রিস্টাব্দে', '১৬১০ খ্রিস্টাব্দে', '১৫২৬ খ্রিস্টাব্দে', 'C', 5, 8),\n" +
                "(784, 'ঐতিহাসিক ২১-দফা দাবির প্রথম দাবিটি কি ছিল?', 'বাংলাকে অন্যতম রাষ্ট্রভাষা', 'প্রাদেশিক স্বায়ত্বশাসন', 'পূর্ববাংলার অর্থনৈতিক বৈষম্য দুরিকরন', 'বিনা ক্ষতিপুরনে জমিদারি উচ্ছেদ ', 'A', 5, 8),\n" +
                "(785, 'অপরাজেয় বাংলা কবে উদ্বোধন করা হয়', '১৬ ডিসেম্বর ১৯৭৯', '২৬ শে ডিসেম্বর ১৯৭৯', '১ জানুয়ারি ১৯৮০', '২১ শে ফেব্রুয়ারি ১৯৮০', 'A', 5, 8),\n" +
                "(786, 'জাতীয় সৃতিসৌধের উচ্চতা কত?', '৪৫.৬ মি.', '৪৬ মি.', '৪৫.৫ মি.', '৪৫ মি.', 'A', 5, 8),\n" +
                "(787, 'হাজংনদের অধিবাস কোথায়?', 'ময়মনসিংহ ত্ত নেত্রকোনা', 'কক্সবাজার ত্ত রামু', 'রংপুর ত্ত দিনাজপুর', 'সিলেট ত্ত মনিপুর', 'A', 5, 8),\n" +
                "(788, 'নিঝুম দ্বীপের আয়তর কত?', '৮০ ব.মা.', '৮২ ব.মা.', '৮৫ ব.মা.', '৯০ ব.মা.', 'B', 5, 8),\n" +
                "(789, 'বাংলাদেশের গ্রামের সংখ্যা কত?', '৮৫৪৫০ টি', '৮৪৫০০ টি', '৮৫৫০০ টি', '৮৩৯০০ টি', 'C', 5, 8),\n" +
                "(790, 'বাংলাদেশে প্রথম জাতিয় সংসদ নির্বাচন হয় কবে?', '৭ মার্চ ১৯৭৩', '৫ মার্চ ১৯৭৩', '৬ এপ্রিল ১৯৭৩', '১৯ এপ্রিল ১৯৭৩', 'A', 5, 8),\n" +
                "(791, 'বাংলাদেশের সবচেয়ে ছোট ইউনিয়ন কোনটি?', 'সেন্টমার্টিন', 'লালপুর', 'হিলি', 'লালমোহন', 'A', 5, 8),\n" +
                "(792, 'যুক্তরাস্ট্রের সিনেটের মোট আসন সংখ্যা কত?', '৯৯', '১০০', '১০১', '১০২', 'B', 5, 8),\n" +
                "(793, 'ফেয়ার ফ্যাক্স কি?', 'সংবাদ সংস্থা', 'পরিবেশ সংস্থা', 'গোয়েন্দা সংস্থা', 'মানবাধিকার সংস্থা', 'C', 5, 8),\n" +
                "(794, 'NASA –এর সদর দপ্তর কোথায়?', 'ফ্লোরিডা', 'হিউস্টন', 'কেপ কেনেডি', 'টেকসাস', 'A', 5, 8),\n" +
                "(795, 'দক্ষিন আফ্রিকা কত বছর শেতাঙ্গ শাসনে ছিল?', '৩০০ বছর', '৩৩৫ বছর', '৩৪২ বছর', '৫০০ বছর', 'C', 5, 8),\n" +
                "(796, 'বসনিয়ায় যুদ্ধবিরতি স্বাক্ষরর মধ্যস্থতাকারী কে?', 'বিল ক্লিনটন', 'জিমি কার্টার', 'নিক্সন', 'রিগান', 'A', 5, 8),\n" +
                "(797, 'ফ্রান্সের বর্তমান প্রেসিডেন্টের নাম কি?', 'নিকোলাস সার্কোজি', 'জ্যাক শিরাক', 'ফ্রাসিয়ে মিতেরা', 'জেনারেল দ্য গল', 'A', 5, 8),\n" +
                "(798, 'হোয়াংহো নদীর শুরু স্থল কোথায়?', 'হিমালয়', 'কুয়েনলুন পর্বত', 'ব্ল্যক ফরেস্ট', 'আলপস', 'B', 5, 8),\n" +
                "(799, 'মেক্সিকো ত্ত যুক্তরাস্ট্র বিভক্তকারি সীমারেখা কোনটি?', 'সনেরা লাইন', 'ম্যাকনামারা লাইন', 'ডুরাল্ড লাইন', 'হিন্টারবার্গ লাইন', 'A', 5, 8);";
        sql[4]=preSql+ "(800, 'ইউরোপের ককপিট বলা হয় কোন দেশকে?', 'বেলজিয়াম', 'ফ্রান্স', 'জার্মানি', 'ফিনল্যান্ড', 'A', 5, 8),\n" +
                "(801, 'বিশ্বের কোন দেশের স্বাক্ষরতার হার ১০০%', 'পোল্যান্ড', 'লিথুনিয়া', 'কাজাকিস্থান', 'স্লোভাকিয়া', 'D', 5, 8),\n" +
                "(802, 'রেফ্রিজারেটরের কমপ্রেসরের কাজ কি?', 'ফ্রেয়নকে ঘনিভূত করা', 'ফ্রেয়নকে বাস্পে পরিনত করা', 'ফ্রেয়নকে সংকুচিত করে এর তাপ ত্ত তাপমাত্রা বৃদ্ধি করা ', 'ফ্রেয়নকে ঠান্ডা করা', 'A', 5, 8),\n" +
                "(803, 'এক গ্রাম পানির তাপমাত্রা ২০ থেকে ৩০ degree সেলসিয়াসে বৃদ্ধির জন্য কত তাপ প্রয়োজন?', '১০ ক্যালরি', '২ ক্যালরি', '৩ ক্যালরি', '৪ ক্যালরি', 'A', 5, 8),\n" +
                "(804, 'কোন শব্দ শোনার পরে কত সেকেন্ড পর্যন্ত এর রেশ আমাদের মস্তিকে থাকে?', '১ সেকেন্ড', '০.১ সেকেন্ড', '০.০১ সেকেন্ড', '০.০০১ সেকেন্ড', 'B', 5, 8),\n" +
                "(805, 'টেপ রেকর্ডার এবং কম্পিউটারের স্মৃতির ফিতায় কি ধরনের চুম্বক ব্যবহার হয়?', 'স্থায়ী চুম্বক', 'অস্থায়ী চুম্বক', 'সংকর চুম্বক', 'প্রাকৃতিক চুম্বক', 'A', 5, 8),\n" +
                "(806, 'টেলিভিশনে রংঙ্গিন ছবি তৈরি করার জন্য কয়টি মৌলিক রং এর ছবি ব্যবহার করা হয়?', '১ টি', '২ টি', '৩ টি', '৪ টি', 'C', 5, 8),\n" +
                "(807, 'পৃথিবিতে কখন ল্যপটপ কম্পিউটার প্রবর্তিত হয় এবং কোন কোম্পানি এটা তৈরি করে?', 'কমপ্যাক ১৯৮৫', 'এসপন ১৯৮১', 'আইবিএম ১৯৮৩', 'অ্যাপল ১৯৭৭', 'B', 5, 8),\n" +
                "(808, 'যে যন্ত্রের সাহায্যে পরিবর্তী উচ্চ বিভবকে নিম্ন এবং নিম্ন বিভবকে উচ্চ বিভবে রুপান্তরিত করা হয়?', 'ট্রান্সফরমার', 'মোটর', 'জেনারেটর', 'ডায়নামো', 'A', 5, 8),\n" +
                "(809, 'বিদ্যুত বিলের হিসাব কিভাবে করা হয়?', 'ত্তয়াট আত্তয়ারে', 'ত্তয়াটে', 'ভোল্টে', 'কিলোত্তয়াট ঘন্টায়', 'D', 5, 8),\n" +
                "(810, 'কোনটি পানিতে দ্রভিভুত হয় না?', 'গ্লিসারিন', 'ফিটকিরি', 'সোডিয়াম ক্লোরাইড', 'ক্যালসিয়াম কার্বনেট', 'D', 5, 8),\n" +
                "(811, 'পারমানবিক চুল্লিতে তাপ পরিবাহক হিসাবে কোন ধাতু ব্যবহার করা হয়?', 'সোডিয়াম', 'পটাশিয়াম', 'ম্যগনেসিয়াম', 'কোনটিই নহে', 'A', 5, 8),\n" +
                "(812, 'চা পাতায় কোন ভিটামিন থাকে?', 'ভিটামিন-ই', 'ভিটামিন-কে', 'ভিটামিন-বি কমপ্লেক্স', 'ভিটামিন-এ', 'C', 5, 8),\n" +
                "(813, 'উদ্ভিদের পাতা হলুদ হয়ে যায় কিসের অভাবে?', 'নাইট্রোজেনের', 'ফসফরাসের', 'ইউরিয়ার', 'পটাসিয়ামের', 'A', 5, 8),\n" +
                "(814, 'মানুষের স্পাইনাল কর্ডের দৈর্ঘ্য কত?', '১৫ ইঞ্চি(প্রায়)', '১৭ ইঞ্চি(প্রায়)', '১৮ ইঞ্চি(প্রায়)', '২০ ইঞ্চি(প্রায়)', 'C', 5, 8),\n" +
                "(815, 'ক্যান্সার রোগের কারন কি?', 'কোষের অস্বাভাবিক মৃত্যু', 'কোষের অস্বাভাবিক বৃদ্ধি', 'কোষের অস্বাভাবিক জমাট বাধা', 'কোষের অস্বাভাবিক জমাট বাধা', 'B', 5, 8),\n" +
                "(816, 'ইনসুলিন নি:সৃত হয় কোথা থেকে?', 'অগ্ন্যশয় হতে', 'প্যানক্রিয়াস হতে', 'লিভার হতে', 'পিটুইটারি গ্ল্যান্ড হতে', 'B', 5, 7),\n" +
                "(817, 'সুষম খাদ্যের উপাদন কয়টি?', '৪ টি', '৫ টি', '৬ টি', '৮ টি', 'C', 5, 8),\n" +
                "(818, 'জীব জগতের জন্য সবচেয়ে ক্ষতিকর রশ্মি কোনটি?', 'আলট্রা ভায়োলেট রশ্মি', 'বিটা রশ্মি', 'আলফা রশ্মি', 'গামা রশ্মি', 'A', 5, 8),\n" +
                "(819, 'জনসংখ্যা বৃদ্ধির ফলে ব্যাপকভাবে ক্ষতিগ্রস্থ হচ্ছে কি?', 'প্রাকৃতিক পরিবেশ', 'সামাজিক পরিবেশ', 'বায়বীয় পরিবেশ', 'সাংস্কৃতিক পরিবেশ', 'A', 5, 8),\n" +
                "(820, 'কোথায় দিন-রাত্রি সর্বত্র সমান?', 'মেরু অঞ্চলে', 'নিরক্ষরেথায়', 'উত্তর গোলার্ধে', 'দক্ষিন গোলার্ধে', 'B', 5, 8),\n" +
                "(821, 'ছায়াপথ তার নিজ অক্ষকে কেন্দ্র ঘুরে আসতে যে সময় লাগে তাকে কি বলে?', 'সৌর বছর', 'কসমিক ইয়ার', 'আলোক বর্ষ', 'পলিসার', 'B', 5, 8),\n" +
                "(822, 'A rocket flying to the moon does not need wings because—', 'It has no engine', 'Space has to much dust', 'It has no fuel', 'Space is airless', 'D', 5, 8),\n" +
                "(823, 'Rubber is notable for its—', 'Lightness', 'Heaviness', 'Elasticity', 'Viscosity', 'C', 5, 8),\n" +
                "(824, 'Julias Caesar was the ruler of rome about—', '1000 years ago', '1500 years ago', '2000 years ago', '3000 years ago', 'C', 5, 8),\n" +
                "(825, 'The south pole is located in the—', 'Arctic', 'Antarctic', 'Antipodes', 'Occident', 'B', 5, 8),\n" +
                "(826, 'Tiger:Zoology::March:', 'Astrology', 'Cryptology', 'Astronomy', 'Telescopy', 'C', 5, 8),\n" +
                "(827, 'Break:repain::would:', 'Heat', 'Hurt', 'Fix', 'Plaster', 'D', 5, 8),\n" +
                "(828, 'Frightened:Screm::Angry:', 'Cry', 'Shiver', 'Shout', 'Sheer', 'C', 5, 8),\n" +
                "(829, 'He___consciousness as a result of his head hitting the car’s dashboard', 'Failed', 'Broke', 'Lost', 'Passed', 'C', 5, 8),\n" +
                "(830, 'Only after I_____home, did I remember my doctor’s appointment.', 'Going', 'Go', 'Went', 'Gone', 'C', 5, 8),\n" +
                "(831, 'When they had their first child, they put ----a large sum for his education.', 'Aside', 'Beside', 'Outside', 'Under', 'A', 5, 8),\n" +
                "(832, 'If you count 1 to 100, how many 5s will you pass on the way?', '10', '11', '18', '20', 'D', 5, 8),\n" +
                "(833, 'A farmer had 17 hens all but 9 nine died. How many live hens were left?', '3', '4', '9', '16', 'C', 5, 8),\n" +
                "(834, 'If two typists can type two pages in the two minutes how many typists will it take to type 18 pages in six minutes', '3', '6', '9', '18', 'B', 5, 8),\n" +
                "(835, 'The fifth constant from beginning of this sentence is the letter----', 'i', 'e', 'a', 't', 'D', 5, 8),\n" +
                "(836, 'If the second day of the month is a Monday , the eighteenth day of the month is a ----', 'Sunday', 'Tuesday', 'Wednesday', 'Monday', 'C', 5, 8),\n" +
                "(837, 'Two men, starting at the same point, walk in opposite directions for 4 meters, turn left and walk another 3 meters. What is the distance between them?', '7 meters', '14 meters', '10 meters', '6 meters', 'C', 5, 8),\n" +
                "(838, '30% of 10 is 10% of which?', '30', '60', '500', '600', 'A', 5, 8),\n" +
                "(839, 'Rahim is 12 years old. He is three times older than karim. What will be the age of rahim when he is two times older than karim?', '15 years', '16 years', '17 years', '17 years', 'B', 5, 8),\n" +
                "(840, 'Divide 30 by half and add 10. What do you get?', '25', '45', '55', '70', 'D', 5, 8),\n" +
                "(841, 'If a man swims 4 miters upstream at 1 mph and back downstream to the same point at 4 mph, what is his average speed?', '0.8 mph', '1.6 mph', '2.4 mph', '3.2 mph', 'B', 5, 8),\n" +
                "(842, 'বাংলা বর্নমালায় স্বরবর্ন কয়টি', '১৩ টি', '১০ টি', '১২ টি', '১১ টি', 'D', 5, 9),\n" +
                "(843, 'বাংলা সাহিত্যর আদি কবি কে', 'কাহপা', 'চেগুনপা', 'লুইপা', 'ভূসুকুপা', 'C', 5, 9),\n" +
                "(844, 'ততসম শব্দের ব্যবহার কোন রীতিতে বেশী', 'চলিত রীতি', 'সাধু রীতি', 'মিশ্র রীতি', 'আঞ্চলিক রীতি', 'B', 5, 9),\n" +
                "(845, 'বাংলা ভাষায় প্রথম ব্যাকরন রচনা করেন কে', 'অক্ষয় দত্ত', 'মার্স ম্যান', 'ব্রাসি হেলহেড', 'রাজা রামমোহন', 'D', 5, 9),\n" +
                "(846, 'ফররুখ আহমেদের শ্রেষ্ঠ কাব্যগ্রন্থের নাম কি', 'সাত সাগরের মাঝি', 'পাখির বাসা', 'হাতেমতাই', 'নৌফেল ত্ত হাতেম', 'A', 5, 9),\n" +
                "(847, 'প্রাচিনতম বাঙ্গালি মুসলমান কে', 'আলাত্তল', 'সৈয়দ সুলতান', 'মুহম্মদ খান', 'শাহ মুহম্মদ সগীর', 'D', 5, 9),\n" +
                "(848, 'চাচা কাহিনীর লেখক কে', 'সৈয়দ শামসুল হক', 'শত্তকত ত্তসমান', 'সৈয়দ মুজতবা আলি', 'ফররুখ আহমেদ', 'C', 5, 9),\n" +
                "(849, 'মুসলমান নারী জাগরনের কবি কে', 'ফজিলাতুন্নাছা', 'ফয়জুন্নেছা', 'বেগম রোকেয়া', 'সামসুন্নাহার', 'C', 5, 9),\n" +
                "(850, 'বাংলা কথ্য ভাষার আদি গ্রন্থ কোনটি', 'প্রভু যিশুর বাণী', 'কৃপার শাস্ত্রের অর্থবেদ', 'ফুলমনি ত্ত করুনার বিবরন', 'মিশনারি জীবন', 'B', 5, 9),\n" +
                "(851, 'কবি আলাত্তলের জন্মস্থান কোনটি', 'ফরিদপুরের সুরেশ্বর', 'চট্রগ্রামের জোবরা', 'বার্মার আরাকান', 'চট্রগ্রামের পটিয়া', 'B', 5, 9),\n" +
                "(852, 'অনল প্রবাহ রচনা করেন', 'সৈয়দ ইসমাইল সিরাজি', 'মোজাম্মেল হক', 'এয়াকুব আলি চৌধুরী', 'মুনিরুজ্জামান ইসলামাবাদি', 'A', 5, 8),\n" +
                "(853, 'অগ্নিবাণী কাব্যের প্রথম কবিতা কোনটি', 'ধূমকেতু', 'বিদ্রোহী', 'প্রলয়োল্লাস', 'অগ্রপথিক', 'C', 5, 9),\n" +
                "(854, 'বাংলা সাহিত্য কথ্যরীতির প্রচলনে কোন পত্রিকার অবদান বেশী', 'কল্লোল', 'সবুজপত্র', 'বঙ্গদর্শন', 'কালিকলম', 'B', 5, 9),\n" +
                "(855, 'জনৈক শব্দটির সন্ধিবিচ্ছেদ', 'জন+ইক', 'জন+এক', 'জনৈ+এক', 'জন+ঈক', 'B', 5, 9),\n" +
                "(856, 'বাক্যের তিনটি গুন কি কি', 'আকাংখা-আসক্তি-বিধেয়', 'আকাংখা-আসক্তি-যোগ্যতা', 'আকাংখা-উদ্দেশ্য-বিধেয়', 'কোনটিই নহে', 'B', 5, 9),\n" +
                "(857, 'একাত্তরের চিটি কোন জাতিয় রচনা', 'মুক্তিযুদ্দের বিবরন', 'মুক্তিযুদ্ধভিক্তিক উপন্যাস', 'মুক্তিযোদ্ধাদের পত্রসংকলন', 'ভিন্নধর্মী ডায়েরী', 'C', 5, 9),\n" +
                "(858, 'বাংলা একাডেমি কোন বছর প্রতিস্টিত হয়', '১৯৫৫ খ্রি.', '১৩৫৫ বঙ্গাব্দ', '১৯৫২ খ্রি.', '১৩৫২ বঙ্গাব্দ', 'A', 5, 9),\n" +
                "(859, 'সনেট কবিতার প্রবর্তক কে', 'দ্বিজেন্দ্র লাল রায়', 'রজনীকান্ত সেনদ', 'মাইকেল মধুসুধন দত্ত', 'অতুল প্রসাধ সেনদ', 'C', 5, 9),\n" +
                "(860, 'সমাস ভাষাকে কি করে', 'সংক্ষেপ করে', 'বিস্তৃত করে', 'অর্থপুর্ন করে', 'অর্থের রুপান্তর ঘটায়', 'A', 5, 9),\n" +
                "(861, 'I have not heard from him---', 'Long since', 'For a long time', 'Since long', 'For long', 'D', 5, 9),\n" +
                "(862, 'Honey is----sweet', 'Very', 'Too much', 'Much too', 'Excessive', 'C', 5, 9),\n" +
                "(863, 'Your conduct admits-----no excuse', 'to', 'for', 'of', 'at', 'C', 5, 9),\n" +
                "(864, 'He had a ------headache', 'Strong', 'Acute', 'Serious', 'Bad', 'D', 5, 9),\n" +
                "(865, 'I shall not------the examination this year', 'Give', 'Appear at', 'Sit', 'Go for', 'B', 5, 9),\n" +
                "(866, 'They travelled to savar----', 'On foot', 'By walking', 'On their feet', 'By foot', 'A', 5, 9),\n" +
                "(867, 'He said that he --------- be unable come', 'will', 'shall', 'should', 'would', 'D', 5, 7),\n" +
                "(868, 'Neither rini nor simi ------qualified for the job', 'Are', 'is', 'Were', 'had', 'B', 5, 9),\n" +
                "(869, 'He said that he------the previous day', 'Has come', 'Had come', 'come', 'arrived', 'B', 5, 9),\n" +
                "(870, 'He watched the boat-----down their river', 'To floot', 'Floating', 'Was floating', 'Had floated', 'B', 5, 9),\n" +
                "(871, '''Sky'' is to ''bird'' as ''water'' is to----', 'Feather', 'Fish', 'Boat', 'Lotus', 'B', 5, 9),\n" +
                "(872, 'Good is bad as white is to----', 'Dark', 'Black', 'Grey', 'Ebony', 'B', 5, 9),\n" +
                "(873, 'Botany is plants as Zoology is to------', 'Flowers', 'Trees', 'Dear', 'Animals', 'D', 5, 9),\n" +
                "(874, 'The bad news struck him like a bolt from the------', 'Sky', 'Heavens', 'Firmament', 'Blue', 'D', 5, 9),\n" +
                "(875, 'When one is Pragmatic he is being--------', 'Wasteful', 'Productive', 'Practical', 'Fussy', 'C', 5, 9),\n" +
                "(876, 'Into the-----of death rode the six hundred', 'City', 'Tunnel', 'Road', 'Valley', 'D', 5, 9),\n" +
                "(877, 'To be or not to be that is the-------', 'Meaning', 'Question', 'Answer', 'Issue', 'B', 5, 9),\n" +
                "(878, '\"I have a ----that one day this nation will live out the truee meaning of its creed that all men are created equal\"', 'desire', 'hope', 'dream', 'wish', 'C', 5, 9),\n" +
                "(879, 'Who wrote the famous novels ''David copperfield'' and ''The tale of two cities''?', 'Thomas hardy', 'Jane austen', 'Geroge eliot', 'Charles dickens', 'D', 5, 9),\n" +
                "(880, 'Who wrote the plays ''The tempest'' and ''The mid summer night''s dream''?', 'Ben jonson', 'Cristoper Marlowe', 'Jhon Dryden', 'William Shakespeare', 'D', 5, 9),\n" +
                "(881, 'ঢাকা বিশ্ববিদ্যালয় কত সালে প্রতিষ্টিত হয়েছে', '১৯১১ সালে', '১৯২১ সালে', '১৯৩১ সালে', '১৯৪১ সালে', 'B', 5, 9),\n" +
                "(882, 'বাংলাদেশে কয়টি সরকারি বিশ্ববিদ্যালয় রয়েছে', '১৪ টি', '২৪ টি', '৩৪ টি', '৫০ টি', 'C', 5, 9),\n" +
                "(883, 'বঙ্গভঙ্গের সময় ভারতের গভর্নর কে ছিলেন', 'লর্ড কার্জন', 'লর্ড ত্তয়েলেসলি', 'লর্ড ডালহৌসি', 'লর্ড মাউন্টব্যাটেন', 'A', 5, 9),\n" +
                "(884, 'বাংলাদেশের ক্ষুদ্রতম ইউনিয়ন কোনটি', 'সেন্টমার্টিন', 'সাতগ্রামদ', 'মুজিবনগর', 'চৌদ্দগ্রাম', 'A', 5, 9),\n" +
                "(885, 'আইএলত্ত এর সদর দপ্তর কোথায়', 'লন্ডন', 'জেনেভা', 'নিউইয়র্ক', 'দিল্লী', 'B', 5, 9),\n" +
                "(886, 'এসকাপের সদর দপ্তর কোথায়', 'ব্যাংকক', 'সিঙ্গাপুর', 'দিল্লী', 'কলম্বো', 'A', 5, 9),\n" +
                "(887, 'ইউরোপীয় ইউনিয়নের সদর দপ্তর কোথায়', 'লন্ডন', 'ব্রাসেলস্', 'বন', 'প্যারিস', 'B', 5, 9),\n" +
                "(888, 'বাংলাদেশকে প্রথম স্বীকৃতিদানকারী দেশ কোনটি', 'ভারত', 'শ্রীলংকা', 'মায়ানমার', 'রাশিয়া', 'A', 5, 9),\n" +
                "(889, 'বাংলাদেশের প্রথম রাস্ট্রপতির নাম কি', 'সৈয়দ নজরুল ইসলাম', 'তাজউদ্দিন আহমেদ', 'শেখ মুজিবর রহমান', 'ক্যাপ্টেন মনসুর আলি', 'C', 5, 9),\n" +
                "(890, 'সুলতানি আমলে বাংলার রাজধানির নাম কি', 'সোনাগাঁ', 'জাহাঙ্গীরনগর', 'ঢাকা', 'গৌড়', 'D', 5, 9),\n" +
                "(891, 'বাংলাদেশের মুক্তিযুদ্ধের প্রধান সেনাপতি কে ছিলেন', 'শেখ মুজিবর রহমান', 'জেনারেল আতাউল গণি ত্তসমানি', 'তাজউদ্দিন আহমেদ', 'ক্যাপ্টেন মনসুর আলি', 'B', 5, 9),\n" +
                "(892, 'পার্বত্য চট্রগ্রামে কয়টি জেলা আছে', '৩ টি', '৫ টি', '৭ টি', '৯ টি', 'A', 5, 9),\n" +
                "(893, 'East London কোথায় অবস্তিত', 'ইংল্যান্ডে', 'জার্মানিতে', 'আমেরিকায়', 'দক্ষিন আফ্রিকায়', 'D', 5, 9),\n" +
                "(894, 'ব্রিটিশ ভারতের শেষ ভাইসরয় কে ছিলেন', 'লর্ড কার্জন', 'লর্ড মাউন্টব্যাটেন', 'লর্ড বেন্টিঙ্ক', 'লর্ড ত্তয়াভেল', 'B', 5, 9),\n" +
                "(895, 'মুক্তিযুদ্ধের সময় বাংলাদেশকে কয়টি সেক্টরে ভাগ করা হয়েছিল', '৪ টি', '৭ টি', '১১ টি', '১৪ টি', 'C', 5, 9),\n" +
                "(896, 'মার্কিন যুক্তরাষ্ট্রের বর্তমান পররাষ্ট্রমন্ত্রির নাম কি', 'জর্জ বুশ', 'হিলারি ক্লিনটন', 'রবার্ট গেইট', 'কন্ডালিসা রাইস', 'B', 5, 9),\n" +
                "(897, 'ভারতের বর্তমান প্রধানমন্ত্রির নাম কি', 'সোনিয়া গান্ধি', 'ড. মনমোহন সিং', 'মমতা ব্যানার্জি', 'রাহুল গান্ধি', 'B', 5, 9),\n" +
                "(898, 'জাতিসংঘের সদর দপতর কোথায়', 'লন্ডন', 'নিউইয়র্ক', 'প্যারিস', 'মস্কো', 'B', 5, 9),\n" +
                "(899, 'সার্কের সচিবালয় কোথায় অবস্থিত', 'দিল্লী', 'ইসলামাবাদ', 'কাঠমুন্ডু', 'ঢাকা', 'C', 5, 9),\n" +
                "(900, 'টেকনাফ কোন নদীর তীরে অবস্থিত', 'পদ্না', 'যমুনা', 'নাফ', 'কর্ণফুলি', 'C', 5, 9),\n" +
                "(901, 'কম্পিউটারের স্থায়ী সৃতিশক্তিকে কি বলে', 'RAM', 'ROM', 'হার্ডত্তয়্যার', 'সফটত্তয়্যার', 'B', 5, 9),\n" +
                "(902, 'সবচেয়ে শক্তিশালি সৌর চুল্লি তৈরি করা হয়েছে কোন দেশে', 'যুক্তরাষ্ট্র', 'ভারত', 'নেপাল', 'জাপান', 'A', 5, 9),\n" +
                "(903, 'ফটোইলেকট্রিক কোষের উপর আলো পড়লে কি তৈরি হয়', 'বিদুৎ', 'তাপ', 'চুম্বক', 'কিছুই না', 'A', 5, 9),\n" +
                "(904, 'যে সকল নিউক্লিয়াসের নিউট্রন সংখ্যা সমান কিন্তূ ভর সংখ্যা সমান না তাদেরকে কি বলে', 'আইসোটোপ', 'আইসোটোন', 'আইসোমার', 'আইসোবার', 'B', 5, 9),\n" +
                "(905, 'চাঁদ দিগন্তের কাছে অনেক বড় দেখায় কেন', 'বায়ুমন্ডলীয় প্রতিসরনে', 'আলোর বিচ্ছুরনে', 'অপাবর্তনে', 'দৃষ্টিভ্রমে', 'A', 5, 9),\n" +
                "(906, 'লাল আলোতে নীল রংয়ের বস্তু তেমন দেখায়', 'বেগুনি', 'সবুজ', 'হলুদ', 'কালো', 'D', 5, 9),\n" +
                "(907, 'বৈদুতিক ভাল্বের ফিলামেন্ট কি ধাতু দিয়ে তৈরি', 'সংকর ধাতু', 'সীসা', 'টাংস্টেন', 'তামা', 'C', 5, 9),\n" +
                "(908, 'জারন বিক্রিয়ায় কি ঘটে', 'ইলেকট্রন গ্রহন', 'ইলেকট্রন আদানপ্রদান', 'ইলেকট্রন বর্জন', 'শুধু তাপ তৈরি হয়', 'C', 5, 9),\n" +
                "(909, 'নিচের কোনটি ক্ষারকীয় পদার্থ', 'P4O10', 'Mgo', 'Co', 'Zno', 'B', 5, 9),\n" +
                "(910, 'কোন ধাতু পানি অপেক্ষা হালকা', 'ম্যগনেসিয়াম', 'ক্যালসিয়াম', 'সোডিয়াম', 'পটাসিয়াম', 'C', 5, 9),\n" +
                "(911, 'পারমানবিক চুল্লিতে তাপ পরিবাহক হিসাবে কোন ধাতু ব্যবহার হয়', 'সোডিয়াম', 'পটাসিয়াম', 'ম্যাগনেসিয়াম', 'জিংক', 'A', 5, 9),\n" +
                "(912, 'সুষম খাদ্যর উপাদান কয়টি', '৪ টি', '৫ টি', '৬ টি', '৮ টি', 'C', 5, 9),\n" +
                "(913, 'কোন বিজ্ঞানি রোগ জিবানু তত্ত্ব আবিস্কার করেন', 'ডারউইন', 'লুইপাস্তুর', 'প্র্রিস্টলি', 'ল্যাভয়েসিয়ে', 'B', 5, 9),\n" +
                "(914, 'গ্রীন হাউজে গাছ লাগানো হয় কেন?', 'উষ্ণতা থেকে রক্ষার জন্য', 'অত্যাধিক ঠান্ডা থেকে রক্ষার জন্য', 'আলো থেকে রক্ষার জন্য', 'ঝড় বৃষ্টি থেকে রক্ষার জন্য', 'B', 5, 9),\n" +
                "(915, 'পৃথিবির প্রথম বানিজ্যক যোগাযোগ কৃতিম উপগ্রহ কোনটি', 'আলিবার্ড হল', 'এস্ট্রোলার হল', 'ত্তবেরি হল', 'কসমস', 'A', 5, 9),\n" +
                "(916, 'সূর্য পৃষ্টের উত্তাপ কত?', '৬০০০ ডিগ্রী সেন্টিগ্রেড', '৮০০০ ডিগ্রী সেন্টিগ্রেড', '১০০০০ ডিগ্রী সেন্টিগ্রেড', '১২০০০ ডিগ্রী সেন্টিগ্রেড', 'A', 5, 9),\n" +
                "(917, 'জোয়ারের কত সময় পর ভাটার সৃষ্টিৃ হয়', '৬ ঘন্টা ১৩ মিনিট', '৮ ঘন্টা', '১২ ঘন্টা', '১৩ ঘন্টা ১৫ মিনিট', 'A', 5, 9),\n" +
                "(918, 'কোনটি বায়ুর উপাদান নহে', 'নাইট্রোজেন', 'হাইড্রোজেন', 'কার্বন', 'ফসফরাস', 'D', 5, 9),\n" +
                "(919, 'অ্যালিউমিনিয়াম সালফেট চলতি বাংলায় কি বলে', 'চুন', 'সেভিং সোপ', 'ফিটকিরি', 'কস্টিক সোডা', 'C', 5, 9),\n" +
                "(920, 'কোন কোন স্থানে সলিড ফিনাইল ব্যবহার করা হয়', 'পায়খানায় প্রসাবখানায়', 'গোসলখানায়', 'পুকুরে', 'নালায়', 'A', 5, 9),\n" +
                "(921, '১০ থেকে ৬০ পর্যন্ত যে সকল মৌলিক সংখ্যার একক স্থানীয় অংক ৯ তাদের সমষ্টি কত?', '১৪৬', '৯৯', '১০৫', '১০৭', 'D', 5, 9),\n" +
                "(922, '৪০ সংখ্যাটি A হতে ১১ কম গানিতিক আকারে প্রকাশ করলে কি হয়', 'A+১১=৪০', 'A+৪০=১১', 'A=৪০+১১', 'A=৪০+১', 'C', 5, 9),\n" +
                "(923, 'পাচ অংকের ক্ষুদ্রতম সংখ্যা চার অংকের বৃহত্তম সংখ্যর অন্তর কত?', '৯', '১০', '১', '-১', 'C', 5, 9),\n" +
                "(924, '১.১,০.০১, ত্ত ০.০০১১ এর সমষ্টি কত?', '০.০১১১১', '১.১১১১', '১১.১১০১', '১.১০১১১', 'B', 5, 9),\n" +
                "(925, '৪ টি এক টাকার নোট ত্ত ৮ টি ২ টাকার নোট একত্রে ৮ টি পাচ টাকার নোটের কত অংশ?', '১/৪', '১/২', '১/৮', '১/১৬', 'B', 5, 9),\n" +
                "(926, 'পরপর তিনটি সংখ্যর গুনফল ১২০ তাদের যোগফল কত?', '৯', '১২', '১৪', '১৫', 'D', 5, 9),\n" +
                "(927, 'Which of the following integers has the most divisors?', '88', '91', '95', '99', 'A', 5, 9),\n" +
                "(928, 'Successive discount of 20% and 15% are equal to a single discount of –', '30%', '32%', '34%', '35%', 'B', 5, 9),\n" +
                "(929, 'City B is 5 miles east of city A. City C is 10 miles southeast of city B. Which of the following is the closest to the distance from city A to city C.?', '11 miles', '12 miles', '13 miles', '14 miles', 'D', 5, 9),\n" +
                "(930, 'আবদুল্লাহ উপন্যসের রচয়িতা কে?', 'মোহাম্মদ মজিবর রহমান', 'কাজী ইমদাদুল হক', 'শেখ ফজলুল করিম', 'মমতাজ উদ্দিন আহমেদ', 'B', 5, 9),\n" +
                "(931, 'বঙ্কিমচন্দ্রের প্রথম উপন্যসের নাম—', 'দুর্গেশনন্দিনী', 'কপালকন্ডুলা', 'কৃঞ্চকান্তের উইল', 'রজনী', 'A', 5, 9),\n" +
                "(932, 'দক্ষিন তালপটি কোন নদীর মোহনায় অবস্থিত', 'নাফ', 'তেতুলিয়া', 'আড়িয়াল খা', 'হাড়িয়াভাঙ্গা', 'D', 5, 9),\n" +
                "(933, 'খাদ্য ত্ত কৃষি সংস্থার প্রধান কার্যালয় কোথায় অবস্থিত', 'নিউইয়র্কে', 'রোমে', 'জেনেভায়', 'অটোয়ায়', 'B', 5, 9),\n" +
                "(934, 'গৌড়ের সোনা মসজিদ কার আমলে নির্মিত হয়', 'ফকরুদ্দিন মোবারক শাহ', 'হোসেন শাহ', 'শায়েস্থা খা', 'ঈশা খা', 'B', 5, 9),\n" +
                "(935, 'ডেভিস কাপ কোন খেলায় দেয়া হয়', 'ব্যাডমিন্টন', 'লং টেনিস', 'টেবিল টেনিস', 'ক্রিকেট', 'B', 5, 9),\n" +
                "(936, 'পৃথিবিতে সবচেয়ে বেশী ধাতু কোনটি?', 'লোহা', 'পারদ', 'সিলিকন', 'তামা', 'A', 5, 9),\n" +
                "(937, 'অন্ধদের জন্য লিখন রীতির উদ্ভাবন করেন', 'ব্রেইল', 'কপার্নিকাস', 'ডেভিটবোর', 'টমাস আলভা এডিসন', 'A', 5, 9),\n" +
                "(938, 'পারমানবিক চুল্লিতে কোন মৌল জ্বালানি হিসাবে ব্যবহার হয়?', 'পেট্রোলিয়াম', 'ইউরেনিয়াম-২৩৫', 'অক্সিজেন', 'হাইড্রোজেন', 'B', 5, 9),\n" +
                "(939, 'বৈদুতিক হিটার এবং ইস্ত্রিতে কোন ধাতুর তার ব্যবহার করা হয়', 'তামা', 'নাইক্রোম', 'স্টেনিয়াম', 'প্লাটিনাম', 'B', 5, 9);";
        return sql;
    }
}
