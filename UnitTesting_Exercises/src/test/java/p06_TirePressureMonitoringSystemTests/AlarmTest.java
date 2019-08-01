package p06_TirePressureMonitoringSystemTests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import p06_TirePressureMonitoringSystem.Alarm;
import p06_TirePressureMonitoringSystem.Sensor;

import java.lang.reflect.Field;

public class AlarmTest {

    @Test
    public void alarmShouldBeOnIfOutOfScope() {
        Alarm alarm = new Alarm();
        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(16d);
        alarm.setSensor(sensor);
        alarm.check();

        Assert.assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void alarmShouldBeOffIfInScope() throws NoSuchFieldException, IllegalAccessException {
        Alarm alarm = new Alarm();

        Field sensorField = Alarm.class.getDeclaredField("sensor");

        sensorField.setAccessible(true);

        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(18d);

        sensorField.set(alarm,sensor);

        Assert.assertFalse(alarm.getAlarmOn());

    }
}
