package o;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

@ES1(30)
/* renamed from: o.mG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7983mG {
    public static final String a = "ColorResLoaderCreator";

    @InterfaceC11300zs1
    public static ResourcesLoader a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Map<Integer, Integer> map) {
        FileDescriptor fileDescriptor;
        ResourcesProvider loadFromTable;
        try {
            byte[] j = C8470oG.j(context, map);
            Log.i(a, "Table created, length: " + j.length);
            if (j.length != 0) {
                try {
                    fileDescriptor = android.system.Os.memfd_create("temp.arsc", 0);
                } catch (Throwable th) {
                    th = th;
                    fileDescriptor = null;
                }
                try {
                    if (fileDescriptor == null) {
                        Log.w(a, "Cannot create memory file descriptor.");
                        if (fileDescriptor == null) {
                            return null;
                        }
                        android.system.Os.close(fileDescriptor);
                        return null;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                    fileOutputStream.write(j);
                    ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
                    try {
                        C7722lG.a();
                        ResourcesLoader a2 = C7479kG.a();
                        loadFromTable = ResourcesProvider.loadFromTable(dup, null);
                        a2.addProvider(loadFromTable);
                        if (dup != null) {
                            dup.close();
                        }
                        fileOutputStream.close();
                        android.system.Os.close(fileDescriptor);
                        return a2;
                    } catch (Throwable th2) {
                        if (dup != null) {
                            try {
                                dup.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (fileDescriptor != null) {
                        android.system.Os.close(fileDescriptor);
                    }
                    throw th;
                }
            }
            return null;
        } catch (Exception e) {
            Log.e(a, "Failed to create the ColorResourcesTableCreator.", e);
            return null;
        }
    }
}
