package com.example.GradleProject;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author lgh on 2021/2/19 10:22
 * @description
 */
public class BuildTypeUtils {

    public static void drawBadge(Activity activity) {
        ViewGroup decorView = (ViewGroup) activity.getWindow().getDecorView();
        View badge = new View(activity);
        badge.setBackgroundColor(Color.YELLOW);
        decorView.addView(badge,100,100);
    }
}
