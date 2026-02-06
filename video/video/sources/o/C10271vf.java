package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: o.vf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10271vf extends AbstractC7182j21<AssetFileDescriptor> {
    public C10271vf(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // o.InterfaceC9990uU
    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // o.AbstractC7182j21
    /* renamed from: h */
    public void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // o.AbstractC7182j21
    /* renamed from: i */
    public AssetFileDescriptor f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor g = g(uri);
        if (g != null) {
            return g;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    public C10271vf(ContentResolver contentResolver, Uri uri, boolean z) {
        super(contentResolver, uri, z);
    }
}
