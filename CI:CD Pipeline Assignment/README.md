# vercel-cicd
#This folder contains the files used to create a DevOps Pipeline in Monmouth University's Process of Software Engineering course. Much of this was created as part of the course materials but the implementation was done individually.

A sample GitLab CI/CD pipeline that deploys a simple serverless API to Vercel. This example uses the [Node.js Serverless Function](https://vercel.com/templates/other/nodejs-serverless-function-express) template.

## Deploying to Vercel

1. Install the latest [Node.js LTS release](https://nodejs.org/en)
1. Create a Vercel account

     * Go to [https://vercel.com/signup](https://vercel.com/signup)
     * Plan Type: Hobby (note that this free tier is [limited](https://vercel.com/docs/accounts/plans/hobby#))
     * Your Name: _your name_
     * Continue with Email
     * Click Verify in Email
     * Click Verify in browser

1. Log into your [Vercel account](https://vercel.com/login) in a browser
1. Create a Vercel [access token](https://vercel.com/guides/how-do-i-use-a-vercel-api-access-token#creating-an-access-token) and copy/remember it.
1. Go to this GitLab project _Settings > CI/CD > Variables > Expand > Add variable

    * Uncheck all flags
    * Key: VERCEL_TOKEN
    * Value: _your Vercel access token_
    * Add variable

1. Clone _this_ repo to your local computer
1. Make a commit to this repo to trigger the pipeline
1. Go to your GitLab project in the browser and select [Jobs](https://gitlab.com/monmouth-etorres/vercel-cicd/-/jobs)
1. Click the Status bubble to view the job logs
1. Wait for the Job to succeed
1. At the bottom of the logs, copy the _Production_ URL
1. Append `/api/hello` to the end of the URL and visit the URL in the browser
1. Refresh the page a few times to get different responses.
1. Your app was successfully deployed from GitLab CI/CD to Vercel
1. For more information, see [How can I use GitLab Pipelines with Vercel?](https://vercel.com/guides/how-can-i-use-gitlab-pipelines-with-vercel)

### For Prof T. only

My Vercel tokens are [here](https://vercel.com/account/tokens)
VERCEL-TOKEN: `5uLjxEzpHYVSHkVbIuIOVEPD`

## Deploying Locally

```bash
npm install vercel
npx vercel dev
# Continue with Email
# Enter your Vercel email address
# TODO TODO TODO
```
