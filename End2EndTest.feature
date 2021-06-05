Feature: use ugu app
  User should be able to
                        login
                        add image post & image story and sent to friend
                        add text post & text story and sent to friend
                        search on users
                        add comment to the post
                        add reply to the comment
                        add reaction to the post
                        share the post
                        delete his posts
                        submit to dare
                        logout

  Scenario: User login to the app add post & story & comment & reply & dare & life & logout
    Given The User Login in the app
    And  user choose to add image post & image story and sent it to friend
    And choose to add text story and text post and sent it to friend
    ###And select active dare and submit to it
    ###And select active life and submit to it
    And user search on account and add delete comment reply share react to his post
    And user can delete his story
    And Go to his profile and delete his posts
    When  Go to profile to select logout
    Then  User should logout successfully


