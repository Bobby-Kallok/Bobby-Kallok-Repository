const greetings = ['I went to buy some camo pants but couldn’t find any', 'I failed math so many times at school, I can’t even count', 'I used to have a handle on life, but then it broke', 'I was wondering why the frisbee kept getting bigger and bigger, but then it hit me', 'I heard there were a bunch of break-ins over at the car park. That is wrong on so many levels', 'I want to die peacefully in my sleep, like my grandfather… Not screaming and yelling like the passengers in his car', 'When life gives you melons, you might be dyslexic', 'Don’t you hate it when someone answers their own questions? I do', 'It takes a lot of balls to golf the way I do', 'I told him to be himself; that was pretty mean, I guess'];

export default function handler(req, res) {
  const i = Math.floor(Math.random() * greetings.length);
  const greeting = greetings[i];
  return res.send(`${greeting} `);
}
