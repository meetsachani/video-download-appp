package o;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.helper.HttpConnection;

/* renamed from: o.jO1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7270jO1 extends Q40 {
    public File c;

    public C7270jO1(Q40 q40, File file) {
        super(q40);
        this.c = file;
    }

    public static boolean w(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= w(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    z = false;
                }
            }
        }
        return z;
    }

    public static String x(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(lastIndexOf + 1).toLowerCase());
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return HttpConnection.l;
        }
        return HttpConnection.l;
    }

    @Override // o.Q40
    public boolean a() {
        return this.c.canRead();
    }

    @Override // o.Q40
    public boolean b() {
        return this.c.canWrite();
    }

    @Override // o.Q40
    public Q40 c(String str) {
        File file = new File(this.c, str);
        if (!file.isDirectory() && !file.mkdir()) {
            return null;
        }
        return new C7270jO1(this, file);
    }

    @Override // o.Q40
    public Q40 d(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + UE.h + extensionFromMimeType;
        }
        File file = new File(this.c, str2);
        try {
            if (!file.createNewFile()) {
                return null;
            }
            return new C7270jO1(this, file);
        } catch (IOException e) {
            Log.w("DocumentFile", "Failed to createFile: " + e);
            return null;
        }
    }

    @Override // o.Q40
    public boolean e() {
        w(this.c);
        return this.c.delete();
    }

    @Override // o.Q40
    public boolean f() {
        return this.c.exists();
    }

    @Override // o.Q40
    public String k() {
        return this.c.getName();
    }

    @Override // o.Q40
    public String m() {
        if (this.c.isDirectory()) {
            return null;
        }
        return x(this.c.getName());
    }

    @Override // o.Q40
    public Uri n() {
        return Uri.fromFile(this.c);
    }

    @Override // o.Q40
    public boolean o() {
        return this.c.isDirectory();
    }

    @Override // o.Q40
    public boolean q() {
        return this.c.isFile();
    }

    @Override // o.Q40
    public boolean r() {
        return false;
    }

    @Override // o.Q40
    public long s() {
        return this.c.lastModified();
    }

    @Override // o.Q40
    public long t() {
        return this.c.length();
    }

    @Override // o.Q40
    public Q40[] u() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.c.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                arrayList.add(new C7270jO1(this, file));
            }
        }
        return (Q40[]) arrayList.toArray(new Q40[0]);
    }

    @Override // o.Q40
    public boolean v(String str) {
        File file = new File(this.c.getParentFile(), str);
        if (this.c.renameTo(file)) {
            this.c = file;
            return true;
        }
        return false;
    }
}
