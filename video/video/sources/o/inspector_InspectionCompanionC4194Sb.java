package o;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.widget.AppCompatButton;
import java.util.function.IntFunction;
import o.OL1;

/* renamed from: o.Sb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class inspector.InspectionCompanionC4194Sb implements InspectionCompanion {
    public boolean a = false;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    /* renamed from: o.Sb$a */
    /* loaded from: classes.dex */
    public class a implements IntFunction<String> {
        public a() {
        }

        @Override // java.util.function.IntFunction
        /* renamed from: a */
        public String apply(int i) {
            if (i != 0) {
                if (i != 1) {
                    return String.valueOf(i);
                }
                return "uniform";
            }
            return "none";
        }
    }

    /* renamed from: a */
    public void readProperties(AppCompatButton appCompatButton, PropertyReader propertyReader) {
        if (this.a) {
            propertyReader.readInt(this.b, appCompatButton.getAutoSizeMaxTextSize());
            propertyReader.readInt(this.c, appCompatButton.getAutoSizeMinTextSize());
            propertyReader.readInt(this.d, appCompatButton.getAutoSizeStepGranularity());
            propertyReader.readIntEnum(this.e, appCompatButton.getAutoSizeTextType());
            propertyReader.readObject(this.f, appCompatButton.getBackgroundTintList());
            propertyReader.readObject(this.g, appCompatButton.getBackgroundTintMode());
            propertyReader.readObject(this.h, appCompatButton.getCompoundDrawableTintList());
            propertyReader.readObject(this.i, appCompatButton.getCompoundDrawableTintMode());
            return;
        }
        throw C3412Kb.a();
    }

    public void mapProperties(PropertyMapper propertyMapper) {
        int mapInt;
        int mapInt2;
        int mapInt3;
        int mapIntEnum;
        int mapObject;
        int mapObject2;
        int mapObject3;
        int mapObject4;
        mapInt = propertyMapper.mapInt("autoSizeMaxTextSize", OL1.b.T);
        this.b = mapInt;
        mapInt2 = propertyMapper.mapInt("autoSizeMinTextSize", OL1.b.U);
        this.c = mapInt2;
        mapInt3 = propertyMapper.mapInt("autoSizeStepGranularity", OL1.b.W);
        this.d = mapInt3;
        mapIntEnum = propertyMapper.mapIntEnum("autoSizeTextType", OL1.b.X, new a());
        this.e = mapIntEnum;
        mapObject = propertyMapper.mapObject("backgroundTint", OL1.b.b0);
        this.f = mapObject;
        mapObject2 = propertyMapper.mapObject("backgroundTintMode", OL1.b.c0);
        this.g = mapObject2;
        mapObject3 = propertyMapper.mapObject("drawableTint", OL1.b.l1);
        this.h = mapObject3;
        mapObject4 = propertyMapper.mapObject("drawableTintMode", OL1.b.m1);
        this.i = mapObject4;
        this.a = true;
    }
}
