package nahu.curso.infobrawl.data

import android.util.Log
import com.google.gson.Gson
import kotlinx.coroutines.delay

class BrawlTestDataSource : IBrawlApiDataSource{

    override suspend fun getPlayer(search: String): Player{
        //delay(5000)

        val gson = Gson()
        val playerResult = gson.fromJson(json, Player::class.java)
        Log.d("GSONDATA", playerResult.toString())
        return playerResult
    }

    override suspend fun getBattles(search: String): Battles {
        val gson = Gson()
        val battleResult = gson.fromJson(jsonBattle, Battles::class.java)
        Log.d("GSONDATA", battleResult.toString())
        return battleResult
    }


    private var json = """
       {
      "tag": "#820uugrc8",
      "name": "Mck",
      "trophies": 39121,
      "highestTrophies": 39133,
      "expLevel": 221,
      "3vs3Victories": 14455,
      "soloVictories": 489,
      "duoVictories": 884,
      "club": {
        "tag": "#92PVGUL",
        "name": "JCM"
      },
      "brawlers": [
        {
          "id": 16000000,
          "name": "SHELLY",
          "power": 10,
          "rank": 38,
          "trophies": 738,
          "highestTrophies": 743,
          "gears": [
            {
              "id": 62000000,
              "name": "SPEED"
            },
            {
              "id": 62000001,
              "name": "HEALTH"
            }
          ],
          "starPowers": [
            {
              "id": 23000076,
              "name": "SHELL SHOCK"
            },
            {
              "id": 23000135,
              "name": "BAND-AID"
            }
          ],
          "gadgets": [
            {
              "id": 23000255,
              "name": "FAST FORWARD"
            },
            {
              "id": 23000288,
              "name": "CLAY PIGEONS"
            }
          ]
        }
      ]
    }
    """.trimIndent()

