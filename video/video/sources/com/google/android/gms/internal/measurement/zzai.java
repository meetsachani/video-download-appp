package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import o.C2638Cg0;
import o.LS2;

/* loaded from: classes3.dex */
public final class zzai implements zzaq {
    public final Double X;

    public zzai(Double d) {
        if (d == null) {
            this.X = Double.valueOf(Double.NaN);
        } else {
            this.X = d;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return new zzai(this.X);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double d() {
        return this.X;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String e() {
        BigDecimal a;
        int scale;
        if (Double.isNaN(this.X.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.X.doubleValue())) {
            if (this.X.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(this.X.doubleValue());
        if (valueOf.signum() == 0) {
            a = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            a = LS2.a(valueOf);
        }
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (a.scale() > 0) {
            scale = a.precision();
        } else {
            scale = a.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(a);
        int indexOf = format.indexOf(C2638Cg0.S4);
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return a.toPlainString();
            }
            return format.replace("E-", "e-").replace(C2638Cg0.S4, "e+");
        }
        return format;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        return this.X.equals(((zzai) obj).X);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean f() {
        boolean z;
        if (!Double.isNaN(this.X.doubleValue()) && this.X.doubleValue() != 0.0d) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> h() {
        return null;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq i(String str, zzh zzhVar, List<zzaq> list) {
        if ("toString".equals(str)) {
            return new zzas(e());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", e(), str));
    }

    public final String toString() {
        return e();
    }
}
