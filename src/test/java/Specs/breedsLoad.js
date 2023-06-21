import http from 'k6/http';
import { group, sleep } from 'k6';

export const options = {

  stages: [
        { duration: '10s', target: 10 },
        { duration: '30s', target: 50 },
        { duration: '10s', target: 10 },

      ],

  thresholds: {
    'group_duration{group:::individualRequests}': ['avg < 60000'],
    'group_duration{group:::batchRequests}': ['avg < 70000'],
  },

};

export default function () {
  group('individualRequests', function () {
    http.get('https://stage.marketplace.akc.org/puppies/beagle');
    http.get('https://stage.marketplace.akc.org/puppies/labrador-retriever');
    http.get('https://stage.marketplace.akc.org/puppies/skye-terrier');
    http.get('https://stage.marketplace.akc.org/puppies/bull-terrier');
    http.get('https://stage.marketplace.akc.org/puppies/boxer');
    http.get('https://stage.marketplace.akc.org/puppies/doberman-pinscher');
  });

  group('batchRequests', function () {
    http.batch([
      ['GET', `https://stage.marketplace.akc.org/about-akc-marketplace`],
      ['GET', `https://stage.marketplace.akc.org/things-to-consider-before-getting-a-dog`],
      ['GET', `https://stage.marketplace.akc.org/choosing-a-breed`],
      ['GET', `https://stage.marketplace.akc.org/questions-to-ask-breeder`],
      ['GET', `https://stage.marketplace.akc.org/preparing-for-puppy`],
    ]);
  });

}