    private var jsonBattle = """
        {
  "items": [
    {
      "battleTime": "20250614T184852.000Z",
      "event": {
        "id": 15000997,
        "mode": "unknown",
        "map": "Mirage Arena"
      },
      "battle": {
        "mode": "siege",
        "type": "ranked",
        "result": "defeat",
        "duration": 293,
        "starPlayer": {
          "tag": "#G8V82L88V",
          "name": "Dani_Goat🍀🍀",
          "brawler": {
            "id": 16000068,
            "name": "MAISIE",
            "power": 11,
            "trophies": 953
          }
        },
        "teams": [
          [
            {
              "tag": "#LUL9LRLU",
              "name": "Nacho_45",
              "brawler": {
                "id": 16000019,
                "name": "PENNY",
                "power": 11,
                "trophies": 801
              }
            },
            {
              "tag": "#GRRQJYQJU",
              "name": "lulu",
              "brawler": {
                "id": 16000028,
                "name": "SANDY",
                "power": 10,
                "trophies": 283
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000034,
                "name": "JACKY",
                "power": 11,
                "trophies": 595
              }
            }
          ],
          [
            {
              "tag": "#G8V82L88V",
              "name": "Dani_Goat🍀🍀",
              "brawler": {
                "id": 16000068,
                "name": "MAISIE",
                "power": 11,
                "trophies": 953
              }
            },
            {
              "tag": "#G2V2CGY88",
              "name": "☆WAZAAA☆👻👻👻",
              "brawler": {
                "id": 16000001,
                "name": "COLT",
                "power": 11,
                "trophies": 717
              }
            },
            {
              "tag": "#88G2LG0G",
              "name": "Don Ente",
              "brawler": {
                "id": 16000049,
                "name": "BUZZ",
                "power": 11,
                "trophies": 1019
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250613T141407.000Z",
      "event": {
        "id": 15000720,
        "mode": "wipeout5V5",
        "map": "Riverbank Crossing"
      },
      "battle": {
        "mode": "wipeout",
        "type": "ranked",
        "result": "victory",
        "duration": 125,
        "trophyChange": 9,
        "starPlayer": {
          "tag": "#2QCGPYQCLY",
          "name": "leeknowsaurus",
          "brawler": {
            "id": 16000065,
            "name": "MANDY",
            "power": 11,
            "trophies": 430
          }
        },
        "teams": [
          [
            {
              "tag": "#2JCVPLL2YC",
              "name": "buslv",
              "brawler": {
                "id": 16000043,
                "name": "EDGAR",
                "power": 7,
                "trophies": 222
              }
            },
            {
              "tag": "#2JPJG2CGQL",
              "name": "tabia",
              "brawler": {
                "id": 16000030,
                "name": "EMZ",
                "power": 11,
                "trophies": 489
              }
            },
            {
              "tag": "#9VLU2Y22R",
              "name": "zenaqueX",
              "brawler": {
                "id": 16000017,
                "name": "TARA",
                "power": 10,
                "trophies": 281
              }
            },
            {
              "tag": "#2PJ08LY2C8",
              "name": "KanyeWestMiPapa",
              "brawler": {
                "id": 16000047,
                "name": "SQUEAK",
                "power": 11,
                "trophies": 203
              }
            },
            {
              "tag": "#2LJCJCC8Q0",
              "name": "🧏🤫",
              "brawler": {
                "id": 16000084,
                "name": "MOE",
                "power": 8,
                "trophies": 251
              }
            }
          ],
          [
            {
              "tag": "#2QCGPYQCLY",
              "name": "leeknowsaurus",
              "brawler": {
                "id": 16000065,
                "name": "MANDY",
                "power": 11,
                "trophies": 430
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000054,
                "name": "FANG",
                "power": 11,
                "trophies": 417
              }
            },
            {
              "tag": "#2R028UPGY8",
              "name": "Joyce Anjos",
              "brawler": {
                "id": 16000014,
                "name": "BO",
                "power": 7,
                "trophies": 407
              }
            },
            {
              "tag": "#2R2C8PYYQG",
              "name": "Ezx.xzv",
              "brawler": {
                "id": 16000040,
                "name": "AMBER",
                "power": 7,
                "trophies": 432
              }
            },
            {
              "tag": "#2RU92CUYYL",
              "name": "hsjstai",
              "brawler": {
                "id": 16000043,
                "name": "EDGAR",
                "power": 11,
                "trophies": 470
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250613T141120.000Z",
      "event": {
        "id": 15000720,
        "mode": "wipeout5V5",
        "map": "Riverbank Crossing"
      },
      "battle": {
        "mode": "wipeout",
        "type": "ranked",
        "result": "victory",
        "duration": 98,
        "trophyChange": 8,
        "starPlayer": {
          "tag": "#LPJPP08PJ",
          "name": "RODRIX♡",
          "brawler": {
            "id": 16000004,
            "name": "RICO",
            "power": 11,
            "trophies": 559
          }
        },
        "teams": [
          [
            {
              "tag": "#2JLR99VC98",
              "name": "hola",
              "brawler": {
                "id": 16000043,
                "name": "EDGAR",
                "power": 11,
                "trophies": 494
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000054,
                "name": "FANG",
                "power": 11,
                "trophies": 409
              }
            },
            {
              "tag": "#LPJPP08PJ",
              "name": "RODRIX♡",
              "brawler": {
                "id": 16000004,
                "name": "RICO",
                "power": 11,
                "trophies": 559
              }
            },
            {
              "tag": "#Y0RUUPC9J",
              "name": "Elaine321",
              "brawler": {
                "id": 16000024,
                "name": "ROSA",
                "power": 11,
                "trophies": 479
              }
            },
            {
              "tag": "#Y0G9YJJP0",
              "name": "Armaghanyan 💋❤",
              "brawler": {
                "id": 16000022,
                "name": "TICK",
                "power": 10,
                "trophies": 491
              }
            }
          ],
          [
            {
              "tag": "#Y0G8CL8V8",
              "name": "고래상어",
              "brawler": {
                "id": 16000039,
                "name": "COLETTE",
                "power": 11,
                "trophies": 491
              }
            },
            {
              "tag": "#Y0RJJR8LU",
              "name": "Merlin",
              "brawler": {
                "id": 16000013,
                "name": "POCO",
                "power": 11,
                "trophies": 491
              }
            },
            {
              "tag": "#Y0R8QJYJ0",
              "name": "logan",
              "brawler": {
                "id": 16000008,
                "name": "NITA",
                "power": 11,
                "trophies": 486
              }
            },
            {
              "tag": "#Y0GYCJL8U",
              "name": "Glacial King 🜲",
              "brawler": {
                "id": 16000048,
                "name": "GROM",
                "power": 11,
                "trophies": 481
              }
            },
            {
              "tag": "#Y0R9L200G",
              "name": "визунок",
              "brawler": {
                "id": 16000043,
                "name": "EDGAR",
                "power": 11,
                "trophies": 487
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250613T140908.000Z",
      "event": {
        "id": 15000720,
        "mode": "wipeout5V5",
        "map": "Riverbank Crossing"
      },
      "battle": {
        "mode": "wipeout",
        "type": "ranked",
        "result": "defeat",
        "duration": 180,
        "trophyChange": -3,
        "starPlayer": {
          "tag": "#L0Q0CL908",
          "name": "—͟͞͞★ 𝐒ɇ𝗱ɇx ★",
          "brawler": {
            "id": 16000005,
            "name": "SPIKE",
            "power": 9,
            "trophies": 543
          }
        },
        "teams": [
          [
            {
              "tag": "#LPJPP08PJ",
              "name": "RODRIX♡",
              "brawler": {
                "id": 16000004,
                "name": "RICO",
                "power": 11,
                "trophies": 562
              }
            },
            {
              "tag": "#C09CPLV9",
              "name": "LOL3511I",
              "brawler": {
                "id": 16000029,
                "name": "BEA",
                "power": 9,
                "trophies": 505
              }
            },
            {
              "tag": "#JGQQ28VVY",
              "name": "~•minidino245🍡",
              "brawler": {
                "id": 16000065,
                "name": "MANDY",
                "power": 9,
                "trophies": 565
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000054,
                "name": "FANG",
                "power": 11,
                "trophies": 412
              }
            },
            {
              "tag": "#2L20L8LQRJ",
              "name": "Michelle._.",
              "brawler": {
                "id": 16000015,
                "name": "PIPER",
                "power": 8,
                "trophies": 439
              }
            }
          ],
          [
            {
              "tag": "#2L2GJ9RJGJ",
              "name": "IQ KREBS",
              "brawler": {
                "id": 16000029,
                "name": "BEA",
                "power": 9,
                "trophies": 577
              }
            },
            {
              "tag": "#2QJ2G92Y89",
              "name": "neyma o neyma☠️",
              "brawler": {
                "id": 16000065,
                "name": "MANDY",
                "power": 10,
                "trophies": 575
              }
            },
            {
              "tag": "#L0Q0CL908",
              "name": "—͟͞͞★ 𝐒ɇ𝗱ɇx ★",
              "brawler": {
                "id": 16000005,
                "name": "SPIKE",
                "power": 9,
                "trophies": 543
              }
            },
            {
              "tag": "#Y20PR9Y0",
              "name": "CHOCAPIC",
              "brawler": {
                "id": 16000007,
                "name": "JESSIE",
                "power": 7,
                "trophies": 407
              }
            },
            {
              "tag": "#9CPL8RQQP",
              "name": "cristo rey👑",
              "brawler": {
                "id": 16000012,
                "name": "CROW",
                "power": 10,
                "trophies": 435
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250613T140524.000Z",
      "event": {
        "id": 15000720,
        "mode": "wipeout5V5",
        "map": "Riverbank Crossing"
      },
      "battle": {
        "mode": "wipeout",
        "type": "ranked",
        "result": "defeat",
        "duration": 130,
        "trophyChange": -3,
        "starPlayer": {
          "tag": "#GC2CV98PY",
          "name": "⭐YUHXZP⭐",
          "brawler": {
            "id": 16000048,
            "name": "GROM",
            "power": 11,
            "trophies": 433
          }
        },
        "teams": [
          [
            {
              "tag": "#2RCLR9VPJ9",
              "name": "mig",
              "brawler": {
                "id": 16000010,
                "name": "EL PRIMO",
                "power": 9,
                "trophies": 444
              }
            },
            {
              "tag": "#2JQP0Q292P",
              "name": "niko el pro 😎",
              "brawler": {
                "id": 16000043,
                "name": "EDGAR",
                "power": 11,
                "trophies": 453
              }
            },
            {
              "tag": "#2QJ8RPR2P9",
              "name": "Legionário",
              "brawler": {
                "id": 16000008,
                "name": "NITA",
                "power": 5,
                "trophies": 440
              }
            },
            {
              "tag": "#GC2CV98PY",
              "name": "⭐YUHXZP⭐",
              "brawler": {
                "id": 16000048,
                "name": "GROM",
                "power": 11,
                "trophies": 433
              }
            },
            {
              "tag": "#2YV8J0CUPU",
              "name": "malumaues123",
              "brawler": {
                "id": 16000065,
                "name": "MANDY",
                "power": 11,
                "trophies": 504
              }
            }
          ],
          [
            {
              "tag": "#2LP0RQ22YR",
              "name": "mauricio",
              "brawler": {
                "id": 16000023,
                "name": "LEON",
                "power": 9,
                "trophies": 453
              }
            },
            {
              "tag": "#2GGCUGYGJR",
              "name": "SoyZael",
              "brawler": {
                "id": 16000014,
                "name": "BO",
                "power": 9,
                "trophies": 491
              }
            },
            {
              "tag": "#2L20L8LQRJ",
              "name": "Michelle._.",
              "brawler": {
                "id": 16000015,
                "name": "PIPER",
                "power": 8,
                "trophies": 442
              }
            },
            {
              "tag": "#2Q9CVGYRQR",
              "name": "Luis.H",
              "brawler": {
                "id": 16000039,
                "name": "COLETTE",
                "power": 8,
                "trophies": 431
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000054,
                "name": "FANG",
                "power": 11,
                "trophies": 415
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250613T140136.000Z",
      "event": {
        "id": 15000720,
        "mode": "wipeout5V5",
        "map": "Riverbank Crossing"
      },
      "battle": {
        "mode": "wipeout",
        "type": "ranked",
        "result": "victory",
        "duration": 171,
        "trophyChange": 10,
        "starPlayer": {
          "tag": "#2RCPJ9VVLL",
          "name": "adilson",
          "brawler": {
            "id": 16000003,
            "name": "BROCK",
            "power": 9,
            "trophies": 465
          }
        },
        "teams": [
          [
            {
              "tag": "#QCRPPRR9V",
              "name": "𝙽𝚒𝚌𝚔𝚣❄️⚡",
              "brawler": {
                "id": 16000072,
                "name": "PEARL",
                "power": 9,
                "trophies": 404
              }
            },
            {
              "tag": "#2LC8GCCPGY",
              "name": "Farofa",
              "brawler": {
                "id": 16000027,
                "name": "8-BIT",
                "power": 8,
                "trophies": 406
              }
            },
            {
              "tag": "#GJJRY2GRC",
              "name": "santi6pro",
              "brawler": {
                "id": 16000049,
                "name": "BUZZ",
                "power": 7,
                "trophies": 474
              }
            },
            {
              "tag": "#R0QVYPPU2",
              "name": "T0B14S15",
              "brawler": {
                "id": 16000012,
                "name": "CROW",
                "power": 9,
                "trophies": 406
              }
            },
            {
              "tag": "#2RCPJ9VVLL",
              "name": "adilson",
              "brawler": {
                "id": 16000003,
                "name": "BROCK",
                "power": 9,
                "trophies": 465
              }
            }
          ],
          [
            {
              "tag": "#LUUUYV22Q",
              "name": "benjita",
              "brawler": {
                "id": 16000045,
                "name": "STU",
                "power": 9,
                "trophies": 197
              }
            },
            {
              "tag": "#22Q00YRUJ2",
              "name": "antonio montana",
              "brawler": {
                "id": 16000038,
                "name": "SURGE",
                "power": 5,
                "trophies": 8
              }
            },
            {
              "tag": "#PJP8RUJGC",
              "name": "Tuekin",
              "brawler": {
                "id": 16000047,
                "name": "SQUEAK",
                "power": 9,
                "trophies": 349
              }
            },
            {
              "tag": "#YR8LYUPVC",
              "name": "skibidi toilet☠",
              "brawler": {
                "id": 16000004,
                "name": "RICO",
                "power": 11,
                "trophies": 451
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000054,
                "name": "FANG",
                "power": 11,
                "trophies": 405
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250613T135751.000Z",
      "event": {
        "id": 15000720,
        "mode": "wipeout5V5",
        "map": "Riverbank Crossing"
      },
      "battle": {
        "mode": "wipeout",
        "type": "ranked",
        "result": "victory",
        "duration": 147,
        "trophyChange": 9,
        "starPlayer": {
          "tag": "#GG0R9VL0C",
          "name": "TeAga",
          "brawler": {
            "id": 16000003,
            "name": "BROCK",
            "power": 11,
            "trophies": 314
          }
        },
        "teams": [
          [
            {
              "tag": "#9YGLPLURJ",
              "name": "AKITOZ",
              "brawler": {
                "id": 16000022,
                "name": "TICK",
                "power": 7,
                "trophies": 390
              }
            },
            {
              "tag": "#GG0R9VL0C",
              "name": "TeAga",
              "brawler": {
                "id": 16000003,
                "name": "BROCK",
                "power": 11,
                "trophies": 314
              }
            },
            {
              "tag": "#2GGRLVG29U",
              "name": "xxxmk7ak47",
              "brawler": {
                "id": 16000011,
                "name": "MORTIS",
                "power": 8,
                "trophies": 398
              }
            },
            {
              "tag": "#2Q89YQGGUP",
              "name": "nicolas",
              "brawler": {
                "id": 16000001,
                "name": "COLT",
                "power": 5,
                "trophies": 320
              }
            },
            {
              "tag": "#RY9Y9LJY9",
              "name": "Kayque",
              "brawler": {
                "id": 16000042,
                "name": "BYRON",
                "power": 8,
                "trophies": 362
              }
            }
          ],
          [
            {
              "tag": "#2LPCCVP29C",
              "name": "pipocas",
              "brawler": {
                "id": 16000063,
                "name": "CHESTER",
                "power": 8,
                "trophies": 380
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000054,
                "name": "FANG",
                "power": 11,
                "trophies": 396
              }
            },
            {
              "tag": "#2929JJQGP2",
              "name": "🥶fx-guilherme�",
              "brawler": {
                "id": 16000013,
                "name": "POCO",
                "power": 11,
                "trophies": 378
              }
            },
            {
              "tag": "#QCRPPRR9V",
              "name": "𝙽𝚒𝚌𝚔𝚣❄️⚡",
              "brawler": {
                "id": 16000072,
                "name": "PEARL",
                "power": 9,
                "trophies": 395
              }
            },
            {
              "tag": "#2J8JUPYRYC",
              "name": "miguelitof",
              "brawler": {
                "id": 16000043,
                "name": "EDGAR",
                "power": 11,
                "trophies": 370
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250613T135434.000Z",
      "event": {
        "id": 15000720,
        "mode": "wipeout5V5",
        "map": "Riverbank Crossing"
      },
      "battle": {
        "mode": "wipeout",
        "type": "ranked",
        "result": "victory",
        "duration": 88,
        "trophyChange": 8,
        "starPlayer": {
          "tag": "#820UUGRC8",
          "name": "Mck",
          "brawler": {
            "id": 16000054,
            "name": "FANG",
            "power": 11,
            "trophies": 388
          }
        },
        "teams": [
          [
            {
              "tag": "#J028CLR8C",
              "name": "lasilv4x",
              "brawler": {
                "id": 16000027,
                "name": "8-BIT",
                "power": 6,
                "trophies": 368
              }
            },
            {
              "tag": "#2LPCCVP29C",
              "name": "pipocas",
              "brawler": {
                "id": 16000063,
                "name": "CHESTER",
                "power": 8,
                "trophies": 372
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000054,
                "name": "FANG",
                "power": 11,
                "trophies": 388
              }
            },
            {
              "tag": "#C8GUQLGU9",
              "name": "migliatti _ma",
              "brawler": {
                "id": 16000031,
                "name": "MR. P",
                "power": 7,
                "trophies": 389
              }
            },
            {
              "tag": "#U82YPV222",
              "name": "מלודי",
              "brawler": {
                "id": 16000009,
                "name": "DYNAMIKE",
                "power": 9,
                "trophies": 377
              }
            }
          ],
          [
            {
              "tag": "#U880Y820Q",
              "name": "Bs |Wert1xx",
              "brawler": {
                "id": 16000011,
                "name": "MORTIS",
                "power": 7,
                "trophies": 377
              }
            },
            {
              "tag": "#CUJPLRVPQ",
              "name": "bludisdogwater",
              "brawler": {
                "id": 16000018,
                "name": "DARRYL",
                "power": 8,
                "trophies": 370
              }
            },
            {
              "tag": "#U98YVP9UQ",
              "name": "LvkzzZ",
              "brawler": {
                "id": 16000047,
                "name": "SQUEAK",
                "power": 8,
                "trophies": 388
              }
            },
            {
              "tag": "#CUC9RYQ8C",
              "name": "samario933",
              "brawler": {
                "id": 16000005,
                "name": "SPIKE",
                "power": 9,
                "trophies": 381
              }
            },
            {
              "tag": "#U9Y8QRC9V",
              "name": "Nono",
              "brawler": {
                "id": 16000077,
                "name": "LARRY & LAWRIE",
                "power": 7,
                "trophies": 377
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250613T134738.000Z",
      "event": {
        "id": 15000720,
        "mode": "wipeout5V5",
        "map": "Riverbank Crossing"
      },
      "battle": {
        "mode": "wipeout",
        "type": "ranked",
        "result": "victory",
        "duration": 102,
        "trophyChange": 11,
        "starPlayer": {
          "tag": "#820UUGRC8",
          "name": "Mck",
          "brawler": {
            "id": 16000003,
            "name": "BROCK",
            "power": 10,
            "trophies": 659
          }
        },
        "teams": [
          [
            {
              "tag": "#9CU0PY9Q9",
              "name": "✨PlayerOneYT✨",
              "brawler": {
                "id": 16000038,
                "name": "SURGE",
                "power": 9,
                "trophies": 497
              }
            },
            {
              "tag": "#2JPCG8CU29",
              "name": "Tralaleiro tral",
              "brawler": {
                "id": 16000043,
                "name": "EDGAR",
                "power": 11,
                "trophies": 603
              }
            },
            {
              "tag": "#22JJR9C80",
              "name": "naiko",
              "brawler": {
                "id": 16000063,
                "name": "CHESTER",
                "power": 11,
                "trophies": 799
              }
            },
            {
              "tag": "#2CRJRQLYC",
              "name": "Maru",
              "brawler": {
                "id": 16000036,
                "name": "NANI",
                "power": 11,
                "trophies": 794
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000003,
                "name": "BROCK",
                "power": 10,
                "trophies": 659
              }
            }
          ],
          [
            {
              "tag": "#2Y8QRLVJ2Q",
              "name": "bebelacpx",
              "brawler": {
                "id": 16000030,
                "name": "EMZ",
                "power": 10,
                "trophies": 309
              }
            },
            {
              "tag": "#2JYGPCY0VY",
              "name": "laysoca",
              "brawler": {
                "id": 16000006,
                "name": "BARLEY",
                "power": 9,
                "trophies": 343
              }
            },
            {
              "tag": "#28JG0Q88UQ",
              "name": "suco de pneu",
              "brawler": {
                "id": 16000001,
                "name": "COLT",
                "power": 10,
                "trophies": 473
              }
            },
            {
              "tag": "#C8U8GPJPP",
              "name": "tinta de carimb",
              "brawler": {
                "id": 16000003,
                "name": "BROCK",
                "power": 10,
                "trophies": 683
              }
            },
            {
              "tag": "#29CULCCCR",
              "name": "VictoriaTeAmo",
              "brawler": {
                "id": 16000065,
                "name": "MANDY",
                "power": 11,
                "trophies": 681
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250613T134519.000Z",
      "event": {
        "id": 15000720,
        "mode": "wipeout5V5",
        "map": "Riverbank Crossing"
      },
      "battle": {
        "mode": "wipeout",
        "type": "ranked",
        "result": "victory",
        "duration": 157,
        "trophyChange": 10,
        "starPlayer": {
          "tag": "#2UULVLCPG",
          "name": "Lucas bruno",
          "brawler": {
            "id": 16000006,
            "name": "BARLEY",
            "power": 11,
            "trophies": 777
          }
        },
        "teams": [
          [
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000003,
                "name": "BROCK",
                "power": 10,
                "trophies": 649
              }
            },
            {
              "tag": "#2J9LCQ0V28",
              "name": "F4ÇÜ",
              "brawler": {
                "id": 16000017,
                "name": "TARA",
                "power": 11,
                "trophies": 614
              }
            },
            {
              "tag": "#2YJR922Q2L",
              "name": "x_xGzx_GOD;",
              "brawler": {
                "id": 16000038,
                "name": "SURGE",
                "power": 10,
                "trophies": 603
              }
            },
            {
              "tag": "#288JJQJP98",
              "name": "Gabriel _7",
              "brawler": {
                "id": 16000001,
                "name": "COLT",
                "power": 10,
                "trophies": 706
              }
            },
            {
              "tag": "#2UULVLCPG",
              "name": "Lucas bruno",
              "brawler": {
                "id": 16000006,
                "name": "BARLEY",
                "power": 11,
                "trophies": 777
              }
            }
          ],
          [
            {
              "tag": "#82QYRQGUP",
              "name": "Luís Henrique",
              "brawler": {
                "id": 16000039,
                "name": "COLETTE",
                "power": 10,
                "trophies": 632
              }
            },
            {
              "tag": "#YPG9LCV9Q",
              "name": "João Pedro",
              "brawler": {
                "id": 16000013,
                "name": "POCO",
                "power": 10,
                "trophies": 542
              }
            },
            {
              "tag": "#8VVP8LRRP",
              "name": "BMS |Jack",
              "brawler": {
                "id": 16000038,
                "name": "SURGE",
                "power": 11,
                "trophies": 422
              }
            },
            {
              "tag": "#2RRCUCJQ8P",
              "name": "Ghostz233",
              "brawler": {
                "id": 16000027,
                "name": "8-BIT",
                "power": 8,
                "trophies": 122
              }
            },
            {
              "tag": "#GYLGJ8JYU",
              "name": "Sr.Juquinha",
              "brawler": {
                "id": 16000022,
                "name": "TICK",
                "power": 9,
                "trophies": 608
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250613T134154.000Z",
      "event": {
        "id": 15000720,
        "mode": "wipeout5V5",
        "map": "Riverbank Crossing"
      },
      "battle": {
        "mode": "wipeout",
        "type": "ranked",
        "result": "victory",
        "duration": 80,
        "trophyChange": 9,
        "starPlayer": {
          "tag": "#2GR092URQ2",
          "name": "𝓦♰",
          "brawler": {
            "id": 16000013,
            "name": "POCO",
            "power": 10,
            "trophies": 695
          }
        },
        "teams": [
          [
            {
              "tag": "#2J9J0CLR90",
              "name": "TUNG TUNG DAVI",
              "brawler": {
                "id": 16000054,
                "name": "FANG",
                "power": 11,
                "trophies": 667
              }
            },
            {
              "tag": "#R2JYJR80",
              "name": "C A L A N G O",
              "brawler": {
                "id": 16000050,
                "name": "GRIFF",
                "power": 7,
                "trophies": 283
              }
            },
            {
              "tag": "#2QQY0JVRGL",
              "name": "naruto uzumaki",
              "brawler": {
                "id": 16000012,
                "name": "CROW",
                "power": 11,
                "trophies": 668
              }
            },
            {
              "tag": "#2LVJQQ2QQY",
              "name": "Lucho",
              "brawler": {
                "id": 16000029,
                "name": "BEA",
                "power": 10,
                "trophies": 705
              }
            },
            {
              "tag": "#2JYQJ0QCJU",
              "name": "lucizonaty",
              "brawler": {
                "id": 16000061,
                "name": "GUS",
                "power": 8,
                "trophies": 628
              }
            }
          ],
          [
            {
              "tag": "#2GR092URQ2",
              "name": "𝓦♰",
              "brawler": {
                "id": 16000013,
                "name": "POCO",
                "power": 10,
                "trophies": 695
              }
            },
            {
              "tag": "#2LU9VLQ0R2",
              "name": "pão com ovo",
              "brawler": {
                "id": 16000007,
                "name": "JESSIE",
                "power": 11,
                "trophies": 714
              }
            },
            {
              "tag": "#2LQU8URYV8",
              "name": ":)🇦🇷",
              "brawler": {
                "id": 16000000,
                "name": "SHELLY",
                "power": 11,
                "trophies": 726
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000003,
                "name": "BROCK",
                "power": 10,
                "trophies": 640
              }
            },
            {
              "tag": "#GQ0R9QPLU",
              "name": "enricomarques",
              "brawler": {
                "id": 16000011,
                "name": "MORTIS",
                "power": 11,
                "trophies": 807
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250613T133956.000Z",
      "event": {
        "id": 15000720,
        "mode": "wipeout5V5",
        "map": "Riverbank Crossing"
      },
      "battle": {
        "mode": "wipeout",
        "type": "ranked",
        "result": "victory",
        "duration": 87,
        "trophyChange": 8,
        "starPlayer": {
          "tag": "#820UUGRC8",
          "name": "Mck",
          "brawler": {
            "id": 16000003,
            "name": "BROCK",
            "power": 10,
            "trophies": 632
          }
        },
        "teams": [
          [
            {
              "tag": "#2QV9P98GR9",
              "name": "dead1994___",
              "brawler": {
                "id": 16000030,
                "name": "EMZ",
                "power": 11,
                "trophies": 790
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000003,
                "name": "BROCK",
                "power": 10,
                "trophies": 632
              }
            },
            {
              "tag": "#GR28URPY",
              "name": "Felipe Lima",
              "brawler": {
                "id": 16000026,
                "name": "BIBI",
                "power": 9,
                "trophies": 702
              }
            },
            {
              "tag": "#GR8YRP8V",
              "name": "ooAleoo",
              "brawler": {
                "id": 16000024,
                "name": "ROSA",
                "power": 11,
                "trophies": 704
              }
            },
            {
              "tag": "#GR8JGPJY",
              "name": "GollDenZoRo",
              "brawler": {
                "id": 16000029,
                "name": "BEA",
                "power": 9,
                "trophies": 709
              }
            }
          ],
          [
            {
              "tag": "#GR92GVLR",
              "name": "NetoGG",
              "brawler": {
                "id": 16000079,
                "name": "ANGELO",
                "power": 11,
                "trophies": 712
              }
            },
            {
              "tag": "#GR20CY8R",
              "name": "Justin",
              "brawler": {
                "id": 16000002,
                "name": "BULL",
                "power": 9,
                "trophies": 704
              }
            },
            {
              "tag": "#GR0LU8P2",
              "name": "Gabriel200",
              "brawler": {
                "id": 16000044,
                "name": "RUFFS",
                "power": 11,
                "trophies": 707
              }
            },
            {
              "tag": "#GR82UU8Y",
              "name": "Julls | PSEMC❤️",
              "brawler": {
                "id": 16000025,
                "name": "CARL",
                "power": 9,
                "trophies": 702
              }
            },
            {
              "tag": "#GR0PLP8Y",
              "name": "♠️Lucas♠️",
              "brawler": {
                "id": 16000048,
                "name": "GROM",
                "power": 10,
                "trophies": 712
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250613T133804.000Z",
      "event": {
        "id": 15000720,
        "mode": "wipeout5V5",
        "map": "Riverbank Crossing"
      },
      "battle": {
        "mode": "wipeout",
        "type": "ranked",
        "result": "defeat",
        "duration": 114,
        "trophyChange": -4,
        "starPlayer": {
          "tag": "#RGQVRQ0YJ",
          "name": "curicaqui",
          "brawler": {
            "id": 16000029,
            "name": "BEA",
            "power": 11,
            "trophies": 633
          }
        },
        "teams": [
          [
            {
              "tag": "#RGQVRQ0YJ",
              "name": "curicaqui",
              "brawler": {
                "id": 16000029,
                "name": "BEA",
                "power": 11,
                "trophies": 633
              }
            },
            {
              "tag": "#UJPVC92Y",
              "name": "Lucas Bloqueado",
              "brawler": {
                "id": 16000040,
                "name": "AMBER",
                "power": 11,
                "trophies": 650
              }
            },
            {
              "tag": "#2QJR08R0PV",
              "name": "TUTU CRIA",
              "brawler": {
                "id": 16000020,
                "name": "FRANK",
                "power": 11,
                "trophies": 680
              }
            },
            {
              "tag": "#2YG0RR82G9",
              "name": "mialves",
              "brawler": {
                "id": 16000043,
                "name": "EDGAR",
                "power": 9,
                "trophies": 722
              }
            },
            {
              "tag": "#2YYYPUYYJU",
              "name": "Raul",
              "brawler": {
                "id": 16000079,
                "name": "ANGELO",
                "power": 11,
                "trophies": 619
              }
            }
          ],
          [
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000003,
                "name": "BROCK",
                "power": 10,
                "trophies": 636
              }
            },
            {
              "tag": "#2GCGPQQPGU",
              "name": "J I N X .★💤",
              "brawler": {
                "id": 16000015,
                "name": "PIPER",
                "power": 11,
                "trophies": 605
              }
            },
            {
              "tag": "#2QRVJVGV0J",
              "name": "Jhony shark",
              "brawler": {
                "id": 16000046,
                "name": "BELLE",
                "power": 9,
                "trophies": 633
              }
            },
            {
              "tag": "#9LU99P2JP",
              "name": "Vitor",
              "brawler": {
                "id": 16000042,
                "name": "BYRON",
                "power": 10,
                "trophies": 624
              }
            },
            {
              "tag": "#LPQLRV8JJ",
              "name": "TeVaAGanarUna",
              "brawler": {
                "id": 16000058,
                "name": "BONNIE",
                "power": 9,
                "trophies": 616
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250612T174813.000Z",
      "event": {
        "id": 15000005,
        "mode": "bounty",
        "map": "Shooting Star"
      },
      "battle": {
        "mode": "bounty",
        "type": "soloRanked",
        "result": "victory",
        "duration": 61,
        "starPlayer": {
          "tag": "#820UUGRC8",
          "name": "Mck",
          "brawler": {
            "id": 16000065,
            "name": "MANDY",
            "power": 11,
            "trophies": 12
          }
        },
        "teams": [
          [
            {
              "tag": "#2Y9U9QVJRJ",
              "name": "KSR|ARROGANTE👑",
              "brawler": {
                "id": 16000015,
                "name": "PIPER",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000065,
                "name": "MANDY",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#PGCYRCUPJ",
              "name": "xiru|br✨",
              "brawler": {
                "id": 16000079,
                "name": "ANGELO",
                "power": 11,
                "trophies": 12
              }
            }
          ],
          [
            {
              "tag": "#GL2VUQVVC",
              "name": "clara",
              "brawler": {
                "id": 16000065,
                "name": "MANDY",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#80QLVUQYL",
              "name": "BR/⛩️GUSTTA⛩️🐉",
              "brawler": {
                "id": 16000042,
                "name": "BYRON",
                "power": 10,
                "trophies": 11
              }
            },
            {
              "tag": "#GQJUYUYVG",
              "name": "ian",
              "brawler": {
                "id": 16000015,
                "name": "PIPER",
                "power": 11,
                "trophies": 12
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250612T174613.000Z",
      "event": {
        "id": 15000292,
        "mode": "hotZone",
        "map": "Open Business"
      },
      "battle": {
        "mode": "hotZone",
        "type": "soloRanked",
        "result": "victory",
        "duration": 85,
        "starPlayer": {
          "tag": "#2YRJ9RPR2V",
          "name": "×crazy×",
          "brawler": {
            "id": 16000085,
            "name": "KENJI",
            "power": 11,
            "trophies": 11
          }
        },
        "teams": [
          [
            {
              "tag": "#2YRJ9RPR2V",
              "name": "×crazy×",
              "brawler": {
                "id": 16000085,
                "name": "KENJI",
                "power": 11,
                "trophies": 11
              }
            },
            {
              "tag": "#PJPGQ8P92",
              "name": "nemo",
              "brawler": {
                "id": 16000013,
                "name": "POCO",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000019,
                "name": "PENNY",
                "power": 11,
                "trophies": 12
              }
            }
          ],
          [
            {
              "tag": "#R2URUY2C9",
              "name": "astro",
              "brawler": {
                "id": 16000043,
                "name": "EDGAR",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#L9U9R92GL",
              "name": "DINO",
              "brawler": {
                "id": 16000013,
                "name": "POCO",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#2Y0982YCGG",
              "name": "Saitama",
              "brawler": {
                "id": 16000020,
                "name": "FRANK",
                "power": 11,
                "trophies": 12
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250612T174353.000Z",
      "event": {
        "id": 15000025,
        "mode": "brawlBall",
        "map": "Triple Dribble"
      },
      "battle": {
        "mode": "brawlBall",
        "type": "soloRanked",
        "result": "defeat",
        "duration": 114,
        "starPlayer": {
          "tag": "#YRCG90GG0",
          "name": "fepe",
          "brawler": {
            "id": 16000038,
            "name": "SURGE",
            "power": 11,
            "trophies": 12
          }
        },
        "teams": [
          [
            {
              "tag": "#YRCG90GG0",
              "name": "fepe",
              "brawler": {
                "id": 16000038,
                "name": "SURGE",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#GLR9UQ929",
              "name": "L2Mestre",
              "brawler": {
                "id": 16000063,
                "name": "CHESTER",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#RY02VLULC",
              "name": "Plinho",
              "brawler": {
                "id": 16000004,
                "name": "RICO",
                "power": 11,
                "trophies": 12
              }
            }
          ],
          [
            {
              "tag": "#8YPRPVV80",
              "name": "Luiz",
              "brawler": {
                "id": 16000035,
                "name": "GALE",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#2LQVU2URPC",
              "name": "petito",
              "brawler": {
                "id": 16000009,
                "name": "DYNAMIKE",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000063,
                "name": "CHESTER",
                "power": 11,
                "trophies": 12
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250612T174034.000Z",
      "event": {
        "id": 15000306,
        "mode": "hotZone",
        "map": "Dueling Beetles"
      },
      "battle": {
        "mode": "hotZone",
        "type": "soloRanked",
        "result": "victory",
        "duration": 128,
        "starPlayer": {
          "tag": "#U928R0P",
          "name": "☆ZZ☆",
          "brawler": {
            "id": 16000005,
            "name": "SPIKE",
            "power": 11,
            "trophies": 12
          }
        },
        "teams": [
          [
            {
              "tag": "#U928R0P",
              "name": "☆ZZ☆",
              "brawler": {
                "id": 16000005,
                "name": "SPIKE",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#JUVG2VJY",
              "name": "C̸h̸o̸n̸g̸y̸u̸ⁿ",
              "brawler": {
                "id": 16000044,
                "name": "RUFFS",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#2GRPP2LCP8",
              "name": "ELIAS",
              "brawler": {
                "id": 16000022,
                "name": "TICK",
                "power": 11,
                "trophies": 12
              }
            }
          ],
          [
            {
              "tag": "#9J8CQVVPQ",
              "name": "AirPatrick",
              "brawler": {
                "id": 16000030,
                "name": "EMZ",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000006,
                "name": "BARLEY",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#YVCRLRQVG",
              "name": "⫸♡𝔨𝔢𝔨𝔦𝔱𝔬☽",
              "brawler": {
                "id": 16000085,
                "name": "KENJI",
                "power": 11,
                "trophies": 12
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250612T173709.000Z",
      "event": {
        "id": 15000050,
        "mode": "brawlBall",
        "map": "Sneaky Fields"
      },
      "battle": {
        "mode": "brawlBall",
        "type": "soloRanked",
        "result": "draw",
        "duration": 210,
        "starPlayer": {
          "tag": "#G9LUJ2LY",
          "name": "pablo",
          "brawler": {
            "id": 16000038,
            "name": "SURGE",
            "power": 11,
            "trophies": 12
          }
        },
        "teams": [
          [
            {
              "tag": "#9UVU8CLUC",
              "name": "Dinos Gojira",
              "brawler": {
                "id": 16000085,
                "name": "KENJI",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#8Y8Q2GR9G",
              "name": "⚡VUASH!⚡",
              "brawler": {
                "id": 16000089,
                "name": "MEEPLE",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#9088RVCR9",
              "name": "Mavg",
              "brawler": {
                "id": 16000022,
                "name": "TICK",
                "power": 11,
                "trophies": 12
              }
            }
          ],
          [
            {
              "tag": "#G9LUJ2LY",
              "name": "pablo",
              "brawler": {
                "id": 16000038,
                "name": "SURGE",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#20JVV0RJL0",
              "name": "GShinobu51",
              "brawler": {
                "id": 16000014,
                "name": "BO",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000063,
                "name": "CHESTER",
                "power": 11,
                "trophies": 12
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250612T173207.000Z",
      "event": {
        "id": 15000011,
        "mode": "gemGrab",
        "map": "Undermine"
      },
      "battle": {
        "mode": "gemGrab",
        "type": "soloRanked",
        "result": "victory",
        "duration": 91,
        "starPlayer": {
          "tag": "#YR9J2GG80",
          "name": "KRONOSS333",
          "brawler": {
            "id": 16000054,
            "name": "FANG",
            "power": 11,
            "trophies": 12
          }
        },
        "teams": [
          [
            {
              "tag": "#YG8Q2YPVC",
              "name": "SOUBOT",
              "brawler": {
                "id": 16000061,
                "name": "GUS",
                "power": 10,
                "trophies": 12
              }
            },
            {
              "tag": "#8J0RLC8L9",
              "name": "Nogueira 007",
              "brawler": {
                "id": 16000062,
                "name": "BUSTER",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#2QCJR8QV0",
              "name": "IJPCardoso",
              "brawler": {
                "id": 16000085,
                "name": "KENJI",
                "power": 11,
                "trophies": 12
              }
            }
          ],
          [
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000028,
                "name": "SANDY",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#C09UU0C0",
              "name": "ALC | Gabriel🌒",
              "brawler": {
                "id": 16000009,
                "name": "DYNAMIKE",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#YR9J2GG80",
              "name": "KRONOSS333",
              "brawler": {
                "id": 16000054,
                "name": "FANG",
                "power": 11,
                "trophies": 12
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250612T172853.000Z",
      "event": {
        "id": 15000019,
        "mode": "heist",
        "map": "Safe Zone"
      },
      "battle": {
        "mode": "heist",
        "type": "soloRanked",
        "result": "victory",
        "duration": 131,
        "starPlayer": {
          "tag": "#PP2LLCYQC",
          "name": "tua mãekkj",
          "brawler": {
            "id": 16000007,
            "name": "JESSIE",
            "power": 11,
            "trophies": 12
          }
        },
        "teams": [
          [
            {
              "tag": "#2QL92ULJUC",
              "name": "gato😎",
              "brawler": {
                "id": 16000047,
                "name": "SQUEAK",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#L0VJUC0LY",
              "name": "*Gustavo*201",
              "brawler": {
                "id": 16000063,
                "name": "CHESTER",
                "power": 11,
                "trophies": 11
              }
            },
            {
              "tag": "#L0J9VYC8L",
              "name": "Fairy Tail",
              "brawler": {
                "id": 16000039,
                "name": "COLETTE",
                "power": 11,
                "trophies": 12
              }
            }
          ],
          [
            {
              "tag": "#PP2LLCYQC",
              "name": "tua mãekkj",
              "brawler": {
                "id": 16000007,
                "name": "JESSIE",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#2RJ9QGG8Q8",
              "name": "Ryan",
              "brawler": {
                "id": 16000015,
                "name": "PIPER",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000065,
                "name": "MANDY",
                "power": 11,
                "trophies": 12
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250612T172527.000Z",
      "event": {
        "id": 15000011,
        "mode": "gemGrab",
        "map": "Undermine"
      },
      "battle": {
        "mode": "gemGrab",
        "type": "soloRanked",
        "result": "defeat",
        "duration": 103,
        "starPlayer": {
          "tag": "#2Q2VV8Y2G2",
          "name": "亗† Eᴍɪʟɪᴀɴᴏ †亗",
          "brawler": {
            "id": 16000034,
            "name": "JACKY",
            "power": 11,
            "trophies": 12
          }
        },
        "teams": [
          [
            {
              "tag": "#2LYUQP29C",
              "name": "abuhña2",
              "brawler": {
                "id": 16000002,
                "name": "BULL",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#LPJGJP9VC",
              "name": "flor:)",
              "brawler": {
                "id": 16000003,
                "name": "BROCK",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000026,
                "name": "BIBI",
                "power": 11,
                "trophies": 12
              }
            }
          ],
          [
            {
              "tag": "#GQJRY9VVY",
              "name": "polloso69",
              "brawler": {
                "id": 16000023,
                "name": "LEON",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#2Q2VV8Y2G2",
              "name": "亗† Eᴍɪʟɪᴀɴᴏ †亗",
              "brawler": {
                "id": 16000034,
                "name": "JACKY",
                "power": 11,
                "trophies": 12
              }
            },
            {
              "tag": "#92RG8JP",
              "name": "❄ＱＬＳ|ＳＡＮＴＹ❄",
              "brawler": {
                "id": 16000065,
                "name": "MANDY",
                "power": 11,
                "trophies": 12
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250612T172213.000Z",
      "event": {
        "id": 15000923,
        "mode": "knockout5V5",
        "map": "Unhappy Arena"
      },
      "battle": {
        "mode": "knockout",
        "type": "ranked",
        "result": "victory",
        "duration": 275,
        "trophyChange": 8,
        "starPlayer": {
          "tag": "#2J88R98YPV",
          "name": "euge",
          "brawler": {
            "id": 16000043,
            "name": "EDGAR",
            "power": 11,
            "trophies": 407
          }
        },
        "teams": [
          [
            {
              "tag": "#GPJLJUCJU",
              "name": "ビール",
              "brawler": {
                "id": 16000065,
                "name": "MANDY",
                "power": 11,
                "trophies": 453
              }
            },
            {
              "tag": "#2J88R98YPV",
              "name": "euge",
              "brawler": {
                "id": 16000043,
                "name": "EDGAR",
                "power": 11,
                "trophies": 407
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000079,
                "name": "ANGELO",
                "power": 9,
                "trophies": 466
              }
            },
            {
              "tag": "#PCV0Q2JGP",
              "name": "A09",
              "brawler": {
                "id": 16000004,
                "name": "RICO",
                "power": 11,
                "trophies": 432
              }
            },
            {
              "tag": "#PCCCU2J0P",
              "name": "yasin baba",
              "brawler": {
                "id": 16000059,
                "name": "OTIS",
                "power": 10,
                "trophies": 438
              }
            }
          ],
          [
            {
              "tag": "#PCVUYUY00",
              "name": "マジックミラー",
              "brawler": {
                "id": 16000029,
                "name": "BEA",
                "power": 9,
                "trophies": 442
              }
            },
            {
              "tag": "#PCVG0280P",
              "name": "B0tas${'$'}${'$'}",
              "brawler": {
                "id": 16000006,
                "name": "BARLEY",
                "power": 10,
                "trophies": 436
              }
            },
            {
              "tag": "#PCVUQ9CVJ",
              "name": "Sukrilhos",
              "brawler": {
                "id": 16000030,
                "name": "EMZ",
                "power": 10,
                "trophies": 439
              }
            },
            {
              "tag": "#PCULL9J2L",
              "name": "manonke",
              "brawler": {
                "id": 16000035,
                "name": "GALE",
                "power": 9,
                "trophies": 439
              }
            },
            {
              "tag": "#PCUCL8CU0",
              "name": "Mr_BandageOO1",
              "brawler": {
                "id": 16000000,
                "name": "SHELLY",
                "power": 10,
                "trophies": 439
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250612T171642.000Z",
      "event": {
        "id": 15000923,
        "mode": "knockout5V5",
        "map": "Unhappy Arena"
      },
      "battle": {
        "mode": "knockout",
        "type": "ranked",
        "result": "defeat",
        "duration": 204,
        "trophyChange": -4,
        "starPlayer": {
          "tag": "#8UJCQRCV",
          "name": "TheMax_-",
          "brawler": {
            "id": 16000029,
            "name": "BEA",
            "power": 9,
            "trophies": 662
          }
        },
        "teams": [
          [
            {
              "tag": "#YGP8Y20PU",
              "name": "AE|Alan",
              "brawler": {
                "id": 16000041,
                "name": "LOU",
                "power": 9,
                "trophies": 673
              }
            },
            {
              "tag": "#8C92VQ8JP",
              "name": "ale.xd.777",
              "brawler": {
                "id": 16000005,
                "name": "SPIKE",
                "power": 10,
                "trophies": 603
              }
            },
            {
              "tag": "#RL09VVG2J",
              "name": "debzola",
              "brawler": {
                "id": 16000082,
                "name": "BERRY",
                "power": 11,
                "trophies": 658
              }
            },
            {
              "tag": "#8UJCQRCV",
              "name": "TheMax_-",
              "brawler": {
                "id": 16000029,
                "name": "BEA",
                "power": 9,
                "trophies": 662
              }
            },
            {
              "tag": "#YPYQPPVC2",
              "name": "Coguni",
              "brawler": {
                "id": 16000017,
                "name": "TARA",
                "power": 10,
                "trophies": 673
              }
            }
          ],
          [
            {
              "tag": "#2G8QQ8LPVP",
              "name": "luquinhas",
              "brawler": {
                "id": 16000030,
                "name": "EMZ",
                "power": 10,
                "trophies": 616
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000003,
                "name": "BROCK",
                "power": 10,
                "trophies": 640
              }
            },
            {
              "tag": "#2R8Y9QUC",
              "name": "Luffy Ackerman",
              "brawler": {
                "id": 16000038,
                "name": "SURGE",
                "power": 9,
                "trophies": 609
              }
            },
            {
              "tag": "#2L2J0QQL09",
              "name": "ht_almeidax",
              "brawler": {
                "id": 16000015,
                "name": "PIPER",
                "power": 11,
                "trophies": 672
              }
            },
            {
              "tag": "#2QG2JQQRVL",
              "name": "mestre do braws",
              "brawler": {
                "id": 16000000,
                "name": "SHELLY",
                "power": 11,
                "trophies": 637
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250612T155737.000Z",
      "event": {
        "id": 15000923,
        "mode": "knockout5V5",
        "map": "Unhappy Arena"
      },
      "battle": {
        "mode": "knockout",
        "type": "ranked",
        "result": "defeat",
        "duration": 198,
        "trophyChange": -4,
        "starPlayer": {
          "tag": "#LG0J2GGQR",
          "name": "Brady",
          "brawler": {
            "id": 16000031,
            "name": "MR. P",
            "power": 11,
            "trophies": 750
          }
        },
        "teams": [
          [
            {
              "tag": "#GYU9RUGP",
              "name": "Raúl.Antonio",
              "brawler": {
                "id": 16000028,
                "name": "SANDY",
                "power": 11,
                "trophies": 783
              }
            },
            {
              "tag": "#20RC2G9LU2",
              "name": "neymar ${'$'}",
              "brawler": {
                "id": 16000087,
                "name": "JUJU",
                "power": 9,
                "trophies": 316
              }
            },
            {
              "tag": "#LG0J2GGQR",
              "name": "Brady",
              "brawler": {
                "id": 16000031,
                "name": "MR. P",
                "power": 11,
                "trophies": 750
              }
            },
            {
              "tag": "#GGCYQGL8U",
              "name": "toto🐣💛",
              "brawler": {
                "id": 16000048,
                "name": "GROM",
                "power": 9,
                "trophies": 736
              }
            },
            {
              "tag": "#2LVRJL299Y",
              "name": "Hora de aventur",
              "brawler": {
                "id": 16000081,
                "name": "LILY",
                "power": 11,
                "trophies": 727
              }
            }
          ],
          [
            {
              "tag": "#Q0RCRLP9C",
              "name": "𝓪𝓵𝔂",
              "brawler": {
                "id": 16000050,
                "name": "GRIFF",
                "power": 9,
                "trophies": 719
              }
            },
            {
              "tag": "#22UU8GCUU",
              "name": "Haniel pro game",
              "brawler": {
                "id": 16000091,
                "name": "LUMI",
                "power": 11,
                "trophies": 688
              }
            },
            {
              "tag": "#QVVQQ9C9V",
              "name": "AndreXd",
              "brawler": {
                "id": 16000015,
                "name": "PIPER",
                "power": 11,
                "trophies": 783
              }
            },
            {
              "tag": "#JYL0CC",
              "name": "ElTemplario0",
              "brawler": {
                "id": 16000047,
                "name": "SQUEAK",
                "power": 11,
                "trophies": 683
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000003,
                "name": "BROCK",
                "power": 10,
                "trophies": 644
              }
            }
          ]
        ]
      }
    },
    {
      "battleTime": "20250612T155326.000Z",
      "event": {
        "id": 15000923,
        "mode": "knockout5V5",
        "map": "Unhappy Arena"
      },
      "battle": {
        "mode": "knockout",
        "type": "ranked",
        "result": "victory",
        "duration": 282,
        "trophyChange": 9,
        "starPlayer": {
          "tag": "#820UUGRC8",
          "name": "Mck",
          "brawler": {
            "id": 16000003,
            "name": "BROCK",
            "power": 10,
            "trophies": 635
          }
        },
        "teams": [
          [
            {
              "tag": "#CVQJ8VP",
              "name": "Lupivg",
              "brawler": {
                "id": 16000013,
                "name": "POCO",
                "power": 9,
                "trophies": 619
              }
            },
            {
              "tag": "#2VPY9V88J",
              "name": "Gabriel",
              "brawler": {
                "id": 16000061,
                "name": "GUS",
                "power": 8,
                "trophies": 618
              }
            },
            {
              "tag": "#2PQG898GL",
              "name": "Vinícius",
              "brawler": {
                "id": 16000065,
                "name": "MANDY",
                "power": 9,
                "trophies": 632
              }
            },
            {
              "tag": "#LJCPUYQ82",
              "name": "ALY🍒",
              "brawler": {
                "id": 16000062,
                "name": "BUSTER",
                "power": 11,
                "trophies": 622
              }
            },
            {
              "tag": "#YVQUJRQ0",
              "name": "Megamente",
              "brawler": {
                "id": 16000008,
                "name": "NITA",
                "power": 10,
                "trophies": 619
              }
            }
          ],
          [
            {
              "tag": "#2LUQ9VYJJR",
              "name": "gote🤫🧏😎",
              "brawler": {
                "id": 16000065,
                "name": "MANDY",
                "power": 9,
                "trophies": 657
              }
            },
            {
              "tag": "#2LYU2CLGJV",
              "name": "Gadlely",
              "brawler": {
                "id": 16000040,
                "name": "AMBER",
                "power": 10,
                "trophies": 673
              }
            },
            {
              "tag": "#8J8Q9U02",
              "name": "OSNOLA33",
              "brawler": {
                "id": 16000009,
                "name": "DYNAMIKE",
                "power": 7,
                "trophies": 612
              }
            },
            {
              "tag": "#820UUGRC8",
              "name": "Mck",
              "brawler": {
                "id": 16000003,
                "name": "BROCK",
                "power": 10,
                "trophies": 635
              }
            },
            {
              "tag": "#2GGJCVCRYR",
              "name": "Luam koeme",
              "brawler": {
                "id": 16000058,
                "name": "BONNIE",
                "power": 10,
                "trophies": 633
              }
            }
          ]
        ]
      }
    }
  ],
  "paging": {
    "cursors": {}
  }
}
    """.trimIndent()
}