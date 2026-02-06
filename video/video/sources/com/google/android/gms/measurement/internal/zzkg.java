package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzps;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.InterfaceC10697xN2;
import o.InterfaceC5670cr1;
import o.M82;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkg extends zzmo {
    public zzkg(zzmp zzmpVar) {
        super(zzmpVar);
    }

    private static String c(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final boolean x() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x035e A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, SecurityException -> 0x0234, SecurityException -> 0x01c0, blocks: (B:13:0x0069, B:15:0x0073, B:20:0x008d, B:22:0x0093, B:25:0x00aa, B:27:0x00c3, B:28:0x00ca, B:30:0x00d4, B:31:0x00e1, B:33:0x00eb, B:34:0x00f8, B:36:0x0103, B:37:0x010b, B:39:0x0128, B:43:0x0135, B:45:0x0151, B:47:0x015f, B:49:0x0165, B:51:0x016b, B:52:0x016e, B:54:0x017b, B:56:0x0181, B:59:0x0195, B:61:0x019f, B:62:0x01b2, B:64:0x01b6, B:70:0x01de, B:71:0x0210, B:73:0x0216, B:75:0x021c, B:79:0x0237, B:81:0x0241, B:82:0x024e, B:83:0x025e, B:85:0x0264, B:92:0x027d, B:95:0x02a4, B:96:0x02ab, B:98:0x02b1, B:99:0x02e9, B:101:0x02fd, B:103:0x0309, B:104:0x030e, B:106:0x035e, B:107:0x036e, B:109:0x037a, B:112:0x03bb, B:113:0x03f0, B:115:0x03f6, B:117:0x040c, B:118:0x0417, B:120:0x0463, B:121:0x0472, B:123:0x047a, B:124:0x047d, B:126:0x0485, B:129:0x048e, B:131:0x0498, B:134:0x04a6, B:135:0x04a9, B:137:0x04d8, B:138:0x04e1, B:128:0x048b, B:111:0x03a7, B:94:0x0281, B:145:0x0533, B:66:0x01c1, B:40:0x012c, B:42:0x0132), top: B:152:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037a A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, SecurityException -> 0x0234, SecurityException -> 0x01c0, blocks: (B:13:0x0069, B:15:0x0073, B:20:0x008d, B:22:0x0093, B:25:0x00aa, B:27:0x00c3, B:28:0x00ca, B:30:0x00d4, B:31:0x00e1, B:33:0x00eb, B:34:0x00f8, B:36:0x0103, B:37:0x010b, B:39:0x0128, B:43:0x0135, B:45:0x0151, B:47:0x015f, B:49:0x0165, B:51:0x016b, B:52:0x016e, B:54:0x017b, B:56:0x0181, B:59:0x0195, B:61:0x019f, B:62:0x01b2, B:64:0x01b6, B:70:0x01de, B:71:0x0210, B:73:0x0216, B:75:0x021c, B:79:0x0237, B:81:0x0241, B:82:0x024e, B:83:0x025e, B:85:0x0264, B:92:0x027d, B:95:0x02a4, B:96:0x02ab, B:98:0x02b1, B:99:0x02e9, B:101:0x02fd, B:103:0x0309, B:104:0x030e, B:106:0x035e, B:107:0x036e, B:109:0x037a, B:112:0x03bb, B:113:0x03f0, B:115:0x03f6, B:117:0x040c, B:118:0x0417, B:120:0x0463, B:121:0x0472, B:123:0x047a, B:124:0x047d, B:126:0x0485, B:129:0x048e, B:131:0x0498, B:134:0x04a6, B:135:0x04a9, B:137:0x04d8, B:138:0x04e1, B:128:0x048b, B:111:0x03a7, B:94:0x0281, B:145:0x0533, B:66:0x01c1, B:40:0x012c, B:42:0x0132), top: B:152:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03a7 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, SecurityException -> 0x0234, SecurityException -> 0x01c0, blocks: (B:13:0x0069, B:15:0x0073, B:20:0x008d, B:22:0x0093, B:25:0x00aa, B:27:0x00c3, B:28:0x00ca, B:30:0x00d4, B:31:0x00e1, B:33:0x00eb, B:34:0x00f8, B:36:0x0103, B:37:0x010b, B:39:0x0128, B:43:0x0135, B:45:0x0151, B:47:0x015f, B:49:0x0165, B:51:0x016b, B:52:0x016e, B:54:0x017b, B:56:0x0181, B:59:0x0195, B:61:0x019f, B:62:0x01b2, B:64:0x01b6, B:70:0x01de, B:71:0x0210, B:73:0x0216, B:75:0x021c, B:79:0x0237, B:81:0x0241, B:82:0x024e, B:83:0x025e, B:85:0x0264, B:92:0x027d, B:95:0x02a4, B:96:0x02ab, B:98:0x02b1, B:99:0x02e9, B:101:0x02fd, B:103:0x0309, B:104:0x030e, B:106:0x035e, B:107:0x036e, B:109:0x037a, B:112:0x03bb, B:113:0x03f0, B:115:0x03f6, B:117:0x040c, B:118:0x0417, B:120:0x0463, B:121:0x0472, B:123:0x047a, B:124:0x047d, B:126:0x0485, B:129:0x048e, B:131:0x0498, B:134:0x04a6, B:135:0x04a9, B:137:0x04d8, B:138:0x04e1, B:128:0x048b, B:111:0x03a7, B:94:0x0281, B:145:0x0533, B:66:0x01c1, B:40:0x012c, B:42:0x0132), top: B:152:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03f6 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, SecurityException -> 0x0234, SecurityException -> 0x01c0, blocks: (B:13:0x0069, B:15:0x0073, B:20:0x008d, B:22:0x0093, B:25:0x00aa, B:27:0x00c3, B:28:0x00ca, B:30:0x00d4, B:31:0x00e1, B:33:0x00eb, B:34:0x00f8, B:36:0x0103, B:37:0x010b, B:39:0x0128, B:43:0x0135, B:45:0x0151, B:47:0x015f, B:49:0x0165, B:51:0x016b, B:52:0x016e, B:54:0x017b, B:56:0x0181, B:59:0x0195, B:61:0x019f, B:62:0x01b2, B:64:0x01b6, B:70:0x01de, B:71:0x0210, B:73:0x0216, B:75:0x021c, B:79:0x0237, B:81:0x0241, B:82:0x024e, B:83:0x025e, B:85:0x0264, B:92:0x027d, B:95:0x02a4, B:96:0x02ab, B:98:0x02b1, B:99:0x02e9, B:101:0x02fd, B:103:0x0309, B:104:0x030e, B:106:0x035e, B:107:0x036e, B:109:0x037a, B:112:0x03bb, B:113:0x03f0, B:115:0x03f6, B:117:0x040c, B:118:0x0417, B:120:0x0463, B:121:0x0472, B:123:0x047a, B:124:0x047d, B:126:0x0485, B:129:0x048e, B:131:0x0498, B:134:0x04a6, B:135:0x04a9, B:137:0x04d8, B:138:0x04e1, B:128:0x048b, B:111:0x03a7, B:94:0x0281, B:145:0x0533, B:66:0x01c1, B:40:0x012c, B:42:0x0132), top: B:152:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0463 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, SecurityException -> 0x0234, SecurityException -> 0x01c0, blocks: (B:13:0x0069, B:15:0x0073, B:20:0x008d, B:22:0x0093, B:25:0x00aa, B:27:0x00c3, B:28:0x00ca, B:30:0x00d4, B:31:0x00e1, B:33:0x00eb, B:34:0x00f8, B:36:0x0103, B:37:0x010b, B:39:0x0128, B:43:0x0135, B:45:0x0151, B:47:0x015f, B:49:0x0165, B:51:0x016b, B:52:0x016e, B:54:0x017b, B:56:0x0181, B:59:0x0195, B:61:0x019f, B:62:0x01b2, B:64:0x01b6, B:70:0x01de, B:71:0x0210, B:73:0x0216, B:75:0x021c, B:79:0x0237, B:81:0x0241, B:82:0x024e, B:83:0x025e, B:85:0x0264, B:92:0x027d, B:95:0x02a4, B:96:0x02ab, B:98:0x02b1, B:99:0x02e9, B:101:0x02fd, B:103:0x0309, B:104:0x030e, B:106:0x035e, B:107:0x036e, B:109:0x037a, B:112:0x03bb, B:113:0x03f0, B:115:0x03f6, B:117:0x040c, B:118:0x0417, B:120:0x0463, B:121:0x0472, B:123:0x047a, B:124:0x047d, B:126:0x0485, B:129:0x048e, B:131:0x0498, B:134:0x04a6, B:135:0x04a9, B:137:0x04d8, B:138:0x04e1, B:128:0x048b, B:111:0x03a7, B:94:0x0281, B:145:0x0533, B:66:0x01c1, B:40:0x012c, B:42:0x0132), top: B:152:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x047a A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, SecurityException -> 0x0234, SecurityException -> 0x01c0, blocks: (B:13:0x0069, B:15:0x0073, B:20:0x008d, B:22:0x0093, B:25:0x00aa, B:27:0x00c3, B:28:0x00ca, B:30:0x00d4, B:31:0x00e1, B:33:0x00eb, B:34:0x00f8, B:36:0x0103, B:37:0x010b, B:39:0x0128, B:43:0x0135, B:45:0x0151, B:47:0x015f, B:49:0x0165, B:51:0x016b, B:52:0x016e, B:54:0x017b, B:56:0x0181, B:59:0x0195, B:61:0x019f, B:62:0x01b2, B:64:0x01b6, B:70:0x01de, B:71:0x0210, B:73:0x0216, B:75:0x021c, B:79:0x0237, B:81:0x0241, B:82:0x024e, B:83:0x025e, B:85:0x0264, B:92:0x027d, B:95:0x02a4, B:96:0x02ab, B:98:0x02b1, B:99:0x02e9, B:101:0x02fd, B:103:0x0309, B:104:0x030e, B:106:0x035e, B:107:0x036e, B:109:0x037a, B:112:0x03bb, B:113:0x03f0, B:115:0x03f6, B:117:0x040c, B:118:0x0417, B:120:0x0463, B:121:0x0472, B:123:0x047a, B:124:0x047d, B:126:0x0485, B:129:0x048e, B:131:0x0498, B:134:0x04a6, B:135:0x04a9, B:137:0x04d8, B:138:0x04e1, B:128:0x048b, B:111:0x03a7, B:94:0x0281, B:145:0x0533, B:66:0x01c1, B:40:0x012c, B:42:0x0132), top: B:152:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0485 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, SecurityException -> 0x0234, SecurityException -> 0x01c0, blocks: (B:13:0x0069, B:15:0x0073, B:20:0x008d, B:22:0x0093, B:25:0x00aa, B:27:0x00c3, B:28:0x00ca, B:30:0x00d4, B:31:0x00e1, B:33:0x00eb, B:34:0x00f8, B:36:0x0103, B:37:0x010b, B:39:0x0128, B:43:0x0135, B:45:0x0151, B:47:0x015f, B:49:0x0165, B:51:0x016b, B:52:0x016e, B:54:0x017b, B:56:0x0181, B:59:0x0195, B:61:0x019f, B:62:0x01b2, B:64:0x01b6, B:70:0x01de, B:71:0x0210, B:73:0x0216, B:75:0x021c, B:79:0x0237, B:81:0x0241, B:82:0x024e, B:83:0x025e, B:85:0x0264, B:92:0x027d, B:95:0x02a4, B:96:0x02ab, B:98:0x02b1, B:99:0x02e9, B:101:0x02fd, B:103:0x0309, B:104:0x030e, B:106:0x035e, B:107:0x036e, B:109:0x037a, B:112:0x03bb, B:113:0x03f0, B:115:0x03f6, B:117:0x040c, B:118:0x0417, B:120:0x0463, B:121:0x0472, B:123:0x047a, B:124:0x047d, B:126:0x0485, B:129:0x048e, B:131:0x0498, B:134:0x04a6, B:135:0x04a9, B:137:0x04d8, B:138:0x04e1, B:128:0x048b, B:111:0x03a7, B:94:0x0281, B:145:0x0533, B:66:0x01c1, B:40:0x012c, B:42:0x0132), top: B:152:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04d8 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, SecurityException -> 0x0234, SecurityException -> 0x01c0, blocks: (B:13:0x0069, B:15:0x0073, B:20:0x008d, B:22:0x0093, B:25:0x00aa, B:27:0x00c3, B:28:0x00ca, B:30:0x00d4, B:31:0x00e1, B:33:0x00eb, B:34:0x00f8, B:36:0x0103, B:37:0x010b, B:39:0x0128, B:43:0x0135, B:45:0x0151, B:47:0x015f, B:49:0x0165, B:51:0x016b, B:52:0x016e, B:54:0x017b, B:56:0x0181, B:59:0x0195, B:61:0x019f, B:62:0x01b2, B:64:0x01b6, B:70:0x01de, B:71:0x0210, B:73:0x0216, B:75:0x021c, B:79:0x0237, B:81:0x0241, B:82:0x024e, B:83:0x025e, B:85:0x0264, B:92:0x027d, B:95:0x02a4, B:96:0x02ab, B:98:0x02b1, B:99:0x02e9, B:101:0x02fd, B:103:0x0309, B:104:0x030e, B:106:0x035e, B:107:0x036e, B:109:0x037a, B:112:0x03bb, B:113:0x03f0, B:115:0x03f6, B:117:0x040c, B:118:0x0417, B:120:0x0463, B:121:0x0472, B:123:0x047a, B:124:0x047d, B:126:0x0485, B:129:0x048e, B:131:0x0498, B:134:0x04a6, B:135:0x04a9, B:137:0x04d8, B:138:0x04e1, B:128:0x048b, B:111:0x03a7, B:94:0x0281, B:145:0x0533, B:66:0x01c1, B:40:0x012c, B:42:0x0132), top: B:152:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0241 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, SecurityException -> 0x0234, SecurityException -> 0x01c0, blocks: (B:13:0x0069, B:15:0x0073, B:20:0x008d, B:22:0x0093, B:25:0x00aa, B:27:0x00c3, B:28:0x00ca, B:30:0x00d4, B:31:0x00e1, B:33:0x00eb, B:34:0x00f8, B:36:0x0103, B:37:0x010b, B:39:0x0128, B:43:0x0135, B:45:0x0151, B:47:0x015f, B:49:0x0165, B:51:0x016b, B:52:0x016e, B:54:0x017b, B:56:0x0181, B:59:0x0195, B:61:0x019f, B:62:0x01b2, B:64:0x01b6, B:70:0x01de, B:71:0x0210, B:73:0x0216, B:75:0x021c, B:79:0x0237, B:81:0x0241, B:82:0x024e, B:83:0x025e, B:85:0x0264, B:92:0x027d, B:95:0x02a4, B:96:0x02ab, B:98:0x02b1, B:99:0x02e9, B:101:0x02fd, B:103:0x0309, B:104:0x030e, B:106:0x035e, B:107:0x036e, B:109:0x037a, B:112:0x03bb, B:113:0x03f0, B:115:0x03f6, B:117:0x040c, B:118:0x0417, B:120:0x0463, B:121:0x0472, B:123:0x047a, B:124:0x047d, B:126:0x0485, B:129:0x048e, B:131:0x0498, B:134:0x04a6, B:135:0x04a9, B:137:0x04d8, B:138:0x04e1, B:128:0x048b, B:111:0x03a7, B:94:0x0281, B:145:0x0533, B:66:0x01c1, B:40:0x012c, B:42:0x0132), top: B:152:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0264 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, SecurityException -> 0x0234, SecurityException -> 0x01c0, blocks: (B:13:0x0069, B:15:0x0073, B:20:0x008d, B:22:0x0093, B:25:0x00aa, B:27:0x00c3, B:28:0x00ca, B:30:0x00d4, B:31:0x00e1, B:33:0x00eb, B:34:0x00f8, B:36:0x0103, B:37:0x010b, B:39:0x0128, B:43:0x0135, B:45:0x0151, B:47:0x015f, B:49:0x0165, B:51:0x016b, B:52:0x016e, B:54:0x017b, B:56:0x0181, B:59:0x0195, B:61:0x019f, B:62:0x01b2, B:64:0x01b6, B:70:0x01de, B:71:0x0210, B:73:0x0216, B:75:0x021c, B:79:0x0237, B:81:0x0241, B:82:0x024e, B:83:0x025e, B:85:0x0264, B:92:0x027d, B:95:0x02a4, B:96:0x02ab, B:98:0x02b1, B:99:0x02e9, B:101:0x02fd, B:103:0x0309, B:104:0x030e, B:106:0x035e, B:107:0x036e, B:109:0x037a, B:112:0x03bb, B:113:0x03f0, B:115:0x03f6, B:117:0x040c, B:118:0x0417, B:120:0x0463, B:121:0x0472, B:123:0x047a, B:124:0x047d, B:126:0x0485, B:129:0x048e, B:131:0x0498, B:134:0x04a6, B:135:0x04a9, B:137:0x04d8, B:138:0x04e1, B:128:0x048b, B:111:0x03a7, B:94:0x0281, B:145:0x0533, B:66:0x01c1, B:40:0x012c, B:42:0x0132), top: B:152:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b1 A[Catch: all -> 0x008a, LOOP:1: B:96:0x02ab->B:98:0x02b1, LOOP_END, TryCatch #1 {all -> 0x008a, SecurityException -> 0x0234, SecurityException -> 0x01c0, blocks: (B:13:0x0069, B:15:0x0073, B:20:0x008d, B:22:0x0093, B:25:0x00aa, B:27:0x00c3, B:28:0x00ca, B:30:0x00d4, B:31:0x00e1, B:33:0x00eb, B:34:0x00f8, B:36:0x0103, B:37:0x010b, B:39:0x0128, B:43:0x0135, B:45:0x0151, B:47:0x015f, B:49:0x0165, B:51:0x016b, B:52:0x016e, B:54:0x017b, B:56:0x0181, B:59:0x0195, B:61:0x019f, B:62:0x01b2, B:64:0x01b6, B:70:0x01de, B:71:0x0210, B:73:0x0216, B:75:0x021c, B:79:0x0237, B:81:0x0241, B:82:0x024e, B:83:0x025e, B:85:0x0264, B:92:0x027d, B:95:0x02a4, B:96:0x02ab, B:98:0x02b1, B:99:0x02e9, B:101:0x02fd, B:103:0x0309, B:104:0x030e, B:106:0x035e, B:107:0x036e, B:109:0x037a, B:112:0x03bb, B:113:0x03f0, B:115:0x03f6, B:117:0x040c, B:118:0x0417, B:120:0x0463, B:121:0x0472, B:123:0x047a, B:124:0x047d, B:126:0x0485, B:129:0x048e, B:131:0x0498, B:134:0x04a6, B:135:0x04a9, B:137:0x04d8, B:138:0x04e1, B:128:0x048b, B:111:0x03a7, B:94:0x0281, B:145:0x0533, B:66:0x01c1, B:40:0x012c, B:42:0x0132), top: B:152:0x0069 }] */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] y(@InterfaceC5670cr1 zzbg zzbgVar, @M82(min = 1) String str) {
        zzih zzihVar;
        List<zzne> M0;
        Iterator<zzne> it;
        zzne zzneVar;
        int i;
        zzbc C0;
        zzfi.zzi.zza zzaVar;
        Bundle bundle;
        zzh zzhVar;
        zzfi.zzj.zza zzaVar2;
        byte[] bArr;
        zzbc a;
        long j;
        zzfi.zze.zza z;
        Iterator<String> it2;
        zzfi.zzj.zza zzaVar3;
        int i2;
        long m0;
        String m;
        n();
        this.a.Q();
        Preconditions.r(zzbgVar);
        Preconditions.l(str);
        if (!d().B(str, zzbi.f0)) {
            j().F().b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        } else if (!"_iap".equals(zzbgVar.X) && !"_iapx".equals(zzbgVar.X)) {
            j().F().c("Generating a payload for this event is not available. package_name, event_name", str, zzbgVar.X);
            return null;
        } else {
            zzfi.zzi.zza I = zzfi.zzi.I();
            q().Q0();
            try {
                zzh D0 = q().D0(str);
                if (D0 == null) {
                    j().F().b("Log and bundle not available. package_name", str);
                    return new byte[0];
                } else if (!D0.r()) {
                    j().F().b("Log and bundle disabled. package_name", str);
                    return new byte[0];
                } else {
                    zzfi.zzj.zza V0 = zzfi.zzj.E3().n0(1).V0("android");
                    if (!TextUtils.isEmpty(D0.t0())) {
                        V0.N(D0.t0());
                    }
                    if (!TextUtils.isEmpty(D0.v0())) {
                        V0.Z((String) Preconditions.r(D0.v0()));
                    }
                    if (!TextUtils.isEmpty(D0.h())) {
                        V0.h0((String) Preconditions.r(D0.h()));
                    }
                    if (D0.z() != -2147483648L) {
                        V0.d0((int) D0.z());
                    }
                    V0.k0(D0.g0()).X(D0.c0());
                    String j2 = D0.j();
                    String r0 = D0.r0();
                    if (!TextUtils.isEmpty(j2)) {
                        V0.O0(j2);
                    } else if (!TextUtils.isEmpty(r0)) {
                        V0.H(r0);
                    }
                    V0.z0(D0.p0());
                    zzih Q = this.b.Q(str);
                    V0.R(D0.a0());
                    if (this.a.p() && d().K(V0.a1()) && Q.x() && !TextUtils.isEmpty(null)) {
                        V0.A0(null);
                    }
                    V0.p0(Q.v());
                    try {
                        if (Q.x() && D0.q()) {
                            Pair<String, Boolean> z2 = s().z(D0.t0(), Q);
                            if (D0.q() && z2 != null && !TextUtils.isEmpty((CharSequence) z2.first)) {
                                zzihVar = Q;
                                V0.X0(c((String) z2.first, Long.toString(zzbgVar.Y0)));
                                Object obj = z2.second;
                                if (obj != null) {
                                    V0.U(((Boolean) obj).booleanValue());
                                }
                                e().o();
                                zzfi.zzj.zza x0 = V0.x0(Build.MODEL);
                                e().o();
                                x0.S0(Build.VERSION.RELEASE).v0((int) e().v()).b1(e().w());
                                if (zzihVar.y() && D0.u0() != null) {
                                    V0.T(c((String) Preconditions.r(D0.u0()), Long.toString(zzbgVar.Y0)));
                                }
                                if (!TextUtils.isEmpty(D0.i())) {
                                    V0.M0((String) Preconditions.r(D0.i()));
                                }
                                String t0 = D0.t0();
                                M0 = q().M0(t0);
                                it = M0.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        zzneVar = null;
                                        break;
                                    }
                                    zzneVar = it.next();
                                    if ("_lte".equals(zzneVar.c)) {
                                        break;
                                    }
                                }
                                if (zzneVar != null || zzneVar.e == null) {
                                    zzne zzneVar2 = new zzne(t0, "auto", "_lte", b().a(), 0L);
                                    M0.add(zzneVar2);
                                    q().e0(zzneVar2);
                                }
                                zzfi.zzn[] zznVarArr = new zzfi.zzn[M0.size()];
                                for (i = 0; i < M0.size(); i++) {
                                    zzfi.zzn.zza A = zzfi.zzn.W().y(M0.get(i).c).A(M0.get(i).d);
                                    o().U(A, M0.get(i).e);
                                    zznVarArr[i] = (zzfi.zzn) ((com.google.android.gms.internal.measurement.zzix) A.e0());
                                }
                                V0.g0(Arrays.asList(zznVarArr));
                                o().T(V0);
                                if (zznp.a() && d().s(zzbi.T0)) {
                                    this.b.v(D0, V0);
                                }
                                zzfv b = zzfv.b(zzbgVar);
                                i().M(b.d, q().A0(str));
                                i().V(b, d().y(str));
                                Bundle bundle2 = b.d;
                                bundle2.putLong("_c", 1L);
                                j().F().a("Marking in-app purchase as real-time");
                                bundle2.putLong("_r", 1L);
                                bundle2.putString(CrashlyticsAnalyticsListener.c, zzbgVar.Z);
                                if (i().F0(V0.a1())) {
                                    i().N(bundle2, "_dbg", 1L);
                                    i().N(bundle2, "_r", 1L);
                                }
                                C0 = q().C0(str, zzbgVar.X);
                                if (C0 != null) {
                                    bundle = bundle2;
                                    zzhVar = D0;
                                    zzaVar2 = V0;
                                    zzaVar = I;
                                    bArr = null;
                                    a = new zzbc(str, zzbgVar.X, 0L, 0L, zzbgVar.Y0, 0L, null, null, null, null);
                                    j = 0;
                                } else {
                                    zzaVar = I;
                                    bundle = bundle2;
                                    zzhVar = D0;
                                    zzaVar2 = V0;
                                    bArr = null;
                                    long j3 = C0.f;
                                    a = C0.a(zzbgVar.Y0);
                                    j = j3;
                                }
                                zzbc zzbcVar = a;
                                q().U(zzbcVar);
                                zzaz zzazVar = new zzaz(this.a, zzbgVar.Z, str, zzbgVar.X, zzbgVar.Y0, j, bundle);
                                z = zzfi.zze.Y().F(zzazVar.d).D(zzazVar.b).z(zzazVar.e);
                                it2 = zzazVar.f.iterator();
                                while (it2.hasNext()) {
                                    String next = it2.next();
                                    zzfi.zzg.zza A2 = zzfi.zzg.Y().A(next);
                                    Object I0 = zzazVar.f.I0(next);
                                    if (I0 != null) {
                                        o().S(A2, I0);
                                        z.A(A2);
                                    }
                                }
                                zzaVar3 = zzaVar2;
                                zzaVar3.C(z).D(zzfi.zzk.F().v(zzfi.zzf.F().v(zzbcVar.c).w(zzbgVar.X)));
                                zzaVar3.G(p().z(zzhVar.t0(), Collections.EMPTY_LIST, zzaVar3.h1(), Long.valueOf(z.H()), Long.valueOf(z.H())));
                                if (z.L()) {
                                    zzaVar3.w0(z.H()).f0(z.H());
                                }
                                long i0 = zzhVar.i0();
                                i2 = (i0 > 0L ? 1 : (i0 == 0L ? 0 : -1));
                                if (i2 != 0) {
                                    zzaVar3.o0(i0);
                                }
                                m0 = zzhVar.m0();
                                if (m0 == 0) {
                                    zzaVar3.s0(m0);
                                } else if (i2 != 0) {
                                    zzaVar3.s0(i0);
                                }
                                m = zzhVar.m();
                                if (zzps.a() && d().B(str, zzbi.y0) && m != null) {
                                    zzaVar3.Y0(m);
                                }
                                zzhVar.p();
                                zzaVar3.j0((int) zzhVar.k0()).L0(82001L).I0(b().a()).b0(true);
                                if (d().s(zzbi.C0)) {
                                    this.b.A(zzaVar3.a1(), zzaVar3);
                                }
                                zzfi.zzi.zza zzaVar4 = zzaVar;
                                zzaVar4.w(zzaVar3);
                                zzh zzhVar2 = zzhVar;
                                zzhVar2.j0(zzaVar3.V());
                                zzhVar2.f0(zzaVar3.P());
                                q().V(zzhVar2);
                                q().T0();
                                return o().g0(((zzfi.zzi) ((com.google.android.gms.internal.measurement.zzix) zzaVar4.e0())).k());
                            }
                        }
                        return o().g0(((zzfi.zzi) ((com.google.android.gms.internal.measurement.zzix) zzaVar4.e0())).k());
                    } catch (IOException e) {
                        j().G().c("Data loss. Failed to bundle and serialize. appId", zzfr.v(str), e);
                        return bArr;
                    }
                    zzihVar = Q;
                    e().o();
                    zzfi.zzj.zza x02 = V0.x0(Build.MODEL);
                    e().o();
                    x02.S0(Build.VERSION.RELEASE).v0((int) e().v()).b1(e().w());
                    if (zzihVar.y()) {
                        V0.T(c((String) Preconditions.r(D0.u0()), Long.toString(zzbgVar.Y0)));
                    }
                    if (!TextUtils.isEmpty(D0.i())) {
                    }
                    String t02 = D0.t0();
                    M0 = q().M0(t02);
                    it = M0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    if (zzneVar != null) {
                    }
                    zzne zzneVar22 = new zzne(t02, "auto", "_lte", b().a(), 0L);
                    M0.add(zzneVar22);
                    q().e0(zzneVar22);
                    zzfi.zzn[] zznVarArr2 = new zzfi.zzn[M0.size()];
                    while (i < M0.size()) {
                    }
                    V0.g0(Arrays.asList(zznVarArr2));
                    o().T(V0);
                    if (zznp.a()) {
                        this.b.v(D0, V0);
                    }
                    zzfv b2 = zzfv.b(zzbgVar);
                    i().M(b2.d, q().A0(str));
                    i().V(b2, d().y(str));
                    Bundle bundle22 = b2.d;
                    bundle22.putLong("_c", 1L);
                    j().F().a("Marking in-app purchase as real-time");
                    bundle22.putLong("_r", 1L);
                    bundle22.putString(CrashlyticsAnalyticsListener.c, zzbgVar.Z);
                    if (i().F0(V0.a1())) {
                    }
                    C0 = q().C0(str, zzbgVar.X);
                    if (C0 != null) {
                    }
                    zzbc zzbcVar2 = a;
                    q().U(zzbcVar2);
                    zzaz zzazVar2 = new zzaz(this.a, zzbgVar.Z, str, zzbgVar.X, zzbgVar.Y0, j, bundle);
                    z = zzfi.zze.Y().F(zzazVar2.d).D(zzazVar2.b).z(zzazVar2.e);
                    it2 = zzazVar2.f.iterator();
                    while (it2.hasNext()) {
                    }
                    zzaVar3 = zzaVar2;
                    zzaVar3.C(z).D(zzfi.zzk.F().v(zzfi.zzf.F().v(zzbcVar2.c).w(zzbgVar.X)));
                    zzaVar3.G(p().z(zzhVar.t0(), Collections.EMPTY_LIST, zzaVar3.h1(), Long.valueOf(z.H()), Long.valueOf(z.H())));
                    if (z.L()) {
                    }
                    long i02 = zzhVar.i0();
                    i2 = (i02 > 0L ? 1 : (i02 == 0L ? 0 : -1));
                    if (i2 != 0) {
                    }
                    m0 = zzhVar.m0();
                    if (m0 == 0) {
                    }
                    m = zzhVar.m();
                    if (zzps.a()) {
                        zzaVar3.Y0(m);
                    }
                    zzhVar.p();
                    zzaVar3.j0((int) zzhVar.k0()).L0(82001L).I0(b().a()).b0(true);
                    if (d().s(zzbi.C0)) {
                    }
                    zzfi.zzi.zza zzaVar42 = zzaVar;
                    zzaVar42.w(zzaVar3);
                    zzh zzhVar22 = zzhVar;
                    zzhVar22.j0(zzaVar3.V());
                    zzhVar22.f0(zzaVar3.P());
                    q().V(zzhVar22);
                    q().T0();
                }
            } catch (SecurityException e2) {
                j().F().b("app instance id encryption failed", e2.getMessage());
                return new byte[0];
            } catch (SecurityException e3) {
                j().F().b("Resettable device id encryption failed", e3.getMessage());
                return new byte[0];
            } finally {
                q().R0();
            }
        }
    }
}
