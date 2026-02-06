package org.chromium.support_lib_boundary;

import android.content.ContentProvider;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes4.dex */
public interface DropDataContentProviderBoundaryInterface {
    Uri cache(byte[] bArr, String str, String str2);

    Bundle call(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 Bundle bundle);

    String[] getStreamTypes(@InterfaceC5670cr1 Uri uri, @InterfaceC5670cr1 String str);

    String getType(@InterfaceC5670cr1 Uri uri);

    boolean onCreate();

    void onDragEnd(boolean z);

    ParcelFileDescriptor openFile(@InterfaceC5670cr1 ContentProvider contentProvider, @InterfaceC5670cr1 Uri uri) throws FileNotFoundException;

    Cursor query(@InterfaceC5670cr1 Uri uri, @InterfaceC11300zs1 String[] strArr, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String[] strArr2, @InterfaceC11300zs1 String str2);

    void setClearCachedDataIntervalMs(int i);
}
