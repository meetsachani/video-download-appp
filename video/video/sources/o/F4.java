package o;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class F4 {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 32;
    public static final int f = -1;
    public static final int g = 2;
    public static final int h = 4;
    public static final int i = 8;
    public static final int j = 16;
    public static final int k = 32;

    public static String a(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        return "UNKNOWN";
                    }
                    return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
                }
                return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
            }
            return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
        }
        return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    public static String b(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C6566gU0.f);
        while (i2 > 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i2);
            i2 &= ~numberOfTrailingZeros;
            if (sb.length() > 1) {
                sb.append(C6566gU0.h);
            }
            if (numberOfTrailingZeros != 1) {
                if (numberOfTrailingZeros != 2) {
                    if (numberOfTrailingZeros != 4) {
                        if (numberOfTrailingZeros != 8) {
                            if (numberOfTrailingZeros == 16) {
                                sb.append("FEEDBACK_GENERIC");
                            }
                        } else {
                            sb.append("FEEDBACK_VISUAL");
                        }
                    } else {
                        sb.append("FEEDBACK_AUDIBLE");
                    }
                } else {
                    sb.append("FEEDBACK_HAPTIC");
                }
            } else {
                sb.append("FEEDBACK_SPOKEN");
            }
        }
        sb.append(C6566gU0.g);
        return sb.toString();
    }

    public static String c(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        if (i2 != 16) {
                            if (i2 != 32) {
                                return null;
                            }
                            return "FLAG_REQUEST_FILTER_KEY_EVENTS";
                        }
                        return "FLAG_REPORT_VIEW_IDS";
                    }
                    return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
                }
                return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
            }
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        return "DEFAULT";
    }

    @JR1(expression = "info.getCapabilities()")
    @Deprecated
    public static int d(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @JR1(expression = "info.loadDescription(packageManager)")
    @Deprecated
    public static String e(AccessibilityServiceInfo accessibilityServiceInfo, PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}
