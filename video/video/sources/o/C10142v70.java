package o;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;

/* renamed from: o.v70  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10142v70 extends ContentProvider {
    public DropDataContentProviderBoundaryInterface X;

    public final DropDataContentProviderBoundaryInterface a() {
        if (this.X == null) {
            DropDataContentProviderBoundaryInterface dropDataProvider = C7014iK2.d().getDropDataProvider();
            this.X = dropDataProvider;
            dropDataProvider.onCreate();
        }
        return this.X;
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        return a().call(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("delete method is not supported.");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return a().getType(uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert method is not supported.");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return a().openFile(this, uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return a().query(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("update method is not supported.");
    }
}
