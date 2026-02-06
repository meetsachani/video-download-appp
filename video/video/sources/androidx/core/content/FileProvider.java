package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import o.C10201vM;
import o.C2691Ct1;
import o.FN1;
import org.jsoup.helper.HttpConnection;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    public static final String a1 = "android.support.FILE_PROVIDER_PATHS";
    public static final String b1 = "root-path";
    public static final String c1 = "files-path";
    public static final String d1 = "cache-path";
    public static final String e1 = "external-path";
    public static final String f1 = "external-files-path";
    public static final String g1 = "external-cache-path";
    public static final String h1 = "external-media-path";
    public static final String i1 = "name";
    public static final String j1 = "path";
    public static final String k1 = "displayName";
    public final Object X;
    public final int Y;
    public b Y0;
    public String Z;
    public static final String[] Z0 = {"_display_name", "_size"};
    public static final File l1 = new File(RemoteSettings.i);
    public static final HashMap<String, b> m1 = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {
        public static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        Uri a(File file);

        File b(Uri uri);
    }

    /* loaded from: classes.dex */
    public static class c implements b {
        public final String a;
        public final HashMap<String, File> b = new HashMap<>();

        public c(String str) {
            this.a = str;
        }

        @Override // androidx.core.content.FileProvider.b
        public Uri a(File file) {
            String substring;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (d(canonicalPath, path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    if (path2.endsWith(RemoteSettings.i)) {
                        substring = canonicalPath.substring(path2.length());
                    } else {
                        substring = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme("content").authority(this.a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(substring, RemoteSettings.i)).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.b
        public File b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            if (indexOf != -1) {
                String decode = Uri.decode(encodedPath.substring(1, indexOf));
                String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
                File file = this.b.get(decode);
                if (file != null) {
                    File file2 = new File(file, decode2);
                    try {
                        File canonicalFile = file2.getCanonicalFile();
                        if (d(canonicalFile.getPath(), file.getPath())) {
                            return canonicalFile;
                        }
                        throw new SecurityException("Resolved path jumped beyond configured root");
                    } catch (IOException unused) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                    }
                }
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            throw new IllegalArgumentException("Unable to find path from root: " + uri);
        }

        public void c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.b.put(str, file.getCanonicalFile());
                    return;
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                }
            }
            throw new IllegalArgumentException("Name must not be empty");
        }

        public final boolean d(String str, String str2) {
            String l = FileProvider.l(str);
            String l2 = FileProvider.l(str2);
            return l.startsWith(l2 + '/');
        }
    }

    public FileProvider() {
        this(0);
    }

    public static File b(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static Object[] c(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    public static String[] d(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    public static XmlResourceParser e(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt(a1, i);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), a1);
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    public static b g(Context context, String str, int i) {
        b bVar;
        HashMap<String, b> hashMap = m1;
        synchronized (hashMap) {
            try {
                bVar = hashMap.get(str);
                if (bVar == null) {
                    try {
                        try {
                            bVar = k(context, str, i);
                            hashMap.put(str, bVar);
                        } catch (XmlPullParserException e) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                        }
                    } catch (IOException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static Uri h(Context context, String str, File file) {
        return g(context, str, 0).a(file);
    }

    public static Uri i(Context context, String str, File file, String str2) {
        return h(context, str, file).buildUpon().appendQueryParameter(k1, str2).build();
    }

    public static int j(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                return 704643072;
            }
            if (FN1.c1.equals(str)) {
                return 939524096;
            }
            if ("rwt".equals(str)) {
                return 1006632960;
            }
            throw new IllegalArgumentException("Invalid mode: " + str);
        }
        return 738197504;
    }

    public static b k(Context context, String str, int i) throws IOException, XmlPullParserException {
        c cVar = new c(str);
        XmlResourceParser e = e(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = e.next();
            if (next != 1) {
                if (next == 2) {
                    String name = e.getName();
                    File file = null;
                    String attributeValue = e.getAttributeValue(null, "name");
                    String attributeValue2 = e.getAttributeValue(null, "path");
                    if (b1.equals(name)) {
                        file = l1;
                    } else if (c1.equals(name)) {
                        file = context.getFilesDir();
                    } else if (d1.equals(name)) {
                        file = context.getCacheDir();
                    } else if (e1.equals(name)) {
                        file = Environment.getExternalStorageDirectory();
                    } else if (f1.equals(name)) {
                        File[] n = C10201vM.n(context, null);
                        if (n.length > 0) {
                            file = n[0];
                        }
                    } else if (g1.equals(name)) {
                        File[] m = C10201vM.m(context);
                        if (m.length > 0) {
                            file = m[0];
                        }
                    } else if (h1.equals(name)) {
                        File[] a2 = a.a(context);
                        if (a2.length > 0) {
                            file = a2[0];
                        }
                    }
                    if (file != null) {
                        cVar.c(attributeValue, b(file, attributeValue2));
                    }
                }
            } else {
                return cVar;
            }
        }
    }

    public static String l(String str) {
        if (str.length() > 0 && str.charAt(str.length() - 1) == '/') {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority;
                if (str != null && !str.trim().isEmpty()) {
                    String str2 = providerInfo.authority.split(";")[0];
                    synchronized (this.X) {
                        this.Z = str2;
                    }
                    HashMap<String, b> hashMap = m1;
                    synchronized (hashMap) {
                        hashMap.remove(str2);
                    }
                    return;
                }
                throw new SecurityException("Provider must have a non-empty authority");
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return f().b(uri).delete() ? 1 : 0;
    }

    public final b f() {
        b bVar;
        synchronized (this.X) {
            try {
                C2691Ct1.e(this.Z, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.Y0 == null) {
                    this.Y0 = g(getContext(), this.Z, this.Y);
                }
                bVar = this.Y0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File b2 = f().b(uri);
        int lastIndexOf = b2.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b2.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return HttpConnection.l;
        }
        return HttpConnection.l;
    }

    public String getTypeAnonymous(Uri uri) {
        return HttpConnection.l;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(f().b(uri), j(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        String str3;
        File b2 = f().b(uri);
        String queryParameter = uri.getQueryParameter(k1);
        if (strArr == null) {
            strArr = Z0;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    str3 = b2.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i2] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(b2.length());
            }
            i2 = i;
        }
        String[] d = d(strArr3, i2);
        Object[] c2 = c(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(d, 1);
        matrixCursor.addRow(c2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public FileProvider(int i) {
        this.X = new Object();
        this.Y = i;
    }
}
