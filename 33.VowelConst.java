{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println(" Enter an Alphabet");
         char ch = sc.next().charAt(0);
         switch (ch) {
                   
             case 'a', 'e', 'i', 'o', 'u', 'A','E', 'I', 'O' , 'U' -> System.out.println(ch + " is a Vowel");
             default -> System.out.println(ch + " is a Consonant");
         }
     }
 }

//              case 'a':
//              case 'e':
//              case 'i':
//              case 'o':
//              case 'u':
//                  System.out.println(ch + " is a Vowel");
//                  break;
//              default:
//                  System.out.println(ch + " is a Consonant");
//          }
//      }
//  }

