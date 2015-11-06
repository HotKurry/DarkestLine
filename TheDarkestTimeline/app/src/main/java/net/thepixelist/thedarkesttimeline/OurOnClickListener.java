package net.thepixelist.thedarkesttimeline;

/**
 * Created by Iron Bank of Braavos on 11/6/2015.
 */
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Created by White Walker on 9/1/2015.
 */
public class OurOnClickListener implements OnClickListener {
    MainActivity caller;
    private int count;


    public OurOnClickListener(MainActivity activity) {
        this.caller = activity;
        this.count =0;
    }
    public void onClick(View view) {
        count = count + 1;
        if(count == 1) {
            caller.thewords.setText("A dark portal opens");
            caller.myButton.setText("Press");
            caller.theimage.setImageResource(R.drawable.bard);

        } else {
            if(count == 2) {
                caller.thewords.setText("You walk through");
                caller.myButton.setText("Press");
                caller.theimage.setImageResource(R.drawable.bard);
            } else {
                if(count == 3) {
                    caller.thewords.setText("You die");
                    caller.myButton.setText("Press");
                    caller.theimage.setImageResource(R.drawable.bard);
                } else {
                    if(count == 4) {
                        caller.thewords.setText("You are less dead");
                        caller.myButton.setText("Press");
                        caller.theimage.setImageResource(R.drawable.bard);
                    } else {
                        if(count == 5) {
                            caller.thewords.setText("You eat some brains");
                            caller.myButton.setText("Press");
                            caller.theimage.setImageResource(R.drawable.bard);
                        } else {
                            if(count == 6) {
                                caller.thewords.setText("You punch a clown");
                                caller.myButton.setText("Press");
                                caller.theimage.setImageResource(R.drawable.bard);
                            } else {
                                if(count == 7) {
                                    caller.thewords.setText("clown is a vampire and bites you");
                                    caller.myButton.setText("Press");
                                    caller.theimage.setImageResource(R.drawable.bard);
                                } else {
                                    if(count == 8) {
                                        caller.thewords.setText("you are a vampire now");
                                        caller.myButton.setText("Press");
                                        caller.theimage.setImageResource(R.drawable.bard);
                                    } else {
                                        if(count == 9) {
                                            caller.thewords.setText("you see a super hot vampire chick");
                                            caller.myButton.setText("Press");
                                            caller.theimage.setImageResource(R.drawable.bard);
                                        } else {
                                            if(count == 10) {
                                                caller.thewords.setText("you make out a little");
                                                caller.myButton.setText("Press");
                                                caller.theimage.setImageResource(R.drawable.bard);
                                            } else {
                                                if(count == 11) {
                                                    caller.thewords.setText("She tells you she has a boyfriend");
                                                    caller.myButton.setText("Press");
                                                    caller.theimage.setImageResource(R.drawable.bard);
                                                } else {
                                                    if(count == 12) {
                                                        caller.thewords.setText("you walk home dejected");
                                                        caller.myButton.setText("Press");
                                                        caller.theimage.setImageResource(R.drawable.bard);
                                                    } else {
                                                        if(count == 13) {
                                                            caller.thewords.setText("You find a stray cat");
                                                            caller.myButton.setText("Press");
                                                            caller.theimage.setImageResource(R.drawable.bard);
                                                        } else {
                                                            if(count == 14) {
                                                                caller.thewords.setText("you become a cat person");
                                                                caller.myButton.setText("Press");
                                                                caller.theimage.setImageResource(R.drawable.bard);
                                                            } else {
                                                                if(count == 15) {
                                                                    caller.thewords.setText("you get about 50 cats");
                                                                    caller.myButton.setText("Press");
                                                                    caller.theimage.setImageResource(R.drawable.bard);
                                                                } else {
                                                                    if(count == 16) {
                                                                        caller.thewords.setText("your cat army takes over New Jersey");
                                                                        caller.myButton.setText("Press");
                                                                        caller.theimage.setImageResource(R.drawable.bard);
                                                                    } else {
                                                                        if(count == 17) {
                                                                            caller.thewords.setText("As king of New Jersey you execute all bro's");
                                                                            caller.myButton.setText("Press");
                                                                            caller.theimage.setImageResource(R.drawable.bard);
                                                                        } else {
                                                                            if(count == 18) {
                                                                                caller.thewords.setText("you take Aurbry Plaza as your queen");
                                                                                caller.myButton.setText("Press");
                                                                                caller.theimage.setImageResource(R.drawable.bard);
                                                                            } else {
                                                                                if(count == 19) {
                                                                                    caller.thewords.setText("Blade from the movie blade tries to cut you with his blade");
                                                                                    caller.myButton.setText("Press");
                                                                                    caller.theimage.setImageResource(R.drawable.bard);
                                                                                }else{
                                                                                    caller.thewords.setText("You hide in a broom closet till he finds you and kills you");
                                                                                    caller.myButton.setText("Press");
                                                                                    caller.theimage.setImageResource(R.drawable.bard);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }}
