package o;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class S40 {
    public static final String a = "tree";

    /* loaded from: classes.dex */
    public static final class a {
        public static final int a = 512;
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Uri a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        public static Uri b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        public static Uri c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        public static Uri d(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        public static Uri e(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        public static String f(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        public static Uri g(ContentResolver contentResolver, Uri uri, String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        public static boolean b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    public static Uri a(String str, String str2) {
        return b.a(str, str2);
    }

    public static Uri b(Uri uri, String str) {
        return b.b(uri, str);
    }

    public static Uri c(String str, String str2) {
        return DocumentsContract.buildDocumentUri(str, str2);
    }

    public static Uri d(Uri uri, String str) {
        return b.c(uri, str);
    }

    public static Uri e(String str, String str2) {
        return b.d(str, str2);
    }

    public static Uri f(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
        return b.e(contentResolver, uri, str, str2);
    }

    public static String g(Uri uri) {
        return DocumentsContract.getDocumentId(uri);
    }

    public static String h(Uri uri) {
        return b.f(uri);
    }

    public static boolean i(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public static boolean j(Uri uri) {
        return c.a(uri);
    }

    public static boolean k(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
        return c.b(contentResolver, uri, uri2);
    }

    public static Uri l(ContentResolver contentResolver, Uri uri, String str) throws FileNotFoundException {
        return b.g(contentResolver, uri, str);
    }
}
