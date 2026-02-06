package o;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: o.wf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10517wf {
    public static final String b = "text/plain";
    public Context a;

    public C10517wf(Context context) {
        this.a = context;
    }

    public static String a(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.endsWith(RemoteSettings.i)) {
            return canonicalPath + RemoteSettings.i;
        }
        return canonicalPath;
    }

    public static File b(File file, String str) throws IOException {
        String a = a(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(a)) {
            return new File(canonicalPath);
        }
        return null;
    }

    public static File c(Context context) {
        return C3701Na.e(context);
    }

    public static String f(String str) {
        String a = C4228Sj1.a(str);
        if (a == null) {
            return "text/plain";
        }
        return a;
    }

    public static InputStream g(String str, InputStream inputStream) throws IOException {
        if (str.endsWith(".svgz")) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    public static InputStream i(File file) throws FileNotFoundException, IOException {
        return g(file.getPath(), new FileInputStream(file));
    }

    public static String k(String str) {
        if (str.length() > 1 && str.charAt(0) == '/') {
            return str.substring(1);
        }
        return str;
    }

    public final int d(String str, String str2) {
        return this.a.getResources().getIdentifier(str2, str, this.a.getPackageName());
    }

    public final int e(int i) {
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(i, typedValue, true);
        return typedValue.type;
    }

    public InputStream h(String str) throws IOException {
        String k = k(str);
        return g(k, this.a.getAssets().open(k, 2));
    }

    public InputStream j(String str) throws Resources.NotFoundException, IOException {
        String k = k(str);
        String[] split = k.split(RemoteSettings.i, -1);
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            int lastIndexOf = str3.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str3 = str3.substring(0, lastIndexOf);
            }
            int d = d(str2, str3);
            int e = e(d);
            if (e == 3) {
                return g(k, this.a.getResources().openRawResource(d));
            }
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", k, Integer.valueOf(e)));
        }
        throw new IllegalArgumentException("Incorrect resource path: " + k);
    }
}
