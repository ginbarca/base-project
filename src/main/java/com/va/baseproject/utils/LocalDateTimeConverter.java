package com.va.baseproject.utils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @author anhnv
 * @version 1.0
 */
@SuppressWarnings("UnusedDeclaration")
@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {

  @Override
  public Timestamp convertToDatabaseColumn(LocalDateTime attribute) {
    return attribute == null ? null : Timestamp.valueOf(attribute);
  }

  @Override
  public LocalDateTime convertToEntityAttribute(Timestamp dbData) {
    return dbData == null ? null : dbData.toLocalDateTime();
  }
}
