# Facebook Image Processor

The Facebook Image Processor is an application that utilizes the SpringBoot framework to manage API requests about a specific Facebook user.
This application can fetch data about the latest 500 photos on the user's profile, save it locally to a .json file, filter them and get stats about
dimensions in pixels, orientation and presence of some caption using an ArrayList and some custom Filter classes.

# How to Use and Available Routes

After the repository has been cloned, the application can be run in Eclipse as a Spring Boot Application.
NOTE: The application requires a "config.txt" file in the root folder that contains the token of the user to work properly.
Due to Facebook's policies, this token can't be provided via GitHub.

The program is now ready to listen for inputs at http://localhost:8080

The available routes are:

|TYPE            |ROUTE                          | DESCRIPTION                         |
|----------------|-------------------------------|-----------------------------|
|GET             | /refresh                      | Fetches the latest data through the Graph API, prints whether or not it has succeeded and saves it locally to a .json file.          |
|GET             | /photos                       | Gives back all of the saved photos as a JSON Array.                                          |
|GET             | /photos?filter = value        | Gives back a filtered JSON Array based on the chosen "value" (Defaults to no filter)              |
|GET             | /stats                        | Gives back statistics regarding the saved photos.                                            |

# Filters

These are the available filters:

|VALUE    | DESCRIPTION                          | 
|----------------|-------------------------------|
|captioned       | Filters all photos that have a caption.                     | 
|uncaptioned     | Filters all photos that don't have a caption.                       |
|horizontal      | Filters all horizontal photos (width > height).        | 
|vertical        | Filters all vertical photos (height > width).   
|square          | Filters all square photos (height = width).
|small           | Filters all photos that are less than 500 pixels in both dimensions.
|large           | Filters all photos that are more than 500 pixels in any dimension.

# Statistics

Statistics take into account these parameters:

- Total number of photos
- Number of captioned photos
- Number of uncaptioned photos
- Number of horizontal photos
- Number of vertical photos
- Number of square photos
- Average width of all photos
- Average height of all photos

# Examples

*Successful /refresh call:*
![image](https://user-images.githubusercontent.com/40301422/146972399-126eef60-7336-44b5-96af-130e687d927b.png)

*Unfiltered /photos call:*
![image](https://user-images.githubusercontent.com/40301422/146971989-6409c157-5a00-49fe-8c98-711ad5f9a412.png)

*Filtered /photos call with the "square" parameter:*
![image](https://user-images.githubusercontent.com/40301422/146972265-b29896c5-84d4-4d6a-8431-3b6ff0511c16.png)

*/stats call:*
![image](https://user-images.githubusercontent.com/40301422/146972501-a85eb076-6ae5-4bad-8726-0d850d6724d3.png)


# Credits

This application has been developed in Java using: 

- Eclipse (IDE) 
- SpringBoot (Framework)
- Maven (Project and dependencies manager)
- Postman (API testing)

Most of the application's code has been written together by the two authors.

- Alessandro Rossini
- Francesco Romeo Parisi
