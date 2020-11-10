FROM node:12.19-alpine3.10 AS build
RUN mkdir -p /app
WORKDIR /app
COPY package.json /app
RUN npm install
COPY . /app
RUN npm run build --prod

FROM nginx:1.19.4-alpine AS prod-stage
COPY --from=build /app/dist/challenge-ml /usr/share/nginx/html
