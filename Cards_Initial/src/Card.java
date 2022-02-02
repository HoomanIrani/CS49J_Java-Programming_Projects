public class Card {

    String cardInit;

    public Card(String newCard) {

        cardInit = newCard;
    }


    public String getDescription()  {

        String description;

        switch (cardInit.charAt(0)) {
            case 'A':
                description = "Ace ";
                break;

            case '2':
                description = "Two ";
                break;

            case '3':
                description = "Three ";
                break;

            case '4':
                description = "Four ";
                break;

            case '5':
                description = "Five ";
                break;

            case '6':
                description = "Six ";
                break;

            case '7':
                description = "Seven ";
                break;

            case '8':
                description = "Eight ";
                break;

            case '9':
                description = "Nine ";
                break;

            case 'J':
                description = "Jack ";
                break;

            case 'Q':
                description = "Queen ";
                break;

            case 'K':
                description = " King ";
                break;

            default:
                description = "Unknown";

        }

        if (description != "Unknown") {

            switch (cardInit.charAt(cardInit.length() - 1)) {

                case 'D':
                    description = description + "of Diamonds.";
                    break;

                case 'H':
                    description = description + "of Hearts.";
                    break;

                case 'S':
                    description = description + "of Spades.";
                    break;

                case 'C':
                    description = description + "of Clubs.";
                    break;

                default:
                    description = "Unknown";
            }
        }

        return description;

    }

}
