package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class N52 {
    public static final String a = "ShortcutXmlParser";
    public static final String b = "android.app.shortcuts";
    public static final String c = "shortcut";
    public static final String d = "shortcutId";
    public static volatile ArrayList<String> e;
    public static final Object f = new Object();

    public static String a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlPullParser.getAttributeValue(null, str);
        }
        return attributeValue;
    }

    public static List<String> b(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new ArrayList<>();
                        e.addAll(e(context));
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public static XmlResourceParser c(Context context, ActivityInfo activityInfo) {
        XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), b);
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    public static List<String> d(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String a2;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && c.equals(name) && (a2 = a(xmlPullParser, d)) != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public static Set<String> e(Context context) {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            try {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(b)) {
                        XmlResourceParser c2 = c(context, activityInfo);
                        hashSet.addAll(d(c2));
                        if (c2 != null) {
                            c2.close();
                        }
                    }
                }
            } catch (Exception e2) {
                Log.e(a, "Failed to parse the Xml resource: ", e2);
            }
        }
        return hashSet;
    }
}
