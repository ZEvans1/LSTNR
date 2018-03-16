# _LSTNR_

#### _A mobile app intended to match user travel times with podcasts / playlists of similar duration. Android week 1 @ Epicodus, Mar. 16, 2018._

#### By _**Zach Evans**_

## Idea/Explanation

_This app is intended for users who would like to find podcasts or song playlists to listen to while they travel. The user inputs travel times and is given an average travel time. Later, API calls will return media for the user to listen to and match track durations with their average travel time._

### Specs
| Behavior | Input | Output |
| :-------------     | :------------- | :-------------
| **Returns an average of numbers**| {1, 2, 3} | 2 |


## Future work
* Immediate first steps are to make sure data is preserved while navigating through all of the activities. Currently, data is just passed between the Travel and Listen activities.
* Implement API calls for podcasts / songs.
* Implement a database so user data is stored.
* Potentially move towards making travel objects that allow for more functions, like searches tailored to mode of transport or day of week.


## Setup/Installation Requirements

* _Clone repository to your machine from: https://github.com/ZEvans1/LSTNR_
* _Open cloned repository in Android Studio_
* _Run app on an Android emulator (designed for Nexus 6)_

App instructions:
* _Press the Travel button on the main page_
* _Enter a number into the edit field and press submit to see your number stored in a list (for now you must close the input keyboard to see results)_
* _Press the Listen button on the Travel page to view your average travel time_

## Known Bugs / Issues

* _User data is not passed between all activities --> navigating from Listen to any other activity besides Travel will cause entered data to be 'forgotten'._
* _Forms are not automatically emptied_
* _List of user travel times does not display until the input keyboard is closed_

## Support and contact details

_Direct questions or comments to: zte.zachary@gmail.com_

## Technologies / Languages Used

* _Java_
* _Android Studio_


### License
Copyright (C) 2018, Zach Evans
