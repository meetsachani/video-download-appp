package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzfox {
    public static boolean a(int i) {
        int i2 = i - 1;
        return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(Context context, zzfnx zzfnxVar) {
        int i;
        FileInputStream fileInputStream;
        byte[] bArr;
        String str;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            zzfnxVar.b(5017, "No lib/");
        } else {
            File[] listFiles = file.listFiles(new zzgat(Pattern.compile(".*\\.so$", 2)));
            if (listFiles != null && listFiles.length != 0) {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    bArr = new byte[20];
                } catch (IOException e) {
                    d(null, e.toString(), context, zzfnxVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        d(bArr, null, context, zzfnxVar);
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s != 3) {
                            if (s != 40) {
                                if (s != 62) {
                                    if (s != 183) {
                                        if (s != 243) {
                                            d(bArr, null, context, zzfnxVar);
                                            i = 1;
                                        } else {
                                            i = 8;
                                        }
                                    } else {
                                        i = 6;
                                    }
                                } else {
                                    i = 7;
                                }
                            } else {
                                i = 3;
                            }
                        } else {
                            i = 5;
                        }
                        fileInputStream.close();
                        if (i == 1000) {
                            String c = c(context, zzfnxVar);
                            if (TextUtils.isEmpty(c)) {
                                d(null, "Empty dev arch", context, zzfnxVar);
                            } else if (c.equalsIgnoreCase("i686") || c.equalsIgnoreCase("x86")) {
                                i = 5;
                            } else if (c.equalsIgnoreCase("x86_64")) {
                                i = 7;
                            } else if (c.equalsIgnoreCase("arm64-v8a")) {
                                i = 6;
                            } else if (c.equalsIgnoreCase("armeabi-v7a") || c.equalsIgnoreCase("armv71")) {
                                i = 3;
                            } else if (c.equalsIgnoreCase("riscv64")) {
                                i = 8;
                            } else {
                                d(null, c, context, zzfnxVar);
                            }
                            i = 1;
                        }
                        if (i != 1) {
                            if (i != 3) {
                                if (i != 5) {
                                    if (i != 6) {
                                        if (i != 7) {
                                            if (i != 8) {
                                                str = "null";
                                            } else {
                                                str = "RISCV64";
                                            }
                                        } else {
                                            str = "X86_64";
                                        }
                                    } else {
                                        str = "ARM64";
                                    }
                                } else {
                                    str = "X86";
                                }
                            } else {
                                str = "ARM7";
                            }
                        } else {
                            str = "UNSUPPORTED";
                        }
                        zzfnxVar.b(5018, str);
                        return i;
                    }
                }
                fileInputStream.close();
                i = 1;
                if (i == 1000) {
                }
                if (i != 1) {
                }
                zzfnxVar.b(5018, str);
                return i;
            }
            zzfnxVar.b(5017, "No .so");
        }
        i = 1000;
        if (i == 1000) {
        }
        if (i != 1) {
        }
        zzfnxVar.b(5018, str);
        return i;
    }

    public static final String c(Context context, zzfnx zzfnxVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String e = zzfvs.OS_ARCH.e();
        if (!TextUtils.isEmpty(e) && hashSet.contains(e)) {
            return e;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e2) {
            zzfnxVar.c(2024, 0L, e2);
        } catch (NoSuchFieldException e3) {
            zzfnxVar.c(2024, 0L, e3);
        }
        String str = Build.CPU_ABI;
        if (str != null) {
            return str;
        }
        return Build.CPU_ABI2;
    }

    public static final void d(byte[] bArr, String str, Context context, zzfnx zzfnxVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(zzfvs.OS_ARCH.e());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfnxVar.b(4007, sb.toString());
    }
}
