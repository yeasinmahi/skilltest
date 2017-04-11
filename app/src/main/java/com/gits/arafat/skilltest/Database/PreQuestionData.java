package com.gits.arafat.skilltest.Database;

/**
 * Created by Arafat on 11/04/2017.
 */

public class PreQuestionData {
    private String preSql="INSERT INTO `question` (`id`, `question`, `optionA`, `optionB`, `optionC`, `optionD`, `correctAns`, `categoryId`, `subCategoryId`) VALUES ";
    public String[] getQuestionInsertText(){
        String[] sql={};
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
                "(27, 'A boy is 4 years old and his sister is three times as old as he is. When the boy is 12 years old, how old will his sister be?', '19', '30', '20', 'Impossible to determine', 'C', 1, 0),\n" +
                "(28, 'What number is one half of one quarter of one tenth of 800?', '20', '10', '15', '12', 'B', 1, 0),\n" +
                "(29, 'Which one of the four choices makes the best comparison? LIVED is to DEVIL as 6323 is to:', '3236', '6332', '2363', '3263', 'A', 1, 0),\n" +
                "(30, 'John likes 400 but not 300; he likes 100 but not 99; he likes 2500 but not 2400. Which does he like?', '1800', '200', '900', '600', 'C', 1, 0),\n" +
                "(31, 'NASA received three messages in a strange language from a distant planet. The scientists studied the messages and found that \"Necor Buldon Slock\" means \"Danger Rocket Explosion\" and \"Edwan Mynor Necor\" means \"Danger Spaceship Fire\" and \"Buldon Gimilzor Gondor\" means \"Bad Gas Explosion\". What does \"Slock\" mean?', 'Explosion', 'Danger', 'Gas', 'Rocket', 'D', 1, 0),\n" +
                "(32, 'A farmer had 17 sheep. All but 8 died. How many live sheep were left?', '9', '8', '17', '10', 'B', 1, 0),\n" +
                "(33, 'Who was the first man on the moon?', 'Lance Armstrong', 'George Washington', 'Neil Armstrong', ' My mom', 'C', 2, 0),\n" +
                "(34, 'What year was NASA founded?', '1958', '1968', '2009', '2003', 'A', 2, 0),\n" +
                "(35, 'How many continents are there on Earth?', '20', '7', '50', 'over 100', 'B', 2, 0),\n" +
                "(36, 'You are participating in a race. You''ve just passed the second person. What position are you now in?', '1st', '2nd', '3rd', '4th', 'B', 1, 0),\n" +
                "(37, 'Who was the first Prime minister of Bangladesh?', 'Syed Nazrul Islam', 'Tajuddin Ahmed', 'Sheikh Mujibur Rahman', 'Arshad', 'B', 2, 0),\n" +
                "(38, 'There are ___ divisions in Bangladesh.', '6', '7', '8', '9', 'B', 2, 0),\n" +
                "(39, 'What part of speech is \"ultramundane\", meaning \"pertaining to supernatural things or to another life\"?', 'Adjective', 'verb', 'noun', 'adverb', 'A', 3, 0),\n" +
                "(40, 'What part of speech is \"umbrage\", meaning \"a sense of injury\"?', 'adjective', 'verb', 'adverb', 'noun', 'D', 3, 0),\n" +
                "(41, 'What part of speech is \"unanimous\", meaning \"sharing the same views or sentiments\"?', 'adjective', 'verd', 'adverb', 'noun', 'A', 3, 0),\n" +
                "(42, 'What part of speech is \"unbearable\", meaning \"unendurable\"?', 'adjective', 'verb', 'adverb', 'noun', 'A', 3, 0),\n" +
                "(43, 'What part of speech is \"unconscious\", meaning \"not cognizant of objects, actions, etc\"?', 'verb', 'adjective', 'noun', 'adverb', 'B', 3, 0),\n" +
                "(44, 'A', 'exiles', 'immigrants', 'emigrants ', 'entrants', 'B', 3, 0),\n" +
                "(45, 'Tell your brother to come........because it?s going rain in a minute or two.', 'indoors ', 'outdoors ', 'within', 'homewards', 'A', 3, 0),\n" +
                "(46, 'The use of plastics for shoes.........of leather has ruined shoe repairing as a business.', 'although ', 'as well ', 'instead ', 'outside', 'C', 3, 0),\n" +
                "(47, 'Where do you........going for your holidays this year?', 'intend ', 'guess', 'expect   ', 'pretend  ', 'A', 3, 0),\n" +
                "(48, 'I?m sorry I?m late, I was held up in a traffic........', 'block ', 'group', 'jam ', 'crush ', 'C', 3, 0),\n" +
                "(49, 'He hit the other boxer so hard that he broke his lower.......', 'chin ', 'shoulder ', 'wrist ', ' jaw', 'D', 3, 0),\n" +
                "(50, 'Her mother had asked her to do several.........before she went out .', ' labours  ', 'works ', 'travels ', 'jobs', 'D', 3, 0);";


        sql[1]=preSql+"(51, 'When he makes a.......by car, he takes his family with him.', 'course ', 'voyage ', 'passage', 'journey', 'D', 3, 0),\n" +
                "(52, 'I can?t advise you what to do: you must use your own.......', 'guesswork', 'justice', 'judgement ', 'ideal', 'C', 3, 0),\n" +
                "(53, 'Because of the poor harvest, wheat prices have........in the last six months.', 'added ', 'jumped ', 'amounted ', 'gathered', 'B', 3, 0),\n" +
                "(54, 'You couldn?t any secrets even for an hour in that llttle town.', ' keep   ', 'get', 'learn ', 'hear', 'A', 3, 0),\n" +
                "(55, 'The police had to.......the crow   .', 'keep ? to   ', 'keep ? under ', 'keep ? back ', 'keep ? on', 'C', 3, 0),\n" +
                "(56, 'I should like to........touch with old friends but I have so little time.', 'be out of  ', 'be in ', 'keep in', 'lose', 'C', 3, 0),\n" +
                "(57, 'Shut the window and.......the cold ........', ' keep ? in  ', 'keep ? out', 'keep ? down  ', 'keep ? behind', 'B', 3, 0),\n" +
                "(58, 'You can........your shorthand ability by taking notes in shorthand during lectures.', ' keep on ', 'keep in', 'keep up ', 'keep back', 'C', 3, 0),\n" +
                "(59, 'The room was so quiet that she could hear the..........of her heart.', 'beating ', 'striking', 'knocking', 'tapping ', 'A', 3, 0),\n" +
                "(60, 'I cannot undo the........in this piece of string.', ' bunch', 'lock', 'knot ', ' tie', 'C', 3, 0),\n" +
                "(61, '............of money prevented us from taking a holiday this year.', 'Limit   ', 'Emptiness ', ' Freeze ', 'Lack', 'D', 3, 0),\n" +
                "(62, 'It was the longest film I?ve ever seen; it........four hours.', 'ended ', 'stayed', ' lasted', 'finished ', 'C', 3, 0),\n" +
                "(63, 'It is time to.......the table for dinner.', 'place ', 'lay', 'lay out', ' put out', 'B', 3, 0),\n" +
                "(64, 'After driving for five hours, the driver pulled into.......for a rest.', ' a bypass ', 'a flyover ', 'a lay-by', 'a roundabout', 'C', 3, 0),\n" +
                "(65, 'The guide is.........a line of tourists through the narrow passage with the help of his torch.', 'conducting  ', 'bringing  ', 'leading ', 'guiding', 'C', 3, 0),\n" +
                "(66, 'She tried to.........out of the window to see the procession more clearly.', 'bend ', 'bow ', 'curve ', 'lean', 'D', 3, 0),\n" +
                "(67, 'She came to England for a year in order to the language.', 'know ', 'become  ', 'refresh ', 'learn', 'D', 3, 0),\n" +
                "(68, 'I?m sorry but what he thinks is not of the.........importance to me.', 'merest   ', 'lowest   ', 'worst   ', 'least', 'D', 3, 0),\n" +
                "(69, 'The children played in the park while their mother..........', 'looked at', 'looked on', 'looked over', 'looked round', 'B', 3, 0),\n" +
                "(70, 'The police must now.........escaped convict in the surrounding counties.', ' search  ', 'look for', 'look after', 'investigate', 'B', 3, 0),\n" +
                "(71, 'As he had no friends or relatives in the town, the traveller tried to find a.........somewhere.', ' lodge  ', 'landing   ', 'lodging   ', 'stay', 'C', 3, 0),\n" +
                "(72, 'There is a 20 minute parking.........here, so we must get back to the car very quickly.', ' freedom', 'limit', 'allowance', 'ability', 'D', 3, 0),\n" +
                "(73, 'A long line of traffic had to wait at the..........until the train had passed.', ' drawbridge ', 'level crossing', 'junction', 'subway', 'B', 3, 0),\n" +
                "(74, 'You should have your eyes tested every year in case the.........of your spectacles need changing.', ' glasses ', 'panes ', ' lenses ', 'prisms', 'C', 3, 0),\n" +
                "(75, 'He offered to..........her a hand as the suitcase was too heavy for her to carry.', 'lend  ', 'show', 'loan   ', 'borrow', 'A', 3, 0),\n" +
                "(76, 'Peter begged his neighbor to.........him five pounds until the weekend.', ' lend ', 'supply', 'provide', 'hiver', 'A', 3, 0),\n" +
                "(78, 'If the boy had the dog alone it wouldn?t have bitten him.', ' set ', 'left   ', 'put   ', 'had', 'B', 3, 0),\n" +
                "(79, 'Are you going to attend Dr Barker?s........on ?Brain Electronics? tomorrow?', 'conference  ', 'lecture ', 'meeting   ', 'discussion', 'B', 3, 0),\n" +
                "(80, 'She looked everywhere for her book but.........had to return home without it.', 'lastly ', 'at the end', 'in the end', 'at the last', 'C', 3, 0),\n" +
                "(81, 'The businessman proved to be an apparently well-behaved........middle-aged man.', ' offensive ', 'unoffending', 'inoffensive   ', 'innocent', 'C', 3, 0),\n" +
                "(82, 'The local tourist bureau will send you.........about hotels in the area.', ' knowledge', 'information', 'news', 'notice', 'B', 3, 0),\n" +
                "(83, 'Sally married..........the Kennedy family.', ' with ', 'to', 'into   ', 'among', 'C', 3, 0),\n" +
                "(84, 'The boy?s allergy to dust caused his skin to........', ' itch ', 'rub ', 'blemish', 'flush', 'A', 3, 0),\n" +
                "(85, 'He has always gone.........strange hobbies like collecting bottle-tops and inventing secret codes.', ' into', 'by   ', 'in for', 'through', 'C', 3, 0),\n" +
                "(86, 'Violent programmers on television may have a bad........on children.', 'affection   B. C. D.  ', 'pressure   ', 'influence   ', 'control', 'C', 3, 0),\n" +
                "(87, 'Tell your brother to come........because it?s going rain in a minute or two.', ' indoors', 'outdoors ', 'within   ', 'homewards', 'A', 3, 0),\n" +
                "(88, 'We paid the shopkeeper.........cash.', 'in   ', 'with', 'by   ', 'on   ', 'A', 3, 0),\n" +
                "(89, 'The judge said that he was...........by the high standards of performance by the riders.', 'excited ', 'impressed ', 'interested', 'imposed', 'B', 3, 0),\n" +
                "(90, 'You can.........my surprise when I heard the news.', 'suppose ', 'think  ', 'imagine   ', 'believe', 'C', 3, 0),\n" +
                "(91, 'HTML is what type of language ? ', 'Scripting Language ', 'Programming Language', 'Markup Language', 'Network Protoco', 'C', 4, 0),\n" +
                "(92, 'Fundamental HTML Block is known as', 'HTML Body ', ' HTML Tag', 'HTML Attribute', 'HTML Element', 'B', 4, 0),\n" +
                "(93, 'Apart from <b> tag, what other tag makes text bold ? ', '<fat>', '<strong>', ' <emp>', '<black>', 'B', 4, 0),\n" +
                "(94, 'What is the full form of HTML?', 'HyperText Markup Language ', 'Hyper Tech Markup Language', ' Hyper Teach Markup Language', 'None of these', 'A', 4, 0),\n" +
                "(95, 'What should be the first tag in any HTML document? ', '<head>', '<title>', '<html>', '<document>', 'C', 4, 0),\n" +
                "(96, 'Which HTML tag produces the biggest heading? ', '<h4>', '<h5>', '<h1>', '<h6>', 'C', 4, 0),\n" +
                "(97, 'Which of the following is not a browser ? ', 'Microsofts Bing ', 'Netscape Navigator', 'Mozilla Firefox', 'Opera', 'A', 4, 0),\n" +
                "(98, 'HTML uses ', 'User defined tags', 'Fixed tags defined by the language', 'Pre-specified tags', 'Tags only for linking', 'B', 4, 0),\n" +
                "(99, 'What does CSS stand for?', 'Colorful Style Sheets      ', 'Creative Style Sheets', 'Computer Style Sheets', 'Cascading Style Sheets', 'D', 4, 0),\n" +
                "(100, 'Which HTML tag is used to define an internal style sheet?', ' <css>   ', '<script> ', '<style>', 'none', 'C', 4, 0);";
        return sql;
    }
}
