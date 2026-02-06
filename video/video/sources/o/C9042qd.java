package o;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: o.qd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9042qd {
    public static final String a = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    public static final String b = "application_locales";
    public static final String c = "locales";
    public static final String d = "AppLocalesStorageHelper";
    public static final boolean e = false;
    public static final Object f = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r5 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r5 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, String str) {
        synchronized (f) {
            if (str.equals("")) {
                context.deleteFile(a);
                return;
            }
            try {
                FileOutputStream openFileOutput = context.openFileOutput(a, 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, c);
                    newSerializer.attribute(null, b, str);
                    newSerializer.endTag(null, c);
                    newSerializer.endDocument();
                } catch (Exception e2) {
                    Log.w(d, "Storing App Locales : Failed to persist app-locales in storage ", e2);
                }
            } catch (FileNotFoundException unused) {
                Log.w(d, String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", a));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if (r5 != 4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r3.getName().equals(o.C9042qd.c) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r1 = r3.getAttributeValue(null, o.C9042qd.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        if (r1.isEmpty() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
        r8.deleteFile(o.C9042qd.a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(Context context) {
        String str;
        synchronized (f) {
            str = "";
            try {
                FileInputStream openFileInput = context.openFileInput(a);
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    int depth = newPullParser.getDepth();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (next == 3 && newPullParser.getDepth() <= depth) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } catch (IOException | XmlPullParserException unused) {
                    Log.w(d, "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                }
            } catch (FileNotFoundException unused2) {
                return "";
            }
        }
        return str;
    }
}
