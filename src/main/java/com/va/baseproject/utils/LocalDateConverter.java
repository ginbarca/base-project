package com.va.baseproject.utils;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author anhnv
 * @version 1.0
 */
@SuppressWarnings("UnusedDeclaration")
@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

  @Override
  public Date convertToDatabaseColumn(LocalDate attribute) {
    return attribute == null ? null : Date.valueOf(attribute);
  }

  @Override
  public LocalDate convertToEntityAttribute(Date dbData) {
    return dbData == null ? null : dbData.toLocalDate();
  }
}
