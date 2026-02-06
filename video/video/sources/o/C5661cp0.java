package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: o.cp0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5661cp0 extends AbstractC7182j21<ParcelFileDescriptor> {
    public C5661cp0(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // o.InterfaceC9990uU
    public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    @Override // o.AbstractC7182j21
    /* renamed from: h */
    public void c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // o.AbstractC7182j21
    /* renamed from: i */
    public ParcelFileDescriptor f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor g = g(uri);
        if (g != null) {
            return g.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    public C5661cp0(ContentResolver contentResolver, Uri uri, boolean z) {
        super(contentResolver, uri, z);
    }
}
