## Test kubernetes directory

This directory can contain any extra kubernetes resources you'd like to be skaffolded during development, but not included as part of a release.

For example, if you need a SQL instance stood up for your application to run in Kubernetes (and this isn't managed elsewhere, such as a local seed), then you can include it here. 

Upon running `skaffold dev`, these will be deployed. 