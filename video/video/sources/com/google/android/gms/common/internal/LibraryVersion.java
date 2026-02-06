package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import o.InterfaceC5670cr1;

@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class LibraryVersion {
    public static final GmsLogger b = new GmsLogger("LibraryVersion", "");
    public static final LibraryVersion c = new LibraryVersion();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    @InterfaceC5670cr1
    @KeepForSdk
    public static LibraryVersion a() {
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @InterfaceC5670cr1
    @KeepForSdk
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String b(@InterfaceC5670cr1 String str) {
        Object obj;
        InputStream inputStream;
        Preconditions.m(str, "Please provide a valid libraryName");
        if (this.a.containsKey(str)) {
            return (String) this.a.get(str);
        }
        Properties properties = new Properties();
        Object obj2 = null;
        obj2 = 0;
        obj2 = 0;
        InputStream inputStream2 = null;
        try {
            try {
                inputStream = LibraryVersion.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (inputStream != null) {
                        properties.load(inputStream);
                        String property = properties.getProperty("version", null);
                        b.l("LibraryVersion", str + " version is " + property);
                        obj2 = property;
                    } else {
                        b.n("LibraryVersion", "Failed to get app version for libraryName: " + str);
                    }
                } catch (IOException e) {
                    e = e;
                    obj = obj2;
                    inputStream2 = inputStream;
                    b.f("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
                    Object obj3 = obj;
                    inputStream = inputStream2;
                    obj2 = obj3;
                    if (inputStream != null) {
                    }
                    if (obj2 == 0) {
                    }
                    this.a.put(str, obj2);
                    return obj2;
                } catch (Throwable th) {
                    th = th;
                    obj2 = inputStream;
                    if (obj2 != null) {
                        IOUtils.b(obj2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                obj = null;
            }
            if (inputStream != null) {
                IOUtils.b(inputStream);
            }
            if (obj2 == 0) {
                b.c("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                obj2 = "UNKNOWN";
            }
            this.a.put(str, obj2);
            return obj2;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
