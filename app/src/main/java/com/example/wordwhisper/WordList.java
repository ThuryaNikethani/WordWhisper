package com.example.wordwhisper;

import java.util.ArrayList;
import java.util.List;

// This class stores all the flashcard words in one place
public class WordList {

    // Returns the full list of unusual English words
    public static List<Word> getAllWords() {

        List<Word> words = new ArrayList<>();

        words.add(new Word(
                "Petrichor",
                "PET-ri-kor",
                "Noun",
                "The pleasant smell that comes from the earth after rain falls on dry ground.",
                "She stepped outside and breathed in the petrichor after the long summer drought finally broke.",
                "Greek: petra (stone) + ichor (fluid in the veins of gods)"
        ));

        words.add(new Word(
                "Sonder",
                "SON-der",
                "Noun",
                "The sudden realization that every stranger you pass has a life as complex and vivid as your own.",
                "Walking through the busy market, he felt a deep sonder watching the faces of people around him.",
                "Coined in modern English from German 'sonder' (special/particular)"
        ));

        words.add(new Word(
                "Hiraeth",
                "HEER-eyeth",
                "Noun",
                "A deep longing for home, a place or time that may no longer exist or never existed at all.",
                "Looking at her childhood photos, she felt a powerful hiraeth for simpler days.",
                "Welsh origin — untranslatable in most other languages"
        ));

        words.add(new Word(
                "Vellichor",
                "VEL-i-kor",
                "Noun",
                "The strange wistfulness of used bookshops, full of books you will never have time to read.",
                "She spent hours in the old bookstore, lost in vellichor among dust-covered shelves.",
                "Modern coined word, inspired by the smell and feeling of old books"
        ));

        words.add(new Word(
                "Ephemeral",
                "eh-FEM-er-al",
                "Adjective",
                "Lasting for a very short time; quickly passing away.",
                "The cherry blossoms are ephemeral — here for a week, then gone until next spring.",
                "Greek: ephemeros (lasting only a day)"
        ));

        words.add(new Word(
                "Syzygy",
                "SIZ-ih-jee",
                "Noun",
                "The alignment of three celestial bodies in a straight line, such as the sun, earth, and moon.",
                "During the syzygy of the sun, earth, and moon, the tides were unusually powerful.",
                "Greek: syzygos (yoked together)"
        ));

        words.add(new Word(
                "Limerence",
                "LIM-er-ence",
                "Noun",
                "An involuntary state of intense longing and infatuation with another person.",
                "He could not focus on work; his limerence for her made every other thought fade away.",
                "Coined by psychologist Dorothy Tennov in 1979"
        ));

        words.add(new Word(
                "Sempiternal",
                "sem-pih-TER-nal",
                "Adjective",
                "Everlasting; existing or continuing throughout all time without end.",
                "The philosopher wrote about the sempiternal nature of mathematical truths.",
                "Latin: semper (always) + aeternus (eternal)"
        ));

        words.add(new Word(
                "Noctilucent",
                "nok-tih-LOO-sent",
                "Adjective",
                "Shining or glowing in the dark; used especially to describe rare high-altitude clouds.",
                "The noctilucent clouds glowed with an eerie blue light long after the sun had set.",
                "Latin: nox (night) + lucere (to shine)"
        ));

        words.add(new Word(
                "Apricity",
                "ah-PRIS-ih-tee",
                "Noun",
                "The warmth of the sun felt on a cold winter day.",
                "She sat on the bench and enjoyed the apricity, despite the frost still covering the grass.",
                "Latin: apricus (warmed by the sun) — rarely used since the 1600s"
        ));

        words.add(new Word(
                "Psithurism",
                "SITH-yoo-rizm",
                "Noun",
                "The soft sound of wind rustling through leaves in trees.",
                "He fell asleep on the hillside, lulled by the gentle psithurism of the forest around him.",
                "Greek: psithuros (whispering)"
        ));

        words.add(new Word(
                "Phosphene",
                "FOS-feen",
                "Noun",
                "The swirling colors or shapes of light you see when you press on your closed eyelids.",
                "As a child she would press her palms against her eyes just to watch the phosphenes dance.",
                "Greek: phos (light) + phainein (to show)"
        ));

        words.add(new Word(
                "Kenopsia",
                "keh-NOP-see-ah",
                "Noun",
                "The eerie feeling of being in a place that is usually full of people but is now empty.",
                "Walking through the school after hours gave him a strong sense of kenopsia.",
                "Greek: kenos (empty) + opsis (vision/sight)"
        ));

        words.add(new Word(
                "Oblivion",
                "oh-BLIV-ee-on",
                "Noun",
                "The state of being completely forgotten by the world, or of being completely unaware.",
                "Without anyone to remember him, the old inventor slowly faded into oblivion.",
                "Latin: oblivisci (to forget)"
        ));

        words.add(new Word(
                "Mellifluous",
                "meh-LIF-loo-us",
                "Adjective",
                "Sweet or musical; pleasant to hear, flowing smoothly like honey.",
                "Her mellifluous voice could calm a restless crowd within moments.",
                "Latin: mel (honey) + fluere (to flow)"
        ));

        words.add(new Word(
                "Tenebrism",
                "TEN-eh-brizm",
                "Noun",
                "A style of painting that uses extreme contrast between dark and light areas.",
                "Caravaggio's use of tenebrism gave his paintings a dramatic, almost theatrical quality.",
                "Latin: tenebrae (darkness)"
        ));

        words.add(new Word(
                "Lucubrate",
                "LOO-kyoo-brayt",
                "Verb",
                "To study or write by lamplight; to work hard at writing or studying, especially at night.",
                "He would lucubrate until dawn, filling notebook after notebook with his thoughts.",
                "Latin: lucubrare (to work by candlelight)"
        ));

        words.add(new Word(
                "Quiddity",
                "KWID-ih-tee",
                "Noun",
                "The essential nature or quality of something; what makes a thing exactly what it is.",
                "The artist spent years trying to capture the quiddity of her hometown in a single painting.",
                "Latin: quidditas (whatness), from quid (what)"
        ));

        words.add(new Word(
                "Susurrus",
                "soo-SUR-us",
                "Noun",
                "A soft murmuring or whispering sound, like the hum of voices or the wind.",
                "A susurrus spread through the audience as the curtain slowly began to rise.",
                "Latin: susurrare (to whisper or hum)"
        ));

        words.add(new Word(
                "Crepuscular",
                "kreh-PUS-kyoo-lar",
                "Adjective",
                "Relating to twilight; most active during the dim light of dawn and dusk.",
                "Deer are crepuscular animals, most often seen grazing at sunrise and sunset.",
                "Latin: crepusculum (twilight)"
        ));

        words.add(new Word(
                "Pandiculation",
                "pan-dik-yoo-LAY-shun",
                "Noun",
                "The act of stretching and yawning at the same time, especially after waking up.",
                "After ten hours of sleep, her pandiculation was so dramatic it made the cat jump.",
                "Latin: pandiculari (to stretch oneself)"
        ));

        words.add(new Word(
                "Eldritch",
                "EL-drich",
                "Adjective",
                "Strange and frightening; uncanny or eerie in a way that feels supernatural.",
                "An eldritch screech echoed through the fog, stopping every traveler in their tracks.",
                "Old English origin — possibly from 'elf' + 'realm'"
        ));

        words.add(new Word(
                "Fulgent",
                "FUL-jent",
                "Adjective",
                "Shining brilliantly; dazzlingly bright.",
                "The fulgent sunrise painted the entire valley in shades of gold and amber.",
                "Latin: fulgere (to shine)"
        ));

        words.add(new Word(
                "Soporific",
                "sop-oh-RIF-ik",
                "Adjective",
                "Causing or tending to cause sleep; also used to describe something dull and boring.",
                "The professor's soporific lecture caused half the class to drift off within minutes.",
                "Latin: sopor (deep sleep) + facere (to make)"
        ));

        words.add(new Word(
                "Palimpsest",
                "PAL-imp-sest",
                "Noun",
                "A manuscript where old writing has been scraped off and written over, but traces remain; also used to describe anything layered with history.",
                "The old city was a palimpsest — every street held layers of different eras beneath it.",
                "Greek: palin (again) + psestos (scraped)"
        ));

        words.add(new Word(
                "Vespertine",
                "VES-per-teen",
                "Adjective",
                "Of, relating to, or happening in the evening.",
                "She developed a vespertine habit of walking along the canal just before dark.",
                "Latin: vesper (evening)"
        ));

        words.add(new Word(
                "Lambent",
                "LAM-bent",
                "Adjective",
                "Softly bright or radiant; flickering gently over a surface.",
                "The lambent firelight made the old cabin feel warm and safe against the storm outside.",
                "Latin: lambere (to lick)"
        ));

        words.add(new Word(
                "Numinous",
                "NOO-mih-nus",
                "Adjective",
                "Having a strong spiritual or mysterious quality; evoking a sense of the divine.",
                "Standing inside the ancient cathedral, she felt a numinous presence she could not explain.",
                "Latin: numen (divine power or spirit)"
        ));

        words.add(new Word(
                "Lacuna",
                "la-KYOO-nah",
                "Noun",
                "A gap, missing part, or empty space in something — a book, knowledge, or argument.",
                "Scholars noted a significant lacuna in the historical record between 1200 and 1240.",
                "Latin: lacuna (pit, hole, pool)"
        ));

        words.add(new Word(
                "Diaphanous",
                "dy-AF-ah-nus",
                "Adjective",
                "Light, delicate, and translucent; so thin you can almost see through it.",
                "Her diaphanous scarf floated behind her as she walked into the evening breeze.",
                "Greek: diaphanes (transparent)"
        ));

        words.add(new Word(
                "Ululation",
                "yoo-loo-LAY-shun",
                "Noun",
                "A long, wavering, high-pitched cry made as an expression of grief or celebration.",
                "The ululation of the mourners rose above the valley and echoed against the hills.",
                "Latin: ululare (to howl)"
        ));

        words.add(new Word(
                "Stygian",
                "STIJ-ee-an",
                "Adjective",
                "Extremely dark, gloomy, or forbidding; relating to the river Styx in the underworld.",
                "The miners descended into the stygian depths of the old shaft with only headlamps to guide them.",
                "Greek: Styx, the river of the underworld in mythology"
        ));

        words.add(new Word(
                "Halcyon",
                "HAL-see-on",
                "Adjective",
                "Denoting a period of time in the past that was happy, golden, and peaceful.",
                "He often spoke of his halcyon childhood summers spent fishing by the lake.",
                "Greek: halcyon (a mythical bird said to calm the sea)"
        ));

        words.add(new Word(
                "Fugacious",
                "fyoo-GAY-shus",
                "Adjective",
                "Tending to disappear quickly; fleeting and transitory.",
                "Youth is fugacious — blink and the easy laughter of childhood is already far behind you.",
                "Latin: fugax (fleeing), from fugere (to flee)"
        ));

        words.add(new Word(
                "Lethologica",
                "leth-oh-LOJ-ih-kah",
                "Noun",
                "The inability to recall a word you know well; a word being stuck on the tip of your tongue.",
                "He suffered a moment of lethologica mid-sentence, knowing the word but unable to retrieve it.",
                "Greek: lethe (forgetfulness) + logos (word)"
        ));

        words.add(new Word(
                "Sylvan",
                "SIL-van",
                "Adjective",
                "Relating to or characteristic of the forest or woodland; pleasantly rural and wooded.",
                "They built their cottage in a sylvan clearing surrounded by ancient oak trees.",
                "Latin: silva (forest)"
        ));

        words.add(new Word(
                "Coruscate",
                "KOR-us-kayt",
                "Verb",
                "To flash or sparkle; to emit vivid flashes of light.",
                "The crystal chandelier coruscated under the ballroom lights, scattering rainbows on the walls.",
                "Latin: coruscare (to flash, to vibrate)"
        ));

        return words;
    }
}
