import http from 'k6/http';
import { check, sleep } from 'k6';

export const options = {

  stages: [
    { duration: '20s', target: 20 },
    { duration: '1m', target: 1000 },
    { duration: '20s', target: 20 },
  ],

  thresholds: {
      http_req_failed: ['rate<0.01'], // http errors should be less than 1%
      http_req_duration: ['p(95)<680'], // 95% of requests should be below 680ms
      http_req_failed: ['rate<0.01'], // During the whole test execution, the error rate must be lower than 1%.
    },
};

export default function () {

  const res = http.get('https://stage.marketplace.akc.org/');
  //const resPuppiesPage = http.get('https://marketplace.akc.org/about-akc-marketplace');
  check(res, {
    'status was 200': (r) => r.status == 200,
    //'verify homepage text': (r) => r.body.includes('puppies'),
    //200 response may contain an error message. In these situations, we check the response body.
    //'body size is 18,600 bytes': (r) => r.body.length == 18600,

  });

